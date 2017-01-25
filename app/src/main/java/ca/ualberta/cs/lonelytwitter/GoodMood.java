package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Nathan on 1/17/2017.
 */

public class GoodMood extends Mood {
    final String mood = "Good Mood";;

    public GoodMood(Date date) {

        super(date);
    }

    public GoodMood() {
        super();
    }

    public String getMood() {
        return mood;
    }

}
