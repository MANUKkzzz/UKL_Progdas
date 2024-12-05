/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal.mudah.no.pkg3;

public class SoalMudahNo3 {
    public static void main(String[] args) {
        // Memulai loop dari 50 hingga 1
        for (int i = 50; i >= 1; i--) {
            // Memeriksa apakah i habis dibagi 3
            if (i % 3 == 0) {
                // Jika ya, cetak pesan ini
                System.out.println(i + ". saya angkatan 33");
            } 
            // Memeriksa apakah sisa pembagian i dengan 3 adalah 1
            else if (i % 3 == 1) {
                // Jika ya, cetak pesan ini
                System.out.println(i + ". saya anak moklet");
            } 
            // Jika tidak memenuhi kedua kondisi di atas, berarti sisa pembagian adalah 2
            else {
                // Cetak pesan ini
                System.out.println(i + ". saya anak wikusama");
            }
        }
        // Setelah loop selesai, cetak pesan ini
        System.out.println("1. saya senang");
    }
}