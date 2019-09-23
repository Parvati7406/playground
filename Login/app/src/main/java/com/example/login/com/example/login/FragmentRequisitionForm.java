package com.example.login;

import android.content.Intent;
import android.os.Bundle;

import com.example.login.Global.Request_status;
import com.example.login.Model.Request_model;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.Menu;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FragmentRequisitionForm extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    ImageView image;
    ListPopupWindow listpopup1;
    TextView text1;
    ListView listView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_requisition_form);


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

                Intent intent=new Intent(FragmentRequisitionForm.this, com.example.login.RequestView.class);

                Request_model request=request_list.get(i);

                Bundle requestDataBundle=new Bundle();
                requestDataBundle.putString("RequestNo",request.getRequest_num());
                requestDataBundle.putString("RequestDate",request.getRequest_date());
                requestDataBundle.putString("RequestStatus",request.getRequest_status().toString());
                intent.putExtra("request",requestDataBundle);
                startActivity(intent);
            }
        });

        ListAdapter listAdapter = new com.example.login.List_Adapter(getApplicationContext(), request_list);
        listView.setAdapter(listAdapter);




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
        getMenuInflater().inflate(R.menu.fragment_requisition_form, menu);
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

    public void Click(View view){
        Fragment One= new com.example.login.FragmentRequestList();

        FragmentManager FM=getSupportFragmentManager();
        FragmentTransaction FT=FM.beginTransaction();
        FT.replace(R.id.fragment,One);
        FT.commit();
    }


    public void Click1(View view){
        Fragment two= new com.example.login.FragmentReuestView();

        FragmentManager FM=getSupportFragmentManager();
        FragmentTransaction FT=FM.beginTransaction();
        FT.replace(R.id.fragment2,two);
        FT.commit();
    }

}
