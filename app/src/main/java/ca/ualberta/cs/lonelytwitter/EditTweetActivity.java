package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EditTweetActivity extends Activity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        textView = (TextView) findViewById(R.id.textView);

        final int position =  getIntent().getIntExtra("position", 0);
        Tweet tweet = (Tweet) getIntent().getParcelableExtra("tweet");

        textView.setText(tweet.getMessage());
    }
}
