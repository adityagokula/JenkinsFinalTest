package com.inscripts.jenkinsfinaltest;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.RelativeLayout;

/**
 * Created by adityagokula on 16/03/19.
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new RelativeLayout(MainActivity.this));
    }
}
