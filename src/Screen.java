/**
 *
 * Author: Joshua Zamora
 * Class: Object Oriented Programming
 * Date: 9/29/18
 * UPDATED: 10/25/2018
 * FILE: .java file class named Screen that implements the interface ScreenSpec
 * Step 9
 */

public class Screen implements ScreenSpec {

  protected String resolution;
  protected int refreshrate;
  protected int responsetime;

  public Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  @Override
  public String getResolution() {
    return resolution;
  }

  @Override
  public int getRefreshRate() {
    return refreshrate;
  }

  @Override
  public int getResponseTime() {
    return responsetime;
  }

  public String toString() {
    return "Resolution: " + resolution + "\n" +
        "Refresh Rate: " + refreshrate + "\n" +
        "Response Time: " + responsetime;
  }
}