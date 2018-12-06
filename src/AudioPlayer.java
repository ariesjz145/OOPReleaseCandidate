/**
 *
 * Author: Joshua Zamora
 * Class: Object Oriented Programming
 * Date: 9/29/18
 * UPDATED: 12/06/2018
 * FILE: AudioPlayer .java class extends Product and Implements MultimediaControl
 * Step 20
 */

public class AudioPlayer extends Product implements MultimediaControl {

  private String audioSpecifications;
  private ItemType mediaType;
    /*
  Creates a constructor that will take in 2 parameters.
  The constructor calls its parents constructor.
    */
  AudioPlayer(String name, String audioSpecifications) {
    super(name);
    mediaType = ItemType.AUDIO;
    this.audioSpecifications = audioSpecifications;
  }

  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    System.out.println("Stopping");
  }

  @Override
  public void previous() {
    System.out.println("Previous");
  }

  @Override
  public void next() {
    System.out.println("Next");
  }

  @Override
  public String toString() {
    return super.toString() +
        "Audio Spec : " + audioSpecifications + '\n' +
        "Type : " + mediaType + '\n';
  }
}