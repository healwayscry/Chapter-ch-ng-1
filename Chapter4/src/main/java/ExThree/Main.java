/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExThree;

import java.util.function.Predicate;

/**
 *
 * @author Hungg
 */
public class Main {
       public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println("4 la so chan? " + isEven.test(4));
        System.out.println("5 la so chan? " + isEven.test(5));
    } 
}
