package com.example.trulselg.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class ShowLocaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_locale);

        Intent intent = getIntent();
        String locale = getResources().getConfiguration().locale.getDisplayName();
        String tekst = "test";
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(locale);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_show_locale);
        layout.addView(textView);
    }
}
