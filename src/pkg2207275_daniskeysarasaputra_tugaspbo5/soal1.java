/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2207275_daniskeysarasaputra_tugaspbo5;

/**
 *
 * Danis Keysara Saputra (2207275)
 */
import java.util.Scanner;

public class soal1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = scanner.nextInt();

        int total = hitungDeretTambah(n);

        System.out.println("Hasil penjumlahan deret tambah sampai ke-" + n + " = " + total);
    }

    public static int hitungDeretTambah(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }
}

