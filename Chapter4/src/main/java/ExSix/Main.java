/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExSix;

import java.util.Arrays;

/**
 *
 * @author Hungg
 */
public class Main {
    public static void main(String[] args) {

        int sum = Arrays.asList(1, 2, 3, 4, 5, 6)
                .stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, (a, b) -> a + b);

        System.out.println("Tong binh phuong so chan: " + sum);
    }    
}
