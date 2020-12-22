package com.example.appshoppe.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.appshoppe.HelperMain;
import com.example.appshoppe.R;
import com.example.appshoppe.login.Login;

public class SettingActivity extends AppCompatActivity {

    Button btndangxuat,btnhotro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        btndangxuat=(Button) findViewById(R.id.btdx);
        btndangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingActivity.this, Login.class);
                startActivity(intent);
            }
        });
//        btnhotro=(Button) findViewById(R.id.Nn);
//        btnhotro.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SettingActivity.this, HelperMain.class);
//                startActivity(intent);
//            }
//        });
    }
}