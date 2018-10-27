/**
 *
 * Author: Joshua Zamora
 * Class: Object Oriented Programming
 * Date: 9/29/18
 * UPDATED: 10/25/2018
 * FILE: .java file named MoviePlayerDriver
 * Step 12
 */

public class MoviePlayerDriver {
  public static void main(String[] args) {
    MoviePlayer player=new MoviePlayer("my movie player");
    System.out.println("Created a movie player and calling methods..");
    System.out.println(player);
    player.play();
    player.previous();
    player.next();
    player.stop();
  }
}