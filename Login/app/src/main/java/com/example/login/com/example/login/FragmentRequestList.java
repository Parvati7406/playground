package com.example.login;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.TextView;

import com.example.login.Global.Request_status;
import com.example.login.Model.Request_model;

import java.util.ArrayList;

import Deligate.DeligateInterface;


public class FragmentRequestList extends Fragment {
ListView listView;
DeligateInterface dInterface;
    ImageView image;
    ListPopupWindow listpopup1;
    TextView text1;
    Button btn;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_request_list, container, false);
        final String[] items = {"Approved", "Rejected", "Draft", "Awaiting", "Completed"};

        image = view.findViewById(R.id.imageView7);
        text1 = view.findViewById(R.id.status);
        listpopup1 = new ListPopupWindow(getContext());
        listpopup1.setAdapter(new ArrayAdapter<>(getContext(), R.layout.status_list, items));
        listpopup1.setAnchorView(image);
        listpopup1.setModal(true);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listpopup1.show();
            }
        });


        listView = view.findViewById(R.id.list_view);
        btn = view.findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(view.getContext(), requisition_form1.class);
                startActivity(intent3);
            }
        });


        final ArrayList<Request_model> request_list = new ArrayList<>();

        Request_model request_model = new Request_model();

        request_model.setRequest_num("PUR - 2019 - 056");
        request_model.setRequest_date("06 Jul 2019");
        request_model.setRequest_status(Request_status.APPROVED);
        request_list.add(request_model);


        request_model = new Request_model();


        request_model.setRequest_num("PUR - 2019 - 057");
        request_model.setRequest_date("06 Jul 2019");
        request_model.setRequest_status(Request_status.REJECTED);

        request_list.add(request_model);

        request_model = new Request_model();

        request_model.setRequest_num("PUR - 2019 - 058");
        request_model.setRequest_date("06 Jul 2019");
        request_model.setRequest_status(Request_status.DRAFT);
        request_list.add(request_model);


        listView = view.findViewById(R.id.list_view);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Request_model req_model = request_list.get(i);

                if (dInterface != null) {
                    dInterface.deligateFragment(req_model);
                }
            }
        });

        ListAdapter listAdapter = new com.example.login.List_Adapter(view.getContext(), request_list);
        listView.setAdapter(listAdapter);



        return view;
    }
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//
//                Intent intent=new Intent(view.getContext(), com.example.login.RequestView.class);
//
//                Request_model request=request_list.get(i);
//
//                Bundle requestDataBundle=new Bundle();
//                requestDataBundle.putString("RequestNo",request.getRequest_num());
//                requestDataBundle.putString("RequestDate",request.getRequest_date());
//                requestDataBundle.putString("RequestStatus",request.getRequest_status().toString());
//                intent.putExtra("request",requestDataBundle);
//                startActivity(intent);
//            }
//        });
//
       //
//    }

    public void setDeligateInterface(DeligateInterface deligateInterface){
        this.dInterface=deligateInterface;
    }


}
