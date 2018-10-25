/**
 *
 * Author: Joshua Zamora
 * Class: Object Oriented Programming
 * Date: 9/29/18
 * UPDATED: 10/25/2018
 * FILE: .java file Driver_Class named AudioPlayer
 */

public class Driver_AudioPlayer {
  public static void main(String args[]){
    AudioPlayer audioPlayer = new AudioPlayer("Product",
        "Specification", ItemType.AU);
    audioPlayer.setProductionNumber(1);

    System.out.println(audioPlayer);
  }
}
