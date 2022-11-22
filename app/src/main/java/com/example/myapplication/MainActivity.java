package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");
    }

    public void handleButton(View view){
        Log.d("success", "clicked button");

        //view.setEnabled(false);
        Button button = (Button)view;
        button.setText("disabled");

        EditText input = findViewById(R.id.input);

        TextView text = findViewById(R.id.textView);
        text.setText(input.getText().toString());

        Toast.makeText(this, "clicked button", Toast.LENGTH_SHORT).show();

    }

    public void launchActivity(View view){
        Intent intent = new Intent(this, SettingsActivity.class);
        intent.putExtra("EXTRA", "Hello");
        startActivity(intent);
    }

}