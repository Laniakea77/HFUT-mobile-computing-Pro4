package com.example.openweb;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowMessage extends AppCompatActivity {
    TextView usrNameShow;
    TextView usrPwdShow;
    TextView usrEmailShow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_message_activity);
        init();
        Intent intent = getIntent();

        usrNameShow.setText(intent.getStringExtra("name"));
        usrPwdShow.setText(intent.getStringExtra("pwd"));
        usrEmailShow.setText(intent.getStringExtra("email"));

    }

    private void init(){
        usrEmailShow = findViewById(R.id.show_email);
        usrNameShow = findViewById(R.id.show_name);
        usrPwdShow = findViewById(R.id.show_pwd);
    }
}
