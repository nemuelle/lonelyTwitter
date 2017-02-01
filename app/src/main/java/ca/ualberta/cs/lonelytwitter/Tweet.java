package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Tweet class is a super class that implements Tweetable
 *
 * @author Nathan
 */
public abstract class Tweet implements Tweetable{
    private Date date;
    private String message;
    private List<Mood> moodList;

    /**
     * Instantiates a new Tweet.
     *
     * @param date    the date
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public Tweet(Date date, String message) throws TweetTooLongException {
        this.date = date;
        this.setMessage(message);
        this.moodList = new ArrayList<Mood>();
    }

    /**
     * Instantiates a new Tweet.
     *
     * @param date     the date
     * @param message  the message
     * @param moodList the mood list
     */
    public Tweet(Date date, String message, List<Mood> moodList) {
        this.date = date;
        this.message = message;
        this.moodList = moodList;
    }

    /**
     * Instantiates a new Tweet.
     *
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public Tweet(String message) throws TweetTooLongException {
        this.setMessage(message);
        this.date = new Date(); //defaults to the current time
        this.moodList = new ArrayList<Mood>();

    }

    /**
     * Gets date.
     *
     * @return date the date
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

    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    /**
     * Is important boolean.
     *
     * @return True or False depending on the subclass implementation.
     */
    abstract public Boolean isImportant();

    /**
     * Add mood.
     *
     * @param m the Mood or Moods that a Tweet should have.
     */
    public void addMood(Mood m) {
        this.moodList.add(m);
    }

    /**
     * Gets mood list.
     *
     * @return the mood list
     */
    public List<Mood> getMoodList() {
        return this.moodList;
    }

    /**
     * @return A string representation of a Tweet object.
     */
    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
