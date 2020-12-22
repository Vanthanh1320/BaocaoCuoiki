package com.example.appshoppe;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ProgressBar;

import com.example.appshoppe.login.Login;

public class BannerMain extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        CountDownTimer countDownTimer=new CountDownTimer(5000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {

            }
        };
        countDownTimer.start();

        Thread bamgio=new Thread(){
            public void run()
            {
                try {
                    sleep(5000);
                } catch (Exception e) {

                }
                finally
                {
                    Intent activitymoi=new Intent(BannerMain.this, Login.class);
                    startActivity(activitymoi);
                }
            }
        };
        bamgio.start();
    }

    protected void onPause(){
        super.onPause();
        finish();
    }
}