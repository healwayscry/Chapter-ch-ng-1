/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExFour;

import java.util.concurrent.CompletableFuture;

/**
 *
 * @author Hungg
 */
public class Main {

    public static void main(String[] args) {

        CompletableFuture<Void> checkProduct =
                CompletableFuture.runAsync(() -> {
                    sleep(2000);
                    System.out.println("Check san pham dat hang");
                });

        CompletableFuture<Void> payment =
                CompletableFuture.runAsync(() -> {
                    sleep(3000);
                    System.out.println("Thanh toan thanh cong");
                });

        CompletableFuture<Void> shipping =
                CompletableFuture.runAsync(() -> {
                    sleep(2500);
                    System.out.println("Giao hang thanh cong");
                });

        CompletableFuture.allOf(checkProduct, payment, shipping)
                .thenRun(() ->
                        System.out.println("Don hang da duoc xu ly thanh cong")
                )
                .join();
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}