/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExTwo;

/**
 *
 * @author Hungg
 */
public class Computer {

    private String HDD;
    private String RAM;
    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    public void showInfo() {
        System.out.println(HDD + " - " + RAM + " - Bluetooth: " + isBluetoothEnabled);
    }

    public static class ComputerBuilder {

        private String HDD;
        private String RAM;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setBluetoothEnabled(boolean value) {
            this.isBluetoothEnabled = value;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}