package com.example.appshoppe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import android.view.MenuItem;

import com.example.appshoppe.bottom.HomeFragment;
import com.example.appshoppe.bottom.MessageFragment;
import com.example.appshoppe.bottom.SearchFragment;
import com.example.appshoppe.profile.Profile;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment,new HomeFragment()).commit();

    }
        private BottomNavigationView.OnNavigationItemSelectedListener navListener =
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment = null;

                        switch (item.getItemId()) {
                            case R.id.navigation_home:
                               selectedFragment = new HomeFragment();
                                break;
                            case R.id.navigation_search:
                                selectedFragment = new SearchFragment();
                                break;
                            case R.id.navigation_message:
                                selectedFragment=new MessageFragment();
                                break;
                            case R.id.navigation_person:
                                selectedFragment=new Profile();
                                break;
                        }
                        getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, selectedFragment).commit();
                        return true;
                    }
                };
    }


