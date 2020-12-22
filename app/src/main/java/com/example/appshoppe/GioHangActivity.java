package com.example.appshoppe;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class GioHangActivity extends AppCompatActivity {

    ImageButton back;
    Button btn_tieptuc;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giohang);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        back=(ImageButton) findViewById(R.id.imb_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GioHangActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btn_tieptuc=(Button) findViewById(R.id.bt_mua);
        btn_tieptuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GioHangActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
