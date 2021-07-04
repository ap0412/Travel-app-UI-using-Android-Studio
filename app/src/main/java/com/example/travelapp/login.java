package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class login extends AppCompatActivity {
    Button signup,login,loginbtn;
    EditText loginemail,loginpassword;
    private LinearLayout loginmain, signmain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        utils.blackIconStatusBar(login.this,R.color.white);
         signup= findViewById(R.id.signup);
         loginmain= findViewById(R.id.loginmain);
         signmain= findViewById(R.id.signmain);
         loginbtn= findViewById(R.id.loginbtn);
         login= findViewById(R.id.login);
         loginemail= findViewById(R.id.loginemail);
         loginpassword = findViewById(R.id.loginpassword);


         signup.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 loginmain.setVisibility(View.GONE);
                 signmain.setVisibility(View.VISIBLE);

             }
         });
         login.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 loginmain.setVisibility(View.VISIBLE);
                 signmain.setVisibility(View.GONE);
             }
         });
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(loginemail.getText().toString().equals("Sanish.shyam@gmail.com")&& loginpassword.getText().toString().equals("sanish1234")){


                    Intent intent= new Intent(login.this,loadingfile.class);
                    startActivity(intent);

                }
                else{
                    Toast.makeText(login.this, "Invalid email or password", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}