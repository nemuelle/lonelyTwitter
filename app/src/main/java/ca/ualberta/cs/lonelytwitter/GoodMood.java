package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * A subclass of Mood that represents a good mood.
 *
 * @author Nathan
 */
public class GoodMood extends Mood {
    /**
     * The Mood.
     */
    final String mood = "Good Mood";;

    /**
     * Instantiates a new Good mood.
     *
     * @param date the date
     */
    public GoodMood(Date date) {
        super(date);
    }

    /**
     * Instantiates a new Good mood.
     */
    public GoodMood() {
        super();
    }

    /**
     * Gets mood.
     *
     * @return the mood
     */
    public String getMood() {
        return mood;
    }

}
