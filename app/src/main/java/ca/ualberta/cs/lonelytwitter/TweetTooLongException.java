package ca.ualberta.cs.lonelytwitter;

/**
 * Exception thrown if a Tweet is longer than 140 characters.
 *
 * @author Nathan
 */
public class TweetTooLongException extends Exception {
    /**
     * Instantiates a new Tweet too long exception.
     */
    public TweetTooLongException() {
    }
}
