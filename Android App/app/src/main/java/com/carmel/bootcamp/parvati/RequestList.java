package com.carmel.bootcamp.parvati;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.TextView;

import com.carmel.bootcamp.parvati.DeligateDataPassing.DeligateInterface;
import com.carmel.bootcamp.parvati.GlobalData.RequestStatus;
import com.carmel.bootcamp.parvati.ModelData.RequestModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;


public class RequestList extends Fragment {
    ListView listView;
    DeligateInterface dInterface;
    ImageView image1;
    ListPopupWindow listpopup1;
    TextView text1;
    Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_request_list, container, false);

    final String[] items = {"Approved", "Rejected", "Draft", "Awaiting", "Completed"};

        image1 = view.findViewById(R.id.FilterIcon);
        text1 = view.findViewById(R.id.RQstatus);
        listpopup1 = new ListPopupWindow(getContext());
        listpopup1.setAdapter(new ArrayAdapter<>(getContext(), R.layout.status_lists, items));
        listpopup1.setAnchorView(image1);
        listpopup1.setModal(true);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listpopup1.show();
            }
        });


//       listView = view.findViewById(R.id.list_view);
//
//
//        final ArrayList<RequestModel> request_list = new ArrayList<>();
//
//        RequestModel request_model = new RequestModel();
//
//        request_model.setRequest_num("PUR - 2019 - 056");
//        request_model.setRequest_date("06 Jul 2019");
//        request_model.setRequest_status(RequestStatus.APPROVED);
//        request_list.add(request_model);
//
//
//        request_model = new RequestModel();
//        request_model.setRequest_num("PUR - 2019 - 057");
//        request_model.setRequest_date("06 Jul 2019");
//        request_model.setRequest_status(RequestStatus.REJECTED);
//        request_list.add(request_model);
//
//
//        request_model = new RequestModel();
//        request_model.setRequest_num("PUR - 2019 - 058");
//        request_model.setRequest_date("06 Jul 2019");
//        request_model.setRequest_status(RequestStatus.DRAFT);
//        request_list.add(request_model);
//
//
        listView = view.findViewById(R.id.list_view);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                RequestModel req_model = request_list.get(i);

                if (dInterface != null) {
                    dInterface.deligateFragment();
                }
            }
        });
//
//        ListAdapter listAdapter = new RequestListAdapter(getContext(), request_list);
//        listView.setAdapter(listAdapter);

        String json;
        try {
            InputStream inputStream=getActivity().getAssets().open("request.json");
            int size=inputStream.available();
            byte[] buffer=new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json=new String(buffer,"UTF-8");
            JSONArray jsonArray=new JSONArray(json);

            ListAdapter listAdapter = new RequestListAdapter(getContext(), jsonArray);
       listView.setAdapter(listAdapter);


        }
        catch (IOException e){
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }


        return view;

    }

   public void setDeligateInterface(DeligateInterface deligateInterface){
       this.dInterface=deligateInterface;

    }

}


