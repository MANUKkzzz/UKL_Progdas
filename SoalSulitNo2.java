/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal.sulit.no.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class SoalSulitNo2 {


   

 

    public static void main(String[] args) {
        // Contoh array
        int[] array = {5, -3, 7, 9, -1};

        // Panggil fungsi untuk mendeteksi dan mengubah elemen positif menjadi negatif
        ArrayList<Integer> elemenNegatif = cariElemenNegatifDariPositif(array);

        // Menampilkan hasil
        if (elemenNegatif.isEmpty()) {
            System.out.println("Array tidak mengandung elemen positif.");
        } else {
            System.out.print("Array mengandung elemen negatif: ");
            for (int elemen : elemenNegatif) {
                System.out.print(elemen + " ");
            }
        }
    }

    // Fungsi untuk mencari elemen positif dan mengubahnya menjadi negatif
    public static ArrayList<Integer> cariElemenNegatifDariPositif(int[] array) {
        ArrayList<Integer> negatif = new ArrayList<>();
        for (int elemen : array) {
            if (elemen > 0) {
                negatif.add(-elemen); // Mengubah elemen positif menjadi negatif
            }
        }
        return negatif;
    }
}
