package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public abstract Boolean isImportant();


    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            //Do Something!
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }
	
	@Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Tweet)) return false;

        Tweet tweet = (Tweet) o;

        return tweet.getMessage().equals(message) &&
                tweet.getDate().equals(date);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + message.hashCode();
        result = 31 + result + date.hashCode();
        return result;
    }

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}
