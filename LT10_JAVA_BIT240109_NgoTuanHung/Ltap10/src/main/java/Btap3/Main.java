/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Btap3;

/**
 *
 * @author Hungg
 */
public class Main {
    public static void main(String[] args) {

        WorkerThread t1 = new WorkerThread();
        t1.start();

        WorkerRunnable r = new WorkerRunnable();
        Thread t2 = new Thread(r);
        t2.start();
    }
}
