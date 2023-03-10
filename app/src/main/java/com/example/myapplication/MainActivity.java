package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Moi Dnewnik";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.authorizationButton).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.i(TAG, "Сработал log");
            }
        });
    }
}