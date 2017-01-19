package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.List;

/**
 * Created by Nathan on 1/17/2017.
 */

public class NormalTweet extends Tweet {
    public NormalTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }

    public NormalTweet(Date date, String message, List<Mood> moodList) {
        super(date, message, moodList);
    }

    public NormalTweet(String message) throws TweetTooLongException {
        super(message);
    }

    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
