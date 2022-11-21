package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void disable(View v){
        v.setEnabled(false);
        Button button = (Button)v;
        button.setText("disabled");
        TextView text = findViewById(R.id.textView);
        text.setText("You clicked the button");
    }
}