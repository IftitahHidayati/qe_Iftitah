/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalEksplorasi;             

/**
 *
 * @author WINDOWS 11
 */
public class SoalEksplorasi {

    private static String encrypt(String s) {
        //TODO: complete this code
        char[] kr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
         'M', +'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        String str = "";
        char[] Array1 = null;
        int geser = 10;
        Array1 = (s.toCharArray());

        for (char c1 : Array1) {
            for (int i = 0; i <= 25; i++) {
                if (c1 == kr[i]) {
                    i = i + (geser);
                    if (i >= 26) {
                        i = i - 26;
                    }
                    c1 = kr[i];
                    str = str + c1;
                }
            }
        }

        return ("Output  : " + str);

    }

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("       PERGESERAN 10 URUTAN ALPHABET");
        System.out.println("===========================================");
        System.out.println("Input   : SEPULSA OKE");
        System.out.println(encrypt("SEPULSA OKE")); // COZEVCK YUO
        System.out.println("-----------------------------");
        System.out.println("Input   : ALTERRA ACADEMY");
        System.out.println(encrypt("ALTERRA ACADEMY")); // KVDOBBK KMKNOWI
        System.out.println("-----------------------------");
        System.out.println("Input   : INDONESIA");
        System.out.println(encrypt("INDONESIA")); // SXNYXOCSK
        System.out.println("-----------------------------");
        System.out.println("Input   : GOLANG");
        System.out.println(encrypt("GOLANG")); // QYVKXQ
        System.out.println("-----------------------------");
        System.out.println("Input   : PROGRAMMER");
        System.out.println(encrypt("PROGRAMMER")); // ZBYQBKWWOB
    }
}
