package com.example.studentdemo;

import android.content.Context;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class student extends AppCompatActivity {
    public void getname(Context applicationContext) {
        Toast.makeText(applicationContext, "student is created", Toast.LENGTH_SHORT).show();
    }

    class courses {
        public void getBranch(Context applicationContext) {
            Toast.makeText(applicationContext, "Course is created", Toast.LENGTH_SHORT).show();
        }
    }


    public class register {
        public void test(Context applicationContext) {
            Toast.makeText(applicationContext, "registered is created", Toast.LENGTH_SHORT).show();
        }
    }
}








