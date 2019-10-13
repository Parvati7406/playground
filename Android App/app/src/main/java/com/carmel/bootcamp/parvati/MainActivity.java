package com.carmel.bootcamp.parvati;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;

import com.carmel.bootcamp.parvati.DeligateDataPassing.DeligateInterface;
import com.carmel.bootcamp.parvati.ModelData.RequestModel;

public class MainActivity extends AppCompatActivity implements DeligateInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment myfragment=new RequestList();
        ((RequestList) myfragment).setDeligateInterface(this);
        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        FT.add(R.id.FragmentPlaceholder, myfragment);
        FT.commit();
    }

    @Override
    public void deligateFragment() {

        int orientation = this.getResources().getConfiguration().orientation;

        if (orientation == Configuration.ORIENTATION_PORTRAIT) {

            Fragment two = new com.carmel.bootcamp.parvati.RequestView();
            FragmentManager FM = getSupportFragmentManager();
            FragmentTransaction FT = FM.beginTransaction();
            FT.addToBackStack(null);
            FT.replace(R.id.FragmentPlaceholder, two);
            FT.commit();

//            ((ReuestView) two).setData(request_model);
        }
        else {
            Fragment two = new com.carmel.bootcamp.parvati.RequestView();
            FragmentManager FM = getSupportFragmentManager();

            FragmentTransaction FT = FM.beginTransaction();
            FT.replace(R.id.FragmentDisplay, two);
            FT.addToBackStack(null);
            FT.commit();

        }
    }
}
