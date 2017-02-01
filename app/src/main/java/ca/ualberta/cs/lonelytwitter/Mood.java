package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * An abstract class that provides an implementation of a mood.
 *
 * @author Nathan
 */
public abstract class Mood {
    /**
     * The Date.
     */
    Date date;

    /**
     * Instantiates a new Mood.
     */
    public Mood() {
        this.date = new Date();
    }

    /**
     * Instantiates a new Mood.
     *
     * @param date the date
     */
    public Mood(Date date) {
        this.date = date;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
