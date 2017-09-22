/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

import java.util.Scanner;

/**
 *
 * @author Vina
 */
public class TotalN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int input = sc.nextInt();
        int total = 0;
        int nilai =0;

        if (input > 0) {
            for (int i = 1; i <= input; i++) {
                nilai = sc.nextInt();
                total = total + nilai;

            }
            System.out.println("Jumlah = " + total);
        } else {
            System.out.println("tidak");
        }
    }

}
