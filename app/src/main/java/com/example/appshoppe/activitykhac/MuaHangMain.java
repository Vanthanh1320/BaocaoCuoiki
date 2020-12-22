package com.example.appshoppe.activitykhac;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.appshoppe.R;

public class MuaHangMain extends AppCompatActivity {

    private static final String LOG_TAG ="MuaHangMain" ;
    private ImageButton btnchon;
    Button btnmua;
    EditText hoten, email,sdt,tthanh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mua_hang_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        hoten=(EditText) findViewById(R.id.tv_ten);
        email=(EditText) findViewById(R.id.tv_mail);
        sdt=(EditText) findViewById(R.id.tv_sdt);
        tthanh=(EditText) findViewById(R.id.tv_tinh);
        btnmua=(Button) findViewById(R.id.btn_dh);

        btnmua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail=email.getText().toString();
                String ten=hoten.getText().toString();
                String tinh=tthanh.getText().toString();
                String pass=sdt.getText().toString();

                if (mail.equals("") && pass.equals("") && tinh.equals("") || ten.equals(""))
                    Toast.makeText(MuaHangMain.this, "Vui lòng nhập thông tin đầy đủ", Toast.LENGTH_SHORT).show();
                 else {
                    Toast.makeText(MuaHangMain.this, "Bạn đã mua hàng thành công", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    private void btnchonClicked( )  {
        // When user click on the Button 1, create a PopupMenu.
        // And anchor Popup to the Button 2.
        PopupMenu popup = new PopupMenu(this, this.btnchon);
        popup.inflate(R.menu.layout_popup_menu);

        Menu menu = popup.getMenu();
        // com.android.internal.view.menu.MenuBuilder
        Log.i(LOG_TAG, "Menu class: " + menu.getClass().getName());

        // Register Menu Item Click event.
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return menuItemClicked(item);
            }
        });

        // Show the PopupMenu.
        popup.show();
    }

    private boolean menuItemClicked(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuItem_ag:
                break;
            case R.id.menuItem_bt:
                break;
            case R.id.menuItem_cm:
                break;
            case R.id.menuItem_dn:
                break;
            case R.id.menuItem_gl:
                break;
            case R.id.menuItem_hb:
                break;
            case R.id.menuItem_kh:
                break;
            case R.id.menuItem_qn:
                break;
            case R.id.menuItem_dan:
                break;
            case R.id.menuItem_na:
                break;
            case R.id.menuItem_hp:
                break;
            case R.id.menuItem_hn:
                break;
            case R.id.menuItem_hcm:
                break;
            default:
                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}