package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Nathan on 1/17/2017.
 */

public class BadMood extends Mood {
    final String mood = "Bad Mood";

    public BadMood(Date date) {
        super(date);
    }

    public BadMood() {
        super();
    }

    public String getMood() {
        return mood;
    }
}
