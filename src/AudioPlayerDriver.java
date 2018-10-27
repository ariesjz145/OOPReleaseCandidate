/**
 *
 * Author: Joshua Zamora
 * Class: Object Oriented Programming
 * Date: 9/29/18
 * UPDATED: 10/25/2018
 * FILE: DriverClass .java file named AudioPlayer
 * Step 6
 */

public class AudioPlayerDriver {
  public static void main(String[] args) {
    AudioPlayer player=new AudioPlayer("myplayer", "myspec");
    System.out.println("Created an audio player and calling methods..");
    System.out.println(player);
    player.play();
    player.previous();
    player.next();
    player.stop();
  }
}