package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

public class LinerLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liner_layout);
        EditText editText = (EditText) findViewById(R.id.editTextGrup1);
        editText.setText(getString(R.string.hint_text));
        ImageView image = findViewById(R.id.imageView1);
        image.setImageResource(R.drawable.pr3);
    }
}