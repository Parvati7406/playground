package com.carmel.bootcamp.parvati;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.carmel.bootcamp.parvati.ModelData.RequestModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

class RequestListAdapter extends BaseAdapter {
    Context context;
    JSONArray request_list;
    ArrayList<String> arrayListRQN=new ArrayList<>();
    ArrayList<String> arrayListRQS=new ArrayList<>();
    ArrayList<String> arrayListRQD=new ArrayList<>();


    public RequestListAdapter(Context context, JSONArray request_list) {
        this.context = context;
        this.request_list = request_list;
    }

    @Override
    public int getCount() {
        return request_list.length();
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

        View view1=LayoutInflater.from(context).inflate(R.layout.listview,viewGroup,false);

        TextView title,date,status;
        title=view1.findViewById(R.id.RQtitle);
        date=view1.findViewById(R.id.RQdate);
        status=view1.findViewById(R.id.RQstatus);

//        RequestModel requestModel=this.request_list.get(i);

        for (int j=0;j<request_list.length();j++) {
            try {
                JSONObject object = request_list.getJSONObject(j);
                arrayListRQN.add(object.getString("RequestNo"));
                arrayListRQS.add(object.getString("Status"));
                arrayListRQD.add(object.getString("SubmittedDate"));

//                if (object.getString("Status").equals("APPROVED")){
//                    arrayList.add(object.getString("RequestNo"));
//                }

                title.setText(arrayListRQN.get(i));
                status.setText(arrayListRQS.get(i));
                date.setText(arrayListRQD.get(i));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
//        title.setText(requestModel.getRequest_num());
//        date.setText(requestModel.getRequest_date());
//        status.setText(requestModel.getRequest_status().toString());
        return view1;
    }
}