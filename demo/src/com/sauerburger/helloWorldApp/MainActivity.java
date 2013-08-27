package com.sauerburger.helloWorldApp;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        TestView view = new TestView(this); 
        setContentView(view);  // display my test view
    }
}

/**
 * Simple test view, which should display "hey dude" and the number
 * calls of the draw method.
 */
class TestView extends android.view.View {

  android.graphics.Paint paint;
  int calls = 0;

  TestView (android.content.Context context) {
    super(context);
    paint = new android.graphics.Paint();
    paint.setARGB(255, 255, 0, 0);
  }

  protected void onDraw(android.graphics.Canvas canvas) {
    canvas.drawText("hey dude " + calls, 50, 50, paint);
    calls++;
  }

}

