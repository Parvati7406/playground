package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import static com.example.login.R.layout.*;

import androidx.appcompat.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Forgot_Password extends AppCompatActivity {
    Button btn;
    ImageView img3, img4;
    TextView text3, text4;
    AlertDialog.Builder alertBuilder;
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot__password);


        btn = findViewById(R.id.button2);
        img3 = findViewById(R.id.imageView3);
        img4 = findViewById(R.id.imageView4);
        text3 = findViewById(R.id.textView7);
        text4 = findViewById(R.id.textView8);
        et1=findViewById(R.id.editText2);


        alertBuilder=new AlertDialog.Builder( this);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et1.getText().toString().equals("")) {
                    img3.setVisibility(View.VISIBLE);
                    img4.setVisibility(View.VISIBLE);
                    text3.setVisibility(View.VISIBLE);
                    text4.setVisibility(View.VISIBLE);
                } else {
                    final View alertView = getLayoutInflater().inflate(activity_alert, null);
                    alertBuilder.setView(alertView);
                    final AlertDialog alertDialog = alertBuilder.create();
                    alertDialog.show();
                }

            } });

    }
}
