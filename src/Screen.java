/**
 *
 * Author: Joshua Zamora
 * Class: Object Oriented Programming
 * Date: 9/29/18
 * UPDATED: 10/25/2018
 * FILE: .java file class named Screen that implements the interface ScreenSpec
 */

public class Screen implements ScreenSpec{
  String Resolution;
  int refreshRate;
  int responseTime;

  @Override
  public String getResolution() {
    return null;
  }

  @Override
  public int getRefreshRate() {
    return 0;
  }

  @Override
  public int getResponseTime() {
    return 0;
  }

  @Override
  public String toString() {
    return "resolution : " + Resolution + '\n' +
        "refreshrate : " + refreshRate + "\n" +
        "responsetime : " + responseTime + "\n";
  }
}