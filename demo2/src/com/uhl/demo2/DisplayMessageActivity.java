package com.uhl.demo2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.widget.TextView;
import android.widget.EditText;
import android.content.Intent;
import android.annotation.SuppressLint;

public class DisplayMessageActivity extends Activity {

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//         Make sure we're running on Honeycomb or higher to use ActionBar APIs
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
//             Show the Up button in the action bar.
//            getActionBar().setDisplayHomeAsUpEnabled(true);
//        }
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = new TextView(this);
        textView.setText(message);

        setContentView(textView);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
