/**
 *
 * Author: Joshua Zamora
 * Class: Object Oriented Programming
 * Date: 9/29/18
 * UPDATED: 12/06/2018
 * FILE: Enum ItemType.
 * Step 20
 */

public enum ItemType {

    // ItemType AUDIO = new ItemType("AU")
    AUDIO("AU"),
    VISUAL("VI"),
    AUDIO_MOBILE("AM"),
    VISUAL_MOBILE("VM");

    public String code;

    ItemType(String code) {
        this.code = code;
    }
}