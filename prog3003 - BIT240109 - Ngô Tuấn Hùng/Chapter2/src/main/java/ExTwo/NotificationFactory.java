package ExTwo;


import ExTwo.EmailNotification;
import ExTwo.Notification;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hungg
 */
public class NotificationFactory {
     public static Notification createNotification(String channel) {

        if (channel.equalsIgnoreCase("Sms")) {
            return new SmsNotification();
        } else if (channel.equalsIgnoreCase("email")) {
            return new EmailNotification();
        }

        throw new IllegalArgumentException("kenh khong hop le");
    }

    public static void main(String[] args) {

        Notification notification = NotificationFactory.createNotification("sms");
        notification.notifyUser();

        Notification notification2 = NotificationFactory.createNotification("email");
        notification2.notifyUser();
    }
}
