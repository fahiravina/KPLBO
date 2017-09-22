/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

import java.util.Scanner;

/**
 *
 * @author Vina
 */
public class PersegiPanjang2 {

    static double p, l;

    public double hitungLuas() {
        return p * l;
    }

    public double hitungKeliling() {
        return (2 * p + 2 * l);
    }

    public void tampil() {
        System.out.println("Panjang : " + p);
        System.out.println("Lebar : " + l);
        System.out.println("Luas : " + hitungLuas());
        System.out.println("Keliling : " + hitungKeliling());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Panjang : ");
        p = sc.nextDouble();
        System.out.print("Lebar : ");
        l = sc.nextDouble();

        PersegiPanjang2 pp = new PersegiPanjang2();
        System.out.println("====================");
        pp.tampil();

    }

}
