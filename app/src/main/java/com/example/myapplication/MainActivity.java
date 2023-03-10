package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText authorizationEmailAddress;

    private static final String TAG = "Moi Dnewnik";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        authorizationEmailAddress = (EditText) findViewById(R.id.authorizationEmailAddress);
    }
    public void startNewActivity(View v) {
        Log.i(TAG, "Сработал log");
        Intent intent = new Intent(this, SecondaryActivity.class);
        intent.putExtra("email", authorizationEmailAddress.getText().toString());
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            authorizationEmailAddress.setText(data.getStringExtra("email"));
        }
    }
}