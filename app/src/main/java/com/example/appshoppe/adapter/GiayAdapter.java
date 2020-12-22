package com.example.appshoppe.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appshoppe.model.Giay;
import com.example.appshoppe.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class GiayAdapter extends BaseAdapter {

    Context context;
    ArrayList<Giay> giayList;
    LayoutInflater layoutInflater;
    Giay giay;

    public GiayAdapter(Context context, ArrayList<Giay> giayList) {
        this.context = context;
        this.giayList = giayList;
        layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return giayList.size();
    }

    @Override
    public Object getItem(int i) {
        return giayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return giayList.get(i).getId();
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


        giay = giayList.get(i);

//        image.setImageResource(giay.getHinh());
        tvten.setText(giay.getTen());
        tvgia.setText(giay.getGia());
        Picasso.get().load(giay.getHinh()).into(image);

        return view1;
    }
}
