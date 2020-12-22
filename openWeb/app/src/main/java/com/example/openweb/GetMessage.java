package com.example.openweb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GetMessage extends AppCompatActivity {
    Button btnPose;

    EditText usrName;
    EditText usrPwd;
    EditText usrPwd2;
    EditText usrEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_message_activity);
        init();


        btnPose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pwd1 = usrPwd.getText().toString();
                String pwd2 = usrPwd2.getText().toString();

                if(!pwd1.equals(pwd2)){
                    usrPwd.setText("");
                    usrPwd2.setText("");
                    Toast.makeText(GetMessage.this,"两次密码输入不一致",Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(GetMessage.this,ShowMessage.class);
                    intent.putExtra("name",usrName.getText().toString());
                    intent.putExtra("pwd",usrPwd.getText().toString());
                    intent.putExtra("email",usrEmail.getText().toString());
                    startActivity(intent);
                }

            }
        });


    }

    private void init(){
        btnPose = findViewById(R.id.btnPose);
        usrName = findViewById(R.id.usrName);
        usrPwd = findViewById(R.id.usrPwd1);
        usrPwd2 = findViewById(R.id.usrPwd2);
        usrEmail = findViewById(R.id.usrEmail);
    }
}
