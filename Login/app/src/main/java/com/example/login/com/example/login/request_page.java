package com.example.login;

import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;

import com.example.login.Global.Request_status;
import com.example.login.Model.Request_model;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Menu;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class request_page extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ImageView image;
    ListPopupWindow listpopup1;
    TextView text1;
    ListView listView;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_page);

        final String[] items = {"Approved", "Rejected", "Draft", "Awaiting", "Completed"};

        listView = findViewById(R.id.list_view);
        btn=findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(getApplicationContext(), requisition_form1.class);
                startActivity(intent3);
            }
        });
//        ArrayList<String> a1 = new ArrayList<>();
//        ArrayList<String> a2 = new ArrayList<>();
//        ArrayList<String> a3 = new ArrayList<>();

        final ArrayList<Request_model> request_list=new ArrayList<>();

Request_model request_model=new Request_model();

request_model.setRequest_num("PUR - 2019 - 056");
request_model.setRequest_date("06 Jul 2019");
request_model.setRequest_status(Request_status.APPROVED);
        request_list.add(request_model);



        request_model=new Request_model();


        request_model.setRequest_num("PUR - 2019 - 057");
        request_model.setRequest_date("06 Jul 2019");
        request_model.setRequest_status(Request_status.REJECTED);

        request_list.add(request_model);

        request_model=new Request_model();

        request_model.setRequest_num("PUR - 2019 - 058");
        request_model.setRequest_date("06 Jul 2019");
        request_model.setRequest_status(Request_status.DRAFT);
        request_list.add(request_model);




        listView=findViewById(R.id.list_view);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent=new Intent(request_page.this, com.example.login.RequestView.class);

                Request_model request=request_list.get(i);

                Bundle requestDataBundle=new Bundle();
                requestDataBundle.putString("RequestNo",request.getRequest_num());
                requestDataBundle.putString("RequestDate",request.getRequest_date());
                requestDataBundle.putString("RequestStatus",request.getRequest_status().toString());
                intent.putExtra("request",requestDataBundle);
                startActivity(intent);
            }
        });


//        a1.add("PUR - 2019 - 056");
//        a1.add("PUR - 2019 - 057");
//        a1.add("PUR - 2019 - 058");
//        a1.add("PUR - 2019 - 059");
//
//
//        a2.add("06 Jul 2019");
//        a2.add("06 Jul 2019");
//        a2.add("06 Jul 2019");
//        a2.add("06 Jul 2018");
//
//        a3.add("Approved");
//        a3.add("Reject");
//        a3.add("Draft");
//        a3.add("Awaiting");
//

// String statusColors





        ListAdapter listAdapter = new com.example.login.List_Adapter(getApplicationContext(), request_list);
        listView.setAdapter(listAdapter);

        image = findViewById(R.id.imageView7);
        text1 = findViewById(R.id.status);
        listpopup1 = new ListPopupWindow(getApplicationContext());
        listpopup1.setAdapter(new ArrayAdapter<>(getApplicationContext(), R.layout.status_list, items));
        listpopup1.setAnchorView(image);
        listpopup1.setModal(true);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listpopup1.show();
            }
        });


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.request_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
