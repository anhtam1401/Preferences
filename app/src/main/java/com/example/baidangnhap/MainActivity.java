package com.example.baidangnhap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton imgDangNhap;
    EditText txtUser, txtPass;
    CheckBox cbNhoMk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        imgDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = txtUser.getText().toString().trim();
                String password= txtPass.getText().toString().trim();
                if(username.equals("anhtam") && password.equals("1")) {
                    Toast.makeText(MainActivity.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Lỗi đăng nhập", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void Anhxa(){
        imgDangNhap = (ImageButton) findViewById(R.id.buttonSignin);
        txtUser = (EditText) findViewById(R.id.editUser);
        txtPass = (EditText) findViewById(R.id.editPassword);
        cbNhoMk = (CheckBox) findViewById(R.id.checkboxNhoMK);
    }
}