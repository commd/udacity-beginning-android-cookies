package com.example.android.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        // @+id/android_cookie_image_view
        ImageView cookieImageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        cookieImageView.setImageResource(R.drawable.after_cookie);

        // TODO: Find a reference to the TextView in the layout. Change the text.
        // @+id/status_text_view

        TextView msgTextView = (TextView) findViewById(R.id.status_text_view);
        msgTextView.setText("I'm full.");

        Log.i("Cookies.java", "End of eatCookie()");

    }

    public void doOver(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        // @+id/android_cookie_image_view
        ImageView cookieImageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        cookieImageView.setImageResource(R.drawable.before_cookie);

        // TODO: Find a reference to the TextView in the layout. Change the text.
        // @+id/status_text_view

        TextView msgTextView = (TextView) findViewById(R.id.status_text_view);
        msgTextView.setText("I'm so Hungry.");

        Log.i("Cookies.java", "End of doOver()");

    }
}