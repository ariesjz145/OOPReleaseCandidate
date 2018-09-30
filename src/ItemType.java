/**
 *
 * Author: Joshua Zamora
 * Class: Object Oriented Programming
 * Date: 9/29/18
 * FILE: .java file enum named itemType.
 */

public enum ItemType {

    // ttemType AUDIO = new ItemType ("AU");
    AUDIO("AU"),
    VISUAL("VI"),
    AUDIO_MOBILE("AM"),
    VISIUAL_MOBILE("VM");

    private final String code;

    ItemType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}