/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExThree;

/**
 *
 * @author Hungg
 */
public class HomeTheaterFacade {
       private TV tv;
    private SoundSystem soundSystem;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade() {
        tv = new TV();
        soundSystem = new SoundSystem();
        dvdPlayer = new DVDPlayer();
    }

    public void watchMovie() {
        System.out.println("Chuan bi xem phim");
        tv.on();
        soundSystem.on();
        dvdPlayer.on();
        System.out.println("Bat dau xem phim");
    }

    // Demo
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.watchMovie();
    }
}
