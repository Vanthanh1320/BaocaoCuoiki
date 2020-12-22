package com.example.appshoppe.activitykhac;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.appshoppe.R;

public class MapActivity extends AppCompatActivity {

    EditText etSource;
    Button btn_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        etSource=findViewById(R.id.et_diachi);
        btn_go=findViewById(R.id.bt_track);

        btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sSource=etSource.getText().toString().trim();

                if(sSource.equals("")){
                    Toast.makeText(getApplicationContext(),"Enter both location",Toast.LENGTH_SHORT).show();
                }else {
                    DisplayTrack(sSource);
                }
            }
        });
    }

    private void DisplayTrack(String sSource) {
        try {
            Uri uri=Uri.parse("https://www.google.co.in/maps/dir/" + sSource );
            Intent intent=new Intent(Intent.ACTION_VIEW,uri);
            intent.setPackage("com.google.android.apps.maps");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }catch (ActivityNotFoundException e){
            Uri uri=Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
            Intent intent=new Intent(Intent.ACTION_VIEW,uri);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }
}