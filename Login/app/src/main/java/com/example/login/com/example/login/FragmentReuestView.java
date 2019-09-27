package com.example.login;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.login.Model.RequestViewListItem;

import java.util.ArrayList;


public class FragmentReuestView extends Fragment {
    ListView listView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment_reuest_view, container, false);




        final ArrayList<RequestViewListItem> request_list=new ArrayList<>();

        RequestViewListItem requestViewListItem =new RequestViewListItem();

        requestViewListItem.setDetails("IBM ThinkServer TS150 Tower Server With Max. Processor 1 x Intel Xeon E3 (Quad Core) E3-1225 v5\"(3.3 GHz /Cache 8 MB)... / STD MEMORY 8GB X 1/ MAX. MEMORY 64GB 4 Slots/HARD DRIVE 1 X 1TB SATA 3.5\" 7.2k SATA / STD. HDD BAY/ 3 bay MAX. HDD BAY upto 4 x 3.5\" +1 x 2.5\" bay/ OPTICAL Multi Burner/Integrated RAID 0,1,5,10 (RAID 121i).");
        requestViewListItem.setNumber("01");
        requestViewListItem.setDates("01-june-2019");
        requestViewListItem.setPrice("45000");
        request_list.add(requestViewListItem);


        requestViewListItem =new RequestViewListItem();

        requestViewListItem.setDetails("Lenovo ThinkServer TS450 (PN:70M2001VIH) With Max. Processor 1 x Intel Xeon E3 (Quad Core) E3-1225 v5”(3.3 GHz /Cache 8 MB)/ STD MEMORY 8GB X 1 MAX. MEMORY 64GB; 4 DIMM Memory Slots/ HARD DRIVE Open Bay/ 2.5” SAS/SATA HS Bays (8 bay MAX. HDD BAY upto 8 x 2.5” bay MAX. HDD BAY upto 16x2.5”)/OPTICAL Multi Burner/ PCIe RAID 0,1,10 (RAID 520i). Supports SAS & SATA drives/Power Supply Standard (Inbuilt) 1 x 450W Power Supply /Max: 2");
        requestViewListItem.setNumber("01");
        requestViewListItem.setDates("01-june-2019");
        requestViewListItem.setPrice("45000");
        request_list.add(requestViewListItem);

        requestViewListItem =new RequestViewListItem();

        requestViewListItem.setDetails("IBM X3300M4 Server With x3300M4/ Part NO:7382IA4/ Intel Xeon E5 1230v2 1.8 GHz,10 MB,1066MHz/ 1x 8GB RAM/ 1x500GB SATA HDD/ 3.5Simple-Swap/ MULTI BUTRNER");
        requestViewListItem.setNumber("01");
        requestViewListItem.setDates("01-june-2019");
        requestViewListItem.setPrice("45000");
        request_list.add(requestViewListItem);

        requestViewListItem =new RequestViewListItem();

        requestViewListItem.setDetails("IBM Lenovo ThinkServer RD450 Rack Server (PN:70Q90059IH) with 1 x Intel® Xeon® E5-2620v4 (2.1GHz/8C/20MB/85W/2133Mhz)/Max: 2 Processors/ STD MEMORY 16GB X 1 MAX. MEMORY 1 TB ;16 Slots/ HARD DRIVE : Open Bay (2.5” HOT Swap SAS/SATA STD. HDD BAY 8 bay / MAX. HDD BAY 16 bay with optical bay/24 bay without optical bay) / OPTICAL Multi Burner/ Integrated RAID 0,1,10 (RAID 110i). Supports only SATA drive/ Power Supply Standard (Inbuilt) 1 x 750W Power Supply Max: 2");
        requestViewListItem.setNumber("01");
        requestViewListItem.setDates("01-june-2019");
        requestViewListItem.setPrice("45000");
        request_list.add(requestViewListItem);

        listView=view.findViewById(R.id.requestViewItem);
        ListAdapter reqViewAdapter = new requestViewAdapter(getContext(), request_list);
        listView.setAdapter( reqViewAdapter);






        return view;
    }







}