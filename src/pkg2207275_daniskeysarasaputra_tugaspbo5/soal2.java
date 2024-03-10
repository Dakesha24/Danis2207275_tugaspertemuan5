/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2207275_daniskeysarasaputra_tugaspbo5;

/**
 *
 * Danis Keysara Saputra (2207275)
 */
import java.util.Scanner;

public class soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca batas awal dan akhir
        System.out.print("Masukkan batas awal: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int b = scanner.nextInt();

        System.out.println("Bilangan ganjil dari " + a + " hingga " + b + " adalah:");
        int jumlahGanjil = hitungDanTampilkanGanjil(a, b);

        System.out.println("\nTotal bilangan ganjil: " + jumlahGanjil);
    }

    public static int hitungDanTampilkanGanjil(int a, int b) {
        int jumlahGanjil = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                jumlahGanjil++;
            }
        }
        return jumlahGanjil;
    }
}
