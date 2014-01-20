package com.sauerburger.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends Activity
{
    public final static String EXTRA_MESSAGE = "com.sauerburger.myfirstapp.MESSAGE";
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      // Inflate the menu items for use in the action bar
      MenuInflater inflater = getMenuInflater();
      inflater.inflate(R.menu.main_activity_actions, menu);
      return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_info:
                Intent intent = new Intent(this, DisplayMessageActivity.class);
                String message = getString(R.string.help);
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
      Intent intent = new Intent(this, DisplayMessageActivity.class);
      EditText editText1 = (EditText) findViewById(R.id.edit_message1);
      EditText editText2 = (EditText) findViewById(R.id.edit_message2);
      String name1 = editText1.getText().toString();
      String name2 = editText2.getText().toString();
      String poem  = getString(R.string.poem);
      intent.putExtra(EXTRA_MESSAGE, poem.replace("_1", name1).replace("_2", name2) );
      startActivity(intent);
    }
}
