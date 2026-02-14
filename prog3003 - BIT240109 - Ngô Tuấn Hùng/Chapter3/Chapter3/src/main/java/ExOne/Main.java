/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExOne;

/**
 *
 * @author Hungg
 */
public class Main {

    public static void main(String[] args) {

        WorkerThread thread = new WorkerThread();
        thread.start();

        Thread runnableThread = new Thread(new WorkerRunnable());
        runnableThread.start();
    }
}
