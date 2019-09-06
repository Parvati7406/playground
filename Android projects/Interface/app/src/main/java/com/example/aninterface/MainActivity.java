package com.example.aninterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Myfun,Demo5{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display();
        name();
    }

    @Override
    public void display() {
        Toast.makeText( getApplicationContext(),"userfunction", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void name() {
        Toast.makeText( getApplicationContext(),"userfunction", Toast.LENGTH_SHORT).show();
    }
}
