package com.example.myfirstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
public class HelloActivity extends Activity {
    private int counter=0;
    private int counter2=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloact);

        Button button1 = findViewById(R.id.button1);
        TextView textView2 = findViewById(R.id.textView2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setText("Жамкай!");
                textView2.setText("Правая кнопка нажата  " + counter + " раз, а левая - " + ++counter2+ " раз");
            }
        });

        Button button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                textView2.setText("Правая кнопка нажата  " + ++counter + " раз, а левая - " + counter2+ " раз");
            }
        });
    }
}

