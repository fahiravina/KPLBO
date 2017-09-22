/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

import java.util.Scanner;

/**
 *
 * @author Vina
 */
public class IndeksNilaiMatkul {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.print("Masukkan nilai : ");
        input = sc.nextInt();

        if (input > 81 && input < 100) {
            System.out.println("A");
        } else if (input > 76 && input < 80) {
            System.out.println("AB");
        } else if (input > 56 && input < 75) {
            System.out.println("B");
        } else if (input > 51 && input < 55) {
            System.out.println("BC");
        } else if (input > 41 && input < 50) {
            System.out.println("C");
        } else if (input > 21 && input < 40) {
            System.out.println("D");
        } else if (input > 0 && input < 20) {
            System.out.println("E");
        } else if (input > 100) {
            System.out.println("Nilai di luar jangkauan");
        } else {
            System.out.println("Nilai harus diisi");
        }
    }

}
