package com.example.trulselg.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ShowMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);


        TextView textView = new TextView(this);
        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_show_message);
        layout.addView(textView);
    }

    //Called when user clicks ResponseNo button
    public void responseNo(View view){
        Intent intent = new Intent(this, ResponseNoActivity.class);
        startActivity(intent);
    }

    //Called when user clicks ResponseYes button
    public void responseYes(View view){
        Intent intent = new Intent(this, ResponseYesActivity.class);
        startActivity(intent);
    }
}
