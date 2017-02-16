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
public class Calculator {

    int result;

    public void calculate(int num1, int num2) {
        result = num1 + num2;
    }

    public int getResult() {
        return result;
    }

    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();
        calculator.calculate(10,2);
        int hasil = calculator.getResult();
        System.out.println(hasil);

    }

}
