package com.example.layouts_101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button100);
        Button button2 = findViewById(R.id.button101);
        Button button3 = findViewById(R.id.button102);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),Activity2.class);
                i.putExtra("myName","My name is Arif Ahmed");
                startActivity(i);

            }

        }

        );
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(view.getContext(),Activity3.class);
                startActivity(i2);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(view.getContext(),Activity4.class);
                startActivity(i3);

            }
        });


    }
}