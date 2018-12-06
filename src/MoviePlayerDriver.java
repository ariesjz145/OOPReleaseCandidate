/**
 *
 * Author: Joshua Zamora
 * Class: Object Oriented Programming
 * Date: 9/29/18
 * UPDATED: 12/06/2018
 * FILE: MoviePlayerDriver .java class.
 * Step 20
 */

public class MoviePlayerDriver {

  public static void testMoviePlayer() {
    MoviePlayer moviePlayer = new MoviePlayer("MoviePlayer",
        new Screen("1080", 144, 1),
        MonitorType.LCD);

    System.out.println(moviePlayer);
  }

}