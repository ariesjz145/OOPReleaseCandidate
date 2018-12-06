/**
 *
 * Author: Joshua Zamora
 * Class: Object Oriented Programming
 * Date: 9/29/18
 * UPDATED: 12/06/2018
 * FILE: AudioPlayerDriver .java class.
 * Step 20
 */

class AudioPlayerDriver {

  public static void testAudioPlayer() {
    AudioPlayer audioPlayer = new AudioPlayer("iPod Mini", "MP3");

    audioPlayer.play();
    audioPlayer.stop();
    audioPlayer.next();
    audioPlayer.previous();

    System.out.print(audioPlayer);

    AudioPlayer audioPlayer1 = new AudioPlayer("Walkman", "WAV");

    System.out.println(audioPlayer1);
  }
}
