package com.example.task;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Bike extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    Bike()
    {
        System.out.println("bike is created");
    }

    public void car(Context applicationContext) {
        Toast.makeText(applicationContext, "Car is created", Toast.LENGTH_SHORT).show();

    }
    }
