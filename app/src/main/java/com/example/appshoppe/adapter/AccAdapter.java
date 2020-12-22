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
import com.example.appshoppe.model.Bags;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class AccAdapter extends BaseAdapter {

    Context context;
    ArrayList<Acc> accList;
    LayoutInflater layoutInflater;
    Acc acc;

    public AccAdapter(Context context, ArrayList<Acc> accList) {
        this.context = context;
        this.accList = accList;
        layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return accList.size();
    }

    @Override
    public Object getItem(int i) {
        return accList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return accList.get(i).getId();
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

        acc = accList.get(i);

        Picasso.get().load(acc.getHinh()).into(image);
        tvten.setText(acc.getTen());
        tvgia.setText(acc.getGia());

        return view1;
    }
}
