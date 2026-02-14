/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExThree;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

/**
 *
 * @author Hungg
 */
public class Main {

    public static void main(String[] args) {

        CompletableFuture.supplyAsync(() ->
                Arrays.asList(1, 2, 5, 3, 100)
        )
        .thenApply(list ->
                list.stream()
                        .filter(n -> n % 2 != 0)
                        .sorted()
                        .collect(Collectors.toList())
        )
        .thenApply(result ->
                "Ket qua: " + result
        )
        .thenAccept(System.out::println)
        .join();
    }
}