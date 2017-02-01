package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * A subclass of Mood that represents a bad mood.
 *
 * @author Nathan
 */
public class BadMood extends Mood {
    /**
     * The Mood.
     */
    final String mood = "Bad Mood";

    /**
     * Instantiates a new Bad mood.
     *
     * @param date the date
     */
    public BadMood(Date date) {
        super(date);
    }

    /**
     * Instantiates a new Bad mood.
     */
    public BadMood() {
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
