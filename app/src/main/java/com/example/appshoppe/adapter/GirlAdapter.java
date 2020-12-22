package com.example.appshoppe.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appshoppe.R;
import com.example.appshoppe.model.Acc;
import com.example.appshoppe.model.Girl;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class GirlAdapter extends BaseAdapter {

    Context context;
    ArrayList<Girl> girlList;
    LayoutInflater layoutInflater;
    Girl girl;

    public GirlAdapter(Context context, ArrayList<Girl> girlList) {
        this.context = context;
        this.girlList = girlList;
        layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return girlList.size();
    }

    @Override
    public Object getItem(int i) {
        return girlList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return girlList.get(i).getId();
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

        girl = girlList.get(i);

        tvten.setText(girl.getTen());
        tvgia.setText(girl.getGia());
        Picasso.get().load(girl.getHinh()).into(image);
        return view1;
    }
}
