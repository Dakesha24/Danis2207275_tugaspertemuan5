/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2207275_daniskeysarasaputra_tugaspbo5;

/**
 *
 * Danis Keysara Saputra (220275)
 */
import java.util.Scanner;

public class soal3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        int hasilFaktorial = hitungFaktorial(n);

        System.out.print(n + "! = ");
        for (int i = 1; i <= n; i++) {
            if (i > 1) {
                System.out.print(" x ");
            }
            System.out.print(i);
        }
        System.out.println(" = " + hasilFaktorial);
    }

    public static int hitungFaktorial(int n) {
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }
}