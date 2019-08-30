package com.example.login;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.login.MyRecyclerListAdapter;
import com.example.login.R;

public class Recycler extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle);

        recyclerView=findViewById(R.id.recyclerView);

        String title[] = {"PUR-2019-056", "PUR-2019-056", "PUR-2019-056", "PUR-2019-056", "PUR-2019-056"};
        String date[] = {"22-Aug", "24-Aug", "28-Aug", "30-Aug", "2-Sep"};
        String statusTitle[] = {"APPROVED", "REJECTED", "DRAFT", "AWAITING", "COMPLETED"};

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        MyRecyclerListAdapter myRecyclerListAdapter=new MyRecyclerListAdapter(getApplicationContext(),title,date,statusTitle);
        recyclerView.setAdapter(myRecyclerListAdapter);
    }
}