package com.example.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.ListAdapter;

import com.example.login.Model.RequestViewListItem;

import java.util.ArrayList;

class requestViewAdapter extends BaseAdapter {

    Context context;
    ArrayList<RequestViewListItem> req_view;
    public requestViewAdapter(Context context, ArrayList<RequestViewListItem> request_list) {
        this.context=context;
        this.req_view=request_list;
    }

    @Override
    public int getCount() {
        return req_view.size();
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
    public View getView(int i, View view, ViewGroup viewGroup) {

        View view1= LayoutInflater.from(context).inflate(R.layout.requestitemlist,viewGroup,false);


        RequestViewListItem requestViewListItem=this.req_view.get(i);

        TextView details,number,date,price;

        details = view1.findViewById(R.id.details);
        date = view1.findViewById(R.id.date);
        number = view1.findViewById(R.id.number);
        price=view1.findViewById(R.id.price);

        details.setText(requestViewListItem.getDetails());
        number.setText(requestViewListItem.getNumber());
        date.setText(requestViewListItem.getDates());
        price.setText(requestViewListItem.getPrice());
        return view1;
    }
}
