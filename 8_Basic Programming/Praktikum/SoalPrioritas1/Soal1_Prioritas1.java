/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalPrioritas1;

/**
 *
 * @author WINDOWS 11
 */
public class Soal1_Prioritas1 {

    public static void main(String[] args) {
        //segtiga
        float alas = 20;
        float tinggi = 25;

        // TODO : hitung luas segitiga
        float luasSegitiga = (alas * tinggi) / 2;

        // Cetak hasil
        System.out.println("==========================================");
        System.out.println("    HITUNG LUAS SEGITIGA");
        System.out.println("---------------");
        System.out.println("DIKETAHUI : ");
        System.out.println("alas   : " + alas);
        System.out.println("tinggi : " + tinggi);
        System.out.println("---------------");
        System.out.println("RUMUS");
        System.out.println("Luas Segitiga = (alas*tinggi)/2");
        System.out.println("---------------");
        System.out.println("HASIL");
        System.out.println("Luas Segitiga = (" + alas + " * " + tinggi + ")/2");
        System.out.println("Luas Segitiga = " + luasSegitiga);
        System.out.println("==========================================");

        // Persegi Panjang
        float panjang = 40;
        float lebar = 6;

        // TODO : hitung luas persegi panjang
        float luasPersegiPanjang = panjang * lebar;

        // Cetak hasil
        System.out.println("HITUNG LUAS PERSEGI PANJANG");
        System.out.println("---------------");
        System.out.println("DIKETAHUI : ");
        System.out.println("panjang :" + panjang);
        System.out.println("lebar   :" + lebar);
        System.out.println("---------------");
        System.out.println("RUMUS");
        System.out.println("Luas Persegi Panjang = panjang * lebar");
        System.out.println("---------------");
        System.out.println("HASIL");
        System.out.println("Luas Persegi Panjang = " + panjang + " * " + lebar);
        System.out.println("Luas Persegi Panjang = " + luasPersegiPanjang);
        System.out.println("==========================================");

        // Lingkaran
        double jari2 = 7;

        // TODO : hitung luas lingkaran
        double luasLingkaran = 3.14 * jari2 * jari2;

        // Cetak hasil
        System.out.println("    HITUNG LUAS LINGKARAN");
        System.out.println("---------------");
        System.out.println("DIKETAHUI : ");
        System.out.println("jari-jari (r) :" + jari2);
        System.out.println("phi           : 3.14");
        System.out.println("---------------");
        System.out.println("RUMUS");
        System.out.println("Luas Lingkaran = phi(3.14) × r × r");
        System.out.println("---------------");
        System.out.println("HASIL");
        System.out.println("Luas Lingkaran = 3.14 * " + jari2 + " * " + jari2);
        System.out.println("Luas Lingkaran = " + luasLingkaran);
        System.out.println("==========================================");
    }
}
