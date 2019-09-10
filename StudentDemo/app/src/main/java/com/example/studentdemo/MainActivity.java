package com.example.studentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        student s1=new student();
        s1.getname(getApplicationContext());
//        s1.getBranch(getApplicationContext());
//        s1.test(getApplicationContext());
    }
}
