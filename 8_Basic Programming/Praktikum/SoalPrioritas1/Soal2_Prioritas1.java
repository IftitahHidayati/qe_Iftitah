/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalPrioritas1;

/**
 *
 * @author WINDOWS 11
 */
public class Soal2_Prioritas1 {

    public static void main(String[] args) {
        // Input Sampel 1
        int hargaBeli1 = 15000;
        int hargaJual1 = 30000;
        // Input Sampel 2
        int hargaBeli2 = 12000;
        int hargaJual2 = 9000;
        //Input Sampel 3
        int hargaBeli3 = 12000;
        int hargaJual3 = 12000;

        // TODO : Cek apakah hasil penjualan mengalami keuntungan / kerugian
        System.out.println("============================");
        System.out.println("A. Sampel 1");
        System.out.println("--------------------");
        System.out.println("Input");
        System.out.println("Harga beli  = " + hargaBeli1);
        System.out.println("Harga jual  = " + hargaJual1);
        // menghitung untung or rugi
        int untungOrRugi1 = hargaJual1 - hargaBeli1;
        // mengecek untung or rugi or sama
        System.out.println("Output");
        if (hargaJual1 > hargaBeli1) {
            System.out.println("Untung sebesar : " + untungOrRugi1);
        } else if (hargaJual1 < hargaBeli1) {
            System.out.println("Rugi sebesar : " + untungOrRugi1);
        } else {
            System.out.println("Sama saja");
        }
        System.out.println("============================");
        System.out.println("B. Sampel 2");
        System.out.println("--------------------");
        System.out.println("Input");
        System.out.println("Harga beli  = " + hargaBeli2);
        System.out.println("Harga jual  = " + hargaJual2);
        // menghitung untung or rugi
        int untungOrRugi2 = hargaJual2 - hargaBeli2;
        // mengecek untung or rugi or sama
        System.out.println("Output");
        if (hargaJual2 > hargaBeli2) {
            System.out.println("Untung sebesar : " + untungOrRugi2);
        } else if (hargaJual2 < hargaBeli2) {
            System.out.println("Rugi sebesar : " + untungOrRugi2);
        } else {
            System.out.println("Sama saja");
        }
        System.out.println("============================");
        System.out.println("C. Sampel 3");
        System.out.println("--------------------");
        System.out.println("Diketahui");
        System.out.println("Harga beli  = " + hargaBeli3);
        System.out.println("Harga jual  = " + hargaJual3);
        // menghitung untung or rugi
        System.out.println("Output");
        int untungOrRugi3 = hargaJual3 - hargaBeli3;
        // mengecek untung or rugi
        if (hargaJual3 > hargaBeli3) {
            System.out.println("Untung sebesar : " + untungOrRugi3);
        } else if (hargaJual3 < hargaBeli3) {
            System.out.println("Rugi sebesar : " + untungOrRugi3);
        } else {
            System.out.println("Sama saja");
        }
        System.out.println("============================");
    }
}
