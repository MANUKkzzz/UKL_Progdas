/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal.sedang.no.pkg2;

import java.util.Scanner;


public class SoalSedangNo2 {






 

    // Fungsi untuk menghitung luas permukaan bola
    public static double hitungLuasPermukaanBola(double radius) {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan jari-jari bola (r): ");
        double radius = scanner.nextDouble();

        // Menghitung luas permukaan bola
        double luasPermukaan = hitungLuasPermukaanBola(radius);

        // Menampilkan hasil
        System.out.printf("Luas permukaan bola dengan jari-jari %.2f adalah %.2f%n", radius, luasPermukaan);

        // Menutup scanner
        scanner.close();
    }
}