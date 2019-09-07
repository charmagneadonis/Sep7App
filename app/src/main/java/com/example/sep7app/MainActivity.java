package com.example.sep7app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Sep7App", "onCreate() has executed...");
        myButton = findViewById(R.id.button);
    }

    protected void onStart() {
        super.onStart();
        Log.d("Sep7App", "onStart() has executed...");
    }

    protected void onResume() {
        super.onResume();
        Log.d("Sep7App", "onResume() has executed...");
    }

    protected void onPause() {
        super.onPause();
        Log.d("Sep7App", "onPause() has executed...");
    }

    protected void onStop() {
        super.onStop();
        Log.d("Sep7App", "onStop() has executed...");
    }

    protected void onRestart () {
        super.onRestart();
        Log.d("Sep7App", "onRestart() has executed...");
    }

    protected void onDestroy () {
        super.onDestroy();
        Log.d("Sep7App", "onDestroy() has executed...");
    }

    public void displayMsg (View v) {
        //Toast toast = Toast.makeText (this, "Button is clicked", Toast.LENGTH_LONG);
        //Toast.makeText (this, "Button is clicked", Toast.LENGTH_LONG).show();
        //toast.show();

        //Snackbar snackbar = Snackbar.make(v, "Button was clicked. This is a snackbar.", Snackbar.LENGTH_LONG);
        //snackbar.show();

        //myButton.setText("Hello");

        Intent i = new Intent (this, SecondActivity.class);
        startActivity(i);
    }
}
