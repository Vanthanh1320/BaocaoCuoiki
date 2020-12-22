package com.example.appshoppe.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.appshoppe.model.Help;
import com.example.appshoppe.R;

import java.util.ArrayList;

public class HelpAdapter extends ArrayAdapter<Help> {
    private Activity activity;
    private int items;
    private ArrayList<Help> list;

    public HelpAdapter(Activity activity, int items,ArrayList<Help> list) {
        super(activity,items,list);
        this.activity=activity;
        this.items=items;
        this.list=list;

    }

    public View getView(int position, View converView, ViewGroup parent){
        LayoutInflater inflater=activity.getLayoutInflater();
        converView=inflater.inflate(items,null);

        TextView tv_name=(TextView) converView.findViewById(R.id.ten);
        tv_name.setText(list.get(position).getName());

        return converView;
    }
}
