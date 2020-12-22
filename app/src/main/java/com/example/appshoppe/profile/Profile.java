package com.example.appshoppe.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.appshoppe.R;
import com.google.android.material.tabs.TabLayout;

public class Profile extends Fragment {

    private TabLayout mTabLayout;
    private ViewPager mView;
     ImageButton imgset;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View r = inflater.inflate(R.layout.activity_profile, container, false);


        mTabLayout=r.findViewById(R.id.tab_layout);
        mView=r.findViewById(R.id.view_page);

        ViewPageAdapter viewPageAdapter=new ViewPageAdapter(getParentFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mView.setAdapter(viewPageAdapter);

        mTabLayout.setupWithViewPager(mView);

        imgset =r.findViewById(R.id.im_set);
        imgset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this.getActivity(), SettingActivity.class);
                startActivity(intent);
            }
        });

        return r;

    }
}
