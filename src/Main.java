/**
 *
 * Author: Joshua Zamora
 * Class: Object Oriented Programming
 * Date: 9/29/18
 * UPDATED: 12/06/2018
 * FILE: Main .java Class.
 * Step 20
 */

import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {

    Widget w1 = new Widget("Widget 1");
    System.out.println(w1.toString());
    Widget w2 = new Widget("Widget 2");
    System.out.println(w2.toString());

      /*
      for (ItemType it : ItemType.values()) {
      System.out.println(it + " " + it.code);
    }
    AudioPlayerDriver.testAudioPlayer();
    ScreenDriver.testScreen();
    MoviePlayerDriver.testMoviePlayer();
    PlayerDriver.testPlayer();
      */

    ArrayList<Product> arrayList = new ArrayList<>();
    arrayList.add(w2);
    arrayList.add(w1);

    CollectionsTest.print(arrayList);

    Collections.sort(arrayList);

    CollectionsTest.print(arrayList);
  }
}