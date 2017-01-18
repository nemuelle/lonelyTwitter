package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Created by Nathan on 1/17/2017.
 */

public abstract class Tweet implements Tweetable{
    private Date date;
    private String message;

    public Tweet(Date date, String message) throws TweetTooLongException {
        this.date = date;
        this.setMessage(message);
    }

    public Tweet(String message) throws TweetTooLongException {
        this.setMessage(message);
        this.date = new Date(); //defaults to the current time
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
}
