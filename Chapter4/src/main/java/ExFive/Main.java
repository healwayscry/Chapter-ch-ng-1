/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExFive;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 *
 * @author Hungg
 */
public class Main {
    public static void main(String[] args) {

        Supplier<Double> randomSupplier =
                () -> Math.random() * 100;

        Consumer<Double> printConsumer =
                n -> System.out.println("So may man: " + n);

        Double luckyNumber = randomSupplier.get();
        printConsumer.accept(luckyNumber);
    }    
}
