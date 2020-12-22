package com.example.appshoppe.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appshoppe.R;
import com.example.appshoppe.message.Thongbao;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ThongbaoAdapter extends ArrayAdapter<Thongbao> {
    private Activity activity;
    private int items;
    private ArrayList<Thongbao> list;


    public ThongbaoAdapter(Activity activity, int items, ArrayList<Thongbao> list) {
        super(activity, items, list);
        this.activity = activity;
        this.items = items;
        this.list = list;

    }

    public View getView(int position, View converView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        converView = inflater.inflate(items, null);

        CircleImageView imgtbao = (CircleImageView) converView.findViewById(R.id.imagehinh);

        TextView tvttin = (TextView) converView.findViewById(R.id.ten);
        TextView tvtgian = (TextView) converView.findViewById(R.id.motabh);
//        ImageView imgtbao=(ImageView) converView.findViewById(R.id.imagehinh);

        tvttin.setText(list.get(position).getTtin());
        tvtgian.setText(list.get(position).getTgian());
        Picasso.get().load(list.get(position).getImage()).into(imgtbao);
//        imgtbao.setImageResource(list.get(position).getImage());

        return converView;

    }
}
