package ca.ualberta.cs.lonelytwitter;

import android.os.Parcel;
import android.os.Parcelable;

public class NormalTweet extends Tweet {

    public NormalTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }

    /**
     * Anonymous inner class needed by Parcelable
     */
    public static final Parcelable.Creator<Tweet> CREATOR = new Parcelable.Creator<Tweet>(){

        public Tweet createFromParcel(Parcel source) {
            return  new Tweet(source) {
                @Override
                public Boolean isImportant() {
                    return Boolean.FALSE;
                }
            };
        }

        public Tweet[] newArray(int size) {
            return new Tweet[size];
        }
    };
}
