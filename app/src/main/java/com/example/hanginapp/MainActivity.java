package com.example.hanginapp;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HomeFragment homeFragment =new HomeFragment();
        openFragment(homeFragment);
        initUI();
    }



    void initUI()
    {
        bottomNavigationView=findViewById(R.id.Bottom_Navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    void openFragment(Fragment fragment)
    {
        FragmentTransaction transaction= getFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout,fragment);
        transaction.commit();
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Nav_home:
                openFragment(new HomeFragment());

                break;
            case R.id.Nav_booking:
                openFragment(new BookingsFragment());

                break;
            case R.id.Nav_location:
                openFragment(new NearbyFragment());

                break;
            case R.id.Nav_menu:
                openFragment(new MoreFragment());

                break;
        }
        return true;
    }
}
