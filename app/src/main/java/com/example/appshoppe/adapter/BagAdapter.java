package com.example.appshoppe.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appshoppe.R;
import com.example.appshoppe.model.Bags;
import com.example.appshoppe.model.Boy;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class BagAdapter extends BaseAdapter {

    Context context;
    ArrayList<Bags> bagsList;
    LayoutInflater layoutInflater;
    Bags bags;

    public BagAdapter(Context context, ArrayList<Bags> bagsList) {
        this.context = context;
        this.bagsList = bagsList;
        layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return bagsList.size();
    }

    @Override
    public Object getItem(int i) {
        return bagsList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return bagsList.get(i).getId();
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

        bags = bagsList.get(i);

        Picasso.get().load(bags.getHinh()).into(image);
        tvten.setText(bags.getTen());
        tvgia.setText(bags.getGia());

        return view1;
    }
}
