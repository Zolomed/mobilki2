package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    TextView helloTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        helloTextView = (TextView) findViewById(R.id.helloTextView);

        Intent intent = getIntent();

        String email = intent.getStringExtra("email");

        helloTextView.setText("Здравствуйте, " + email);
    }
}