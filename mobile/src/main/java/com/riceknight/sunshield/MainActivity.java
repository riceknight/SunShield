package com.riceknight.sunshield;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by ricelocal on 11/01/2015.
 */
public class MainActivity extends Activity {

    ConnectionDetector2 cd;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
