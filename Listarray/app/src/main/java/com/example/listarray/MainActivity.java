package com.example.listarray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    TextView text1;
    ArrayList<Integer> a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button);
        a = new ArrayList<Integer>();
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        text1 = findViewById(R.id.textView);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a.add(0,3);
                a.add(1,4);
                a.add(2,5);

            }


        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a.remove(2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < a.size(); i++) {
                    text1.setText(a.get(i));
                }
            }
        });

    }
}



