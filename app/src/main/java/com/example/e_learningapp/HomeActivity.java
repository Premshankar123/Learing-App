package com.example.e_learningapp;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

public class HomeActivity extends AppCompatActivity {
        TabLayout tabLayout;
        ViewPager viewPager;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_home);

            tabLayout=(TabLayout)findViewById(R.id.tabLayout);
            viewPager=(ViewPager)findViewById(R.id.viewPager);
            tabLayout.addTab(tabLayout.newTab().setText("Profile"));
            tabLayout.addTab(tabLayout.newTab().setText("Certifica."));
            tabLayout.addTab(tabLayout.newTab().setText("Chat"));
            tabLayout.addTab(tabLayout.newTab().setText("Score"));
            tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
            final MyAdapter adapter = new MyAdapter(this,getSupportFragmentManager(), tabLayout.getTabCount());
            viewPager.setAdapter(adapter);

            viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

            tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    viewPager.setCurrentItem(tab.getPosition());
                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            });

        }
    }