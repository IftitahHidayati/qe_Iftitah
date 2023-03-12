/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalPrioritas2;

/**
 *
 * @author WINDOWS 11
 */
public class Soal2_Prioritas2 {

    public static void printAsterisk(int n) {
        // TODO: complete this code
        for (int i = 1; i <= n+1; i++) { // perulangan untuk tinggi dari piramida
            for (int j = i; j < n+1; j++) { // perulangan untuk pembuatan spasi
                System.out.print(" ");
            }
            for (int k = 0; k <= (i) - 2; k++) { // perulangan mencetak bintang untuk membentuk piramida
                System.out.print("* ");
            }
            System.out.println(); // untuk pindah baris
        }
    }

    public static void main(String[] args) {
        printAsterisk(5);
    }
}
