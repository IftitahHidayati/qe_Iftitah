/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalPrioritas2;


/**
 *
 * @author WINDOWS 11
 */
public class Soal1_Prioritas2 {

    public static void drawXYZ(int n) {
        // TODO: complete this code
        System.out.println("=============================================");
        for (int j = 1; j <= (n * n); j++) {
            if (j % 3 == 0) {
                System.out.print(" X ");
            } else if (j % 2 == 1) {
                System.out.print(" Y ");
            } else {
                System.out.print(" Z ");
            }
            
            if (j%5 == 0) {
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        drawXYZ(5);

    }
}
