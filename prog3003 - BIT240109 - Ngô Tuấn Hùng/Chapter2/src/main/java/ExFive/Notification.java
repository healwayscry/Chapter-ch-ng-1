/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExFive;

/**
 *
 * @author Hungg
 */
public class Notification {

    private MessageService messageService;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void send(String message) {
        messageService.sendMessage(message);
    }
// main demo
    public static void main(String[] args) {

        Notification notification = new Notification();

        // Email
        notification.setMessageService(new EmailService());
        notification.send("Xin chao ");

        // SMS
        notification.setMessageService(new SMSService());
        notification.send("Heluu");
    }
}
