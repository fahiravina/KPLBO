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
public class DemoSequence {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 12;
        
        c = a;
        c = c + b;
        b = a - c;
        a = c;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    
}
