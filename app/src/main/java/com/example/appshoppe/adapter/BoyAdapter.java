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
import com.example.appshoppe.model.Giay;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class BoyAdapter extends BaseAdapter {

    Context context;
    ArrayList<Boy> boyList;
    LayoutInflater layoutInflater;
    Boy boy;

    public BoyAdapter(Context context, ArrayList<Boy> boyList) {
        this.context = context;
        this.boyList = boyList;
        layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return boyList.size();
    }

    @Override
    public Object getItem(int i) {
        return boyList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return boyList.get(i).getId();
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

        boy = boyList.get(i);

        Picasso.get().load(boy.getHinh()).into(image);
        tvten.setText(boy.getTen());
        tvgia.setText(boy.getGia());

        return view1;
    }
}
