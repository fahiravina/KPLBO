/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

/**
 *
 * @author Vina
 */
public class Calculator1 {

    int result;

    public void penjumlahan(int num1, int num2) {
        result = num1 + num2;
    }
    
    public void pengurangan(int num1, int num2) {
        result = num1 - num2;
    }
    

    public int getResult() {
        return result;
    }
   
    

    public static void main(String[] args) {
        
        Calculator1 c = new Calculator1();
        int a = 3;
        int b = 6;
        
        System.out.println("num1 = "+a);
        System.out.println("num2 = "+b);
        c.penjumlahan(a, b);
        System.out.println("Hasil penjumlahan = "+c.getResult());
        c.pengurangan(a, b);
        System.out.println("Hasil pengurangan = "+c.getResult());

    }

}
