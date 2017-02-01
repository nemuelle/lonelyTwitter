package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.List;

/**
 * A subclass of Tweet that is important.
 *
 * @author Nathan
 */
public class ImportantTweet extends Tweet {
    /**
     * Instantiates a new Important tweet.
     *
     * @param date    the date
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public ImportantTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }

    /**
     * Instantiates a new Important tweet.
     *
     * @param date     the date
     * @param message  the message
     * @param moodList the mood list
     */
    public ImportantTweet(Date date, String message, List<Mood> moodList) {
        super(date, message, moodList);
    }

    /**
     * Instantiates a new Important tweet.
     *
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public ImportantTweet(String message) throws TweetTooLongException {
        super(message);
    }

    /**
     * An ImportantTweet is important
     * @return Boolean.TRUE
     */
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    /**
     * An ImportantTweet ends with '!!!!' but '!!!!' does part of the message itself.
     * @return a new String that takes the message and appends '!!!!' to the end.
     */
    @Override
    public String getMessage(){
        return this.getMessage() + " !!!!";
    }
}
