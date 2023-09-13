package com.example.minggu_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TextButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_button);
        getSupportActionBar().setTitle("Text Button");
    }
}