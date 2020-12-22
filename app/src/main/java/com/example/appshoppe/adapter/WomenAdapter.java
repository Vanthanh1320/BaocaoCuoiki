package com.example.appshoppe.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appshoppe.R;
import com.example.appshoppe.model.Boy;
import com.example.appshoppe.model.Women;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class WomenAdapter extends BaseAdapter {

    Context context;
    ArrayList<Women> womenList;
    LayoutInflater layoutInflater;
    Women women;

    public WomenAdapter(Context context, ArrayList<Women> womenList) {
        this.context = context;
        this.womenList = womenList;
        layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return womenList.size();
    }

    @Override
    public Object getItem(int i) {
        return womenList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return womenList.get(i).getId();
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = view;

        if (view1 == null) {
            view1 = layoutInflater.inflate(R.layout.dong_app, null, true);

        }

        ImageView image = view1.findViewById(R.id.im_hinh);
        TextView tvten = view1.findViewById(R.id.tv_ten);
        TextView  tvgia= view1.findViewById(R.id.tv_gia);

        women = womenList.get(i);

        Picasso.get().load(women.getHinh()).into(image);
        tvten.setText(women.getTen());
        tvgia.setText(women.getGia());

        return view1;
    }
}
