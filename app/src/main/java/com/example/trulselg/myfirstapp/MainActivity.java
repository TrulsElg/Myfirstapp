package com.example.trulselg.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.trulselg.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    //Called when user clicks the Show Message button
    public void showMessage(View view){
        Intent intent = new Intent(this, ShowMessageActivity.class);
        startActivity(intent);
    }

    //Called when user clicks the Test button
    public void test(View view){
        Intent intent = new Intent(this, TestActivity.class);
        startActivity(intent);
    }

    //Called when user clicks the Locale button
    public void locale(View view){
        Intent intent = new Intent(this, ShowLocaleActivity.class);
        startActivity(intent);
    }

}
