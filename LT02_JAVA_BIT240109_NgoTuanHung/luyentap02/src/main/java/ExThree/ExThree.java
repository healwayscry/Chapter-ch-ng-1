/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExThree;

import java.util.concurrent.CompletableFuture;

/**
 *
 * @author Hungg
 */
public class ExThree {

    public static void main(String[] args) {

        CompletableFuture<String> task1 =
                CompletableFuture.supplyAsync(() -> {
                    try { Thread.sleep(2000); } catch (Exception e) {}
                    System.out.println("Xac thuc khach hang xong");
                    return "Customer OK";
                });

        CompletableFuture<String> task2 =
                CompletableFuture.supplyAsync(() -> {
                    try { Thread.sleep(3000); } catch (Exception e) {}
                    System.out.println("Xuat ve xong");
                    return "Ticket OK";
                });

        CompletableFuture<String> result =
                task1.thenCombine(task2, (a, b) -> "Dat ve hoan tat");

        System.out.println(result.join());
    }
}