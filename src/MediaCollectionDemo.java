/**
 *
 * Author: Joshua Zamora
 * Class: Object Oriented Programming
 * Date: 9/29/18
 * UPDATED: 10/25/2018
 * FILE: class .java file named MediaCollectionDemo
 * Steps 13, 14, 15, and 16
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MediaCollectionDemo {

  private static void print(List<Product> list) {
    for (Product p : list) {
      System.out.println(p + "\n");
    }
  }

  public static void main(String[] args) {
    ArrayList<Product> list = new ArrayList<Product>();

    list.add(new AudioPlayer("my audio player 3", "audio spec1"));
    list.add(new MoviePlayer("my movie player 3"));

    list.add(new AudioPlayer("my audio player 1", "audio spec1"));
    list.add(new MoviePlayer("my movie player 1", new Screen("1024x768", 70, 20), MonitorType.LED));

    list.add(new AudioPlayer("my audio player 2", "audio spec1"));
    list.add(new MoviePlayer("my movie player 2"));
    // Collection sort method that shows its uses
    Collections.sort(list);

    print(list);

  }
}