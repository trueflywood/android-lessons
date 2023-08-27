package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View view) {
        Toast.makeText(this, getString(R.string.button1Text) + " (" + String.valueOf(++counter) + ")" , Toast.LENGTH_SHORT).show();
    }
    public void click2(View view) {
        Toast.makeText(this, getString(R.string.button1Text) + " (" + String.valueOf(--counter) + ")", Toast.LENGTH_SHORT).show();
    }
}