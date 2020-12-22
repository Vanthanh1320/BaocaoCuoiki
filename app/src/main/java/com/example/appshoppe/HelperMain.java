package com.example.appshoppe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.appshoppe.adapter.HelpAdapter;
import com.example.appshoppe.model.Help;

import java.util.ArrayList;

public class HelperMain extends AppCompatActivity {

    private ListView lvitems;
    private HelpAdapter adapter=null;
    private ArrayList<Help> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helper_main);

        lvitems =(ListView) findViewById(R.id.lv);
        list=new ArrayList<Help>();

        list.add(new Help("077479464"));
        list.add(new Help("077479464"));
        list.add(new Help("077479464"));
        list.add(new Help("077479464"));

        adapter= new HelpAdapter(this,R.layout.items_help,list);
        lvitems.setAdapter(adapter);

    }
}