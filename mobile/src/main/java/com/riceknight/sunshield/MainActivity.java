package com.riceknight.sunshield;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by ricelocal on 11/01/2015.
 */
public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConnectionDetector2 cd = new ConnectionDetector2(getApplicationContext());

        //Check Wifi is connected
        boolean isConnected = cd.isConnected();
        if (!isConnected) {
            Toast.makeText(getApplicationContext(), "Not Connected", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "Is Connected", Toast.LENGTH_LONG).show();
        }
    }
}

