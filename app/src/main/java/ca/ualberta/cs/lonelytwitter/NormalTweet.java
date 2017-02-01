package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.List;

/**
 * An subclass of the Tweet class that is not important.
 *
 * @author Nathan
 */
public class NormalTweet extends Tweet {
    /**
     * Instantiates a new Normal tweet.
     *
     * @param date    the date
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public NormalTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }

    /**
     * Instantiates a new Normal tweet.
     *
     * @param date     the date
     * @param message  the message
     * @param moodList the mood list
     */
    public NormalTweet(Date date, String message, List<Mood> moodList) {
        super(date, message, moodList);
    }

    /**
     * Instantiates a new Normal tweet.
     *
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public NormalTweet(String message) throws TweetTooLongException {
        super(message);
    }

    /**
     * A NormalTweet is not important
     * @return Booloan.FALSE
     */
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
