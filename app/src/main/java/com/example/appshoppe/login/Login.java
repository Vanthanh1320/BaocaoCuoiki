package com.example.appshoppe.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.appshoppe.MainActivity;
import com.example.appshoppe.R;
import com.example.appshoppe.facebook.MainFacebook;

public class Login extends AppCompatActivity {
    Button btn_login;
    TextView txtsignup;
    EditText username, password;
    DBHelper DB;
    ImageView imageface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Login Form");

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        txtsignup= (TextView) findViewById(R.id.tv_sign);
        txtsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Signup.class);
                startActivity(intent);
            }
        });

        imageface=(ImageView) findViewById(R.id.image_face);
        imageface.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login.this, MainFacebook.class);
                startActivity(intent);
            }
        });

        username=(EditText) findViewById(R.id.edt_user);
        password=(EditText) findViewById(R.id.edt_pass);
        btn_login=(Button) findViewById(R.id.btn_lg);
        DB=new DBHelper(this);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=username.getText().toString();
                String pass=password.getText().toString();

                if (user.equals("") ||pass.equals(""))
                    Toast.makeText(Login.this,"Vui lòng nhập thông tin đầy đủ",Toast.LENGTH_SHORT).show();
                else {
                    Boolean checkuserpass=DB.checkusernamepassword(user,pass);
                    if (checkuserpass==true){
                        Toast.makeText(Login.this,"Đăng nhập thành công",Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(Login.this,"Tài khoản không hợp lệ",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });



    }

}