package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sendMessage(View view) {
        EditText medittext = (EditText) findViewById(R.id.editText1);
        String strusername = medittext.getText().toString();
        Character char1 = strusername.charAt(0);
      //  System.out.println("abcd");
        int compareOneTwo = Character.compare(char1, 'a');
        if (compareOneTwo == 0)
        {
            TextView text = (TextView) findViewById(R.id.textView2);
            text.setText("Given character is a Base Character");

        }

    }
}