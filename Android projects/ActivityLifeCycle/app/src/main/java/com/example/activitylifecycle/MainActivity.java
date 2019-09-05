package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Demo","onStart Loading");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Demo","onResume Functioning");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Demo","onPause Hidden");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Demo","onStop Stopped");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Demo","onRestart Starting");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Demo","onDestroy Cleaning");
    }

}
