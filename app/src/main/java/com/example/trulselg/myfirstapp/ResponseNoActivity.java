package com.example.trulselg.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class ResponseNoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_response_no);

        TextView textView = new TextView(this);
        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_response_no);
        layout.addView(textView);
    }
}
