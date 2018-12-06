/**
 *
 * Author: Joshua Zamora
 * Class: Object Oriented Programming
 * Date: 9/29/18
 * UPDATED: 12/06/2018
 * FILE: PlayerDriver .java class.
 * Step 20
 */

import java.util.ArrayList;

public class PlayerDriver {

  public static void testPlayer() {
    MoviePlayer moviePlayer = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22),
        MonitorType.LED);

    AudioPlayer audioPlayer = new AudioPlayer("Walkman",
        "MP4");

    System.out.print(moviePlayer);

    ArrayList<MultimediaControl> arrayList = new ArrayList<>();
    arrayList.add(audioPlayer);
    arrayList.add(moviePlayer);

    for (MultimediaControl element : arrayList) {
      element.next();
      element.play();
      element.previous();
      element.stop();
    }

    /*
    audioPlayer.next();
    audioPlayer.play();
    audioPlayer.previous();
    audioPlayer.stop();
    moviePlayer.next();
    moviePlayer.play();
    moviePlayer.previous();
    moviePlayer.stop();
    */

  }

}