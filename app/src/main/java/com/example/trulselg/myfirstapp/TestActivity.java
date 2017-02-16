package com.example.trulselg.myfirstapp;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT>=17) {
            setContentView(R.layout.activity_test_min17);
            TextView textView = new TextView(this);
            ViewGroup layout = (ViewGroup) findViewById(R.id.activity_test_min17);
            layout.addView(textView);
        } else {
            setContentView(R.layout.activity_test);
            TextView textView = new TextView(this);
            ViewGroup layout = (ViewGroup) findViewById(R.id.activity_test);
            layout.addView(textView);
        }
    }
}
