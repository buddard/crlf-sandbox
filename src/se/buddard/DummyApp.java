package se.buddard;

import android.app.Activity;
import android.os.Bundle;

public class DummyApp extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        /*
         * Adding a comment here to see what happens with the diff...
         */
    }
}