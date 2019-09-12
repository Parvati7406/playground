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
    int count=0;

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


                count++;
                a.add(count);

            }


        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a.remove(a.size()-1);
                count--;
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(" ");
                for (int i = 0; i < a.size(); i++) {
                    text1.setText(text1.getText()+String.valueOf(a.get(i))+"\n");
                }
            }
        });

    }
}



