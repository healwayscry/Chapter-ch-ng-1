/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExTwo;

/**
 *
 * @author Hungg
 */
public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            NumberThread t = new NumberThread("Thread-" + i);
            t.start();
        }
    }
}
