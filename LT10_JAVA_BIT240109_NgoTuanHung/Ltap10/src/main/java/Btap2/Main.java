/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Btap2;

/**
 *
 * @author Hungg
 */
public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new MediaAdapter();

        player.play("vlc", "song.vlc");   
        player.play("mp3", "song.mp3");   
    }
}