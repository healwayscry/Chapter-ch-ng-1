/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExOne;

import java.util.TreeSet;

/**
 *
 * @author Hungg
 */
public class ExOne {

    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>();

        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");

        System.out.println(names);
        System.out.println("First: " + names.first());
        System.out.println("Last: " + names.last());
    }
}
