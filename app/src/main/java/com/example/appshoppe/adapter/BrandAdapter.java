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
import com.example.appshoppe.model.Brand;

import java.util.ArrayList;
import java.util.List;

public class BrandAdapter extends BaseAdapter {

    Context context;
    ArrayList<Brand> brandList;
    LayoutInflater layoutInflater;
    Brand brand;

    public BrandAdapter(Context context, ArrayList<Brand> brandList) {
        this.context = context;
        this.brandList = brandList;
        layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return brandList.size();
    }

    @Override
    public Object getItem(int i) {
        return brandList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return brandList.get(i).getId();
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = view;

        if (view1 == null) {
            view1 = layoutInflater.inflate(R.layout.items_help, null, true);

        }

        ImageView image = view1.findViewById(R.id.im_hinh);
        TextView tvten = view1.findViewById(R.id.tv_ten);

        brand = brandList.get(i);

        image.setImageResource(brand.getHinh());
        tvten.setText(brand.getTen());

        return view1;
    }
}
