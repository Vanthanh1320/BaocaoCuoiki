package com.example.appshoppe;

import android.content.Intent;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.appshoppe.bottom.HomeFragment;
import com.example.appshoppe.bottom.MessageFragment;
import com.example.appshoppe.bottom.SearchFragment;
import com.example.appshoppe.profile.Profile;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class GridActivity extends AppCompatActivity {

    TextView ten1,ten2,gia1,gia2;
    ImageView anh1,anh2;
    ImageButton back;
    Button btnbuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        ten1=findViewById(R.id.tengiay);
        ten2=findViewById(R.id.tv_tentieude);
        gia1=findViewById(R.id.giagiay);
        gia2=findViewById(R.id.tv_seller);
        anh1=findViewById(R.id.anh);
        anh2=findViewById(R.id.imabt_anhnho);

        btnbuy=(Button) findViewById(R.id.buy);
        btnbuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GridActivity.this,GioHangActivity.class);
                startActivity(intent);
            }
        });


        Intent intent=getIntent();
        String receivedname=intent.getStringExtra("name");
        String receivedcount=intent.getStringExtra("count");
        int receivedimage=intent.getIntExtra("image",0);

        back=(ImageButton) findViewById(R.id.imb_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(GridActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


        ten1.setText(receivedname);
        ten2.setText(receivedname);
        gia1.setText(receivedcount);
        gia2.setText(receivedcount);
        anh1.setImageResource(receivedimage);
        anh2.setImageResource(receivedimage);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}
