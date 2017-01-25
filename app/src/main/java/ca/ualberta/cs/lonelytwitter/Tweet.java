package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by Nathan on 1/17/2017.
 */

public abstract class Tweet implements Tweetable{
    private Date date;
    private String message;
    private List<Mood> moodList;

    public Tweet(Date date, String message) throws TweetTooLongException {
        this.date = date;
        this.setMessage(message);
        this.moodList = new ArrayList<Mood>();
    }

    public Tweet(Date date, String message, List<Mood> moodList) {
        this.date = date;
        this.message = message;
        this.moodList = moodList;
    }

    public Tweet(String message) throws TweetTooLongException {
        this.setMessage(message);
        this.date = new Date(); //defaults to the current time
        this.moodList = new ArrayList<Mood>();

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    abstract public Boolean isImportant();

    public void addMood(Mood m) {
        this.moodList.add(m);
    }

    public List<Mood> getMoodList() {
        return this.moodList;
    }

    @Override
    public String toString() {
        return date.toString() + " | " + message;

    public List<Mood> getMoodList() {
        return this.moodList;
    }
}
