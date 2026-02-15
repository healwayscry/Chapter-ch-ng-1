/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExFour;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author Hungg
 */
public class Main {
     public static void main(String[] args) {

        List<String> money = Arrays.asList("$10", "$20", "$50");

        Function<String, Integer> parseMoney =
                s -> Integer.parseInt(s.replace("$", ""));

        List<Integer> numbers = money.stream()
                .map(parseMoney)
                .collect(Collectors.toList());

        System.out.println("Danh sach so: " + numbers);
    }   
}
