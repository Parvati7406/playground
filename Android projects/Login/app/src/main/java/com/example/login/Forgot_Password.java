package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Forgot_Password extends AppCompatActivity {
    Button btn;
    ImageView img3, img4;
    TextView text3, text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot__password);


        btn = findViewById(R.id.button);
        img3 = findViewById(R.id.imageView3);
        img4 = findViewById(R.id.imageView4);
        text3 = findViewById(R.id.textView7);
        text4 = findViewById(R.id.textView8);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img3.setVisibility(View.VISIBLE);
                img4.setVisibility(View.VISIBLE);
                text3.setVisibility(View.VISIBLE);
                text4.setVisibility(View.VISIBLE);
            }


        });

    }
}
