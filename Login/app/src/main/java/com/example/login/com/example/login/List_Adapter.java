package com.example.login;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class List_Adapter extends BaseAdapter {
    Context context;
    ArrayList<String> ar1;
    ArrayList<String> ar2;
    ArrayList<String> ar3;



    public List_Adapter(Context context, ArrayList<String> a1, ArrayList<String> a2, ArrayList<String> a3) {
        this.ar1=a1;
        this.ar2=a2;
        this.ar3=a3;
        this.context=context;


    }


    @Override
    public int getCount() {
        return ar1.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=LayoutInflater.from(context).inflate(R.layout.list_view,parent,false);
        TextView title,date,statusText;
        ImageView imageView;
        imageView=view.findViewById(R.id.imageView8);
        title=view.findViewById(R.id.title);
        date=view.findViewById(R.id.date);
        statusText=view.findViewById(R.id.status);
        title.setText(ar1.get(position));
        date.setText(ar2.get(position));
        statusText.setText(ar3.get(position));
        imageView.setImageResource(R.drawable.bell);
        return view;
    }
}