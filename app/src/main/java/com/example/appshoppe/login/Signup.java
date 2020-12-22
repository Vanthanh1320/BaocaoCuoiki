package com.example.appshoppe.login;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.appshoppe.MainActivity;
import com.example.appshoppe.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Signup extends AppCompatActivity {
    EditText  username, password,retyppassword;
    Button signin;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        username=(EditText) findViewById(R.id.edt_user_signup);
        password=(EditText) findViewById(R.id.edt_pass_signup);
        retyppassword=(EditText) findViewById(R.id.edt_repass_signup);
        signin=(Button) findViewById(R.id.btn_lg);
        DB=new DBHelper(this);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user= username.getText().toString();
                String pass= password.getText().toString();
                String repass= retyppassword.getText().toString();

                if (user.equals("") || pass.equals("") || repass.equals(""))
                    Toast.makeText(Signup.this,"Vui lòng nhập thông tin đầy đủ",Toast.LENGTH_SHORT).show();
                else {
                    if (pass.equals(repass)){
                        Boolean checkuser=DB.checkusername(user);
                        if (checkuser==false){
                            Boolean insert=DB.insertData(user,pass);
                            if (insert==true){
                                Toast.makeText(Signup.this,"Đăng ký thành công",Toast.LENGTH_SHORT).show();
                                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                                startActivity(intent);
                            }else {
                                Toast.makeText(Signup.this,"Đăng ký thất bại",Toast.LENGTH_SHORT).show();
                            }
                        }else {
                            Toast.makeText(Signup.this,"Nhập tên đăng ký",Toast.LENGTH_SHORT).show();
                        }
                    }else {
                        Toast.makeText(Signup.this,"Mật khẩu không khớp",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

//        bplogin = (Button) findViewById(R.id.aftersignup);
//        bplogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Signup.this, MainActivity.class);
//                startActivity(intent);
//            }
//        });
    }

//    @RequiresApi(api = Build.VERSION_CODES.N)
//    private void updateLabel() {
//        final Calendar myCalendar = Calendar.getInstance();
//        int ngay = myCalendar.get(Calendar.DATE);
//        int thang = myCalendar.get(Calendar.MONTH);
//        int nam = myCalendar.get(Calendar.YEAR);
//        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
//            @Override
//            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
//                myCalendar.set(year,month,dayOfMonth);
//                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//                edittext.setText(simpleDateFormat.format(myCalendar.getTime()));
//            }
//        },nam, thang, ngay);
//        datePickerDialog.show();
//    }
//
//        public void login(View view){
//        startActivity(new Intent(getApplicationContext(), MainActivity.class));
//    }
}
