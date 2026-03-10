/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExTwo;

/**
 *
 * @author Hungg
 */
public class ExTwo {

    public static void main(String[] args) {

        Computer pc1 = new Computer.ComputerBuilder("1TB", "16GB")
                .setBluetoothEnabled(true)
                .build();

        Computer pc2 = new Computer.ComputerBuilder("500GB", "8GB")
                .build();

        pc1.showInfo();
        pc2.showInfo();
    }
}