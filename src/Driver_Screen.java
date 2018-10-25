/**
 *
 * Author: Joshua Zamora
 * Class: Object Oriented Programming
 * Date: 9/29/2018
 * UPDATED: 10/25/2018
 * FILE: .java Driver class named Driver_Screen
 */

public class Driver_Screen {
  public static void main(String[] args){
    Screen screen = new Screen();
    screen.Resolution = "1920x1080";
    screen.refreshRate = 60;
    screen.responseTime = 2;

    System.out.println(screen);
  }

}