package com.carmel.bootcamp.parvati;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.carmel.bootcamp.parvati.ModelData.RequestListViewItem;

import java.util.ArrayList;

class requestViewAdapter extends BaseAdapter {
    Context context;
    ArrayList<RequestListViewItem> requestListViewItems;

    public requestViewAdapter(Context context, ArrayList<RequestListViewItem> requestListViewItems) {
        this.context=context;
        this.requestListViewItems=requestListViewItems;
    }

    @Override
    public int getCount() {
        return requestListViewItems.size();
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
        View view1= LayoutInflater.from(context).inflate(R.layout.request_list_view,viewGroup,false);




        RequestListViewItem requestViewListItem=this.requestListViewItems.get(i);

        TextView details,number,date,price;

        details = view1.findViewById(R.id.details);
        date = view1.findViewById(R.id.RQdate);
        number = view1.findViewById(R.id.number);
        price=view1.findViewById(R.id.price);

        details.setText(requestViewListItem.getDetails());
        number.setText(requestViewListItem.getNumber());
        date.setText(requestViewListItem.getDates());
        price.setText(requestViewListItem.getPrice());
        return view1;
    }
}


