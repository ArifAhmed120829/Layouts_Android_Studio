package com.example.layouts_101;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lineary);

        TextView textView = findViewById(R.id.textView2);
        //Receiving data from activity
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String myString = extras.getString("myName");
            textView.setText("" +myString);
        }

    }
}