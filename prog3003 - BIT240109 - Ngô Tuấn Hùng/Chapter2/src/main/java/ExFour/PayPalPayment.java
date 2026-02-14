/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExFour;

/**
 *
 * @author Hungg
 */
public class PayPalPayment implements PaymentStrategy {
      @Override
    public void pay(int amount) {
        System.out.println("Thanh toan " + amount + " Voi paypal");
    }
}
