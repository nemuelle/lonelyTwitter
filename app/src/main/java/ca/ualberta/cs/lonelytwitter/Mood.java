package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Nathan on 1/17/2017.
 */

public abstract class Mood {
    Date date;

    public Mood(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Mood() {
        this.date = new Date();

    }
}
