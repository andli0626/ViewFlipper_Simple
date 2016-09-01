package com.example.viewflipper;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ViewFlipper;

public class MainActivity extends Activity {

	ViewFlipper flipper;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flipper = (ViewFlipper) findViewById(R.id.flipper);
		flipper.startFlipping();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
