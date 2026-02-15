/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExOne;

@FunctionalInterface
interface MathOperation {
    int compute(int a, int b);
}

/**
 *
 * @author Hungg
 */
public class Main {
    public static void main(String[] args) {

        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

        int a = 10;
        int b = 5;

        System.out.println("cong: " + add.compute(a, b));
        System.out.println("tru: " + subtract.compute(a, b));
        System.out.println("nhan: " + multiply.compute(a, b));
        System.out.println("chia: " + divide.compute(a, b));
    }
}
