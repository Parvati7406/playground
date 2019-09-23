package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView img1, img2;
    TextView text1, text2, text3;
    EditText edit1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        img1 = findViewById(R.id.imageView);
        img2 = findViewById(R.id.imageView2);
        text1 = findViewById(R.id.textView5);
        text2 = findViewById(R.id.textView6);
        text3=findViewById(R.id.textView2);
        edit1=findViewById(R.id.editText);


text3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(getApplicationContext(),Forgot_Password.class);
        startActivity(i);
    }
});



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit1.getText().toString().equals("")){

                img1.setVisibility(View.VISIBLE);
                img2.setVisibility(View.VISIBLE);
                text1.setVisibility(View.VISIBLE);
                text2.setVisibility(View.VISIBLE);
            }

                else{
                    Intent intent1=new Intent(getApplicationContext(), com.example.login.FragmentRequisitionForm.class );
                    startActivity(intent1);


                }
            }

        });





    }
}
