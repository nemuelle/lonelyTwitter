package ca.ualberta.cs.lonelytwitter;

import android.os.Parcel;
import android.os.Parcelable;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Tweet implements Tweetable, Parcelable {
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

    protected Tweet(Parcel in) {
        this.message = in.readString();

        try {
            date = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy").parse(in.readString());
        } catch (java.text.ParseException e) {
            this.date = null;
        }
    }

    @Override
    public String toString(){
        return message;
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

    /**
     * this must be unique per subclass
     * @return
     */
    public int describeContents() {
        return this.hashCode();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(message);
        dest.writeString(date.toString());
    }

}
