package com.example.list_view_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list1;
//    ArrayList a1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list1 = findViewById(R.id.demoListView);
        ArrayList<String> a1 = new ArrayList<>();
        ArrayList<String> a2 = new ArrayList<>();
        ArrayList<String> a3 = new ArrayList<>();

        a1.add("PUR - 2019 - 056");
        a1.add("PUR - 2019 - 057");
        a1.add("PUR - 2019 - 056");


        a2.add("06 Jul 2019");
        a2.add("06 Jul 2019");
        a2.add("06 Jul 2019");

        a3.add("Approved");
        a3.add("Reject");
        a3.add("Draft");


        List_Adapter list_adapter1 = new List_Adapter(getApplicationContext(), a1, a2, a3);

        list1.setAdapter(list_adapter1);
    }
}
