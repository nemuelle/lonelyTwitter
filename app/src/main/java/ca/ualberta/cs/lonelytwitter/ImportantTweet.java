package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.List;

/**
 * Created by Nathan on 1/17/2017.
 */

public class ImportantTweet extends Tweet {
    public ImportantTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }

    public ImportantTweet(Date date, String message, List<Mood> moodList) {
        super(date, message, moodList);
    }

    public ImportantTweet(String message) throws TweetTooLongException {
        super(message);
    }

    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    @Override
    public String getMessage(){
        return super.getMessage() + " !!!!";
    }
}
