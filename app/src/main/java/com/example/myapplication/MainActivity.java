package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sendMessage(View view) {
        EditText medittext = findViewById(R.id.editText1);
        int compareOneTwo = Character.compare('a', 'a');
        if (1 == 1)
        {
            TextView text = (TextView) findViewById(R.id.textView2);
            text.setText("Base Character");

        }

    }
}