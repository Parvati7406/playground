package com.example.list_view_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class List_Adapter extends BaseAdapter {
    Context context;
    ArrayList<String> a1;
    ArrayList<String> a2;
    ArrayList<String> a3;


    public List_Adapter(Context Context, ArrayList<String> a1, ArrayList<String> a2, ArrayList<String> a3) {
        this.a1=a1;
        this.a2=a2;
        this.a3=a3;
        this.context=Context;


    }


    @Override
    public int getCount() {
        return a1.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        View view1= LayoutInflater.from(context).inflate(R.layout.list_view_resource,parent,false);
        TextView title,status,date;
        ImageView imageView;

        title=view1.findViewById(R.id.title);
        date=view1.findViewById(R.id.date);
        status=view1.findViewById(R.id.status);
        imageView=view1.findViewById(R.id.imageView);
        Toast.makeText(context,"test"+a1, Toast.LENGTH_LONG).show();
        title.setText(a1.get(i));
        date.setText(a2.get(i));
        status.setText(a3.get(i));
        imageView.setImageResource(R.drawable.bell);
        return view1;



    }
}
