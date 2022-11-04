package com.example.lasttry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    public static final String TAB = "TAB";
    EditText mFullName,mEmail,mPassword,mPhone;
    Button mRegisterBtn;
    TextView mloginBtn;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        mFullName = findViewById(R.id.fullname);
        mEmail = findViewById(R.id.email);
        mPassword = findViewById(R.id.password);
        mPhone = findViewById(R.id.phone);
        mRegisterBtn = findViewById(R.id.registerbtn);
        mloginBtn = findViewById(R.id.registerbtn);
        progressBar = findViewById(R.id.progressBar);


        mloginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Login.class));
            }
        });




       mRegisterBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               final String email = mEmail.getText().toString().trim();
               String password = mPassword.getText().toString().trim();
               final String fullname = mFullName.getText().toString().trim();
               final String phone = mPhone.getText().toString().trim();



               if (TextUtils.isEmpty(email)) {
                   mEmail.setError("email is requird");
                   return;
               }

               if (TextUtils.isEmpty((password))){
                   mPassword.setError("password is required");
                   return;
               }


               if (password.length() < 6){

                   mPassword.setError("password must be >= 6 character ");
                   return;
               }

               progressBar.setVisibility(View.VISIBLE);
           }
       });










    }
}