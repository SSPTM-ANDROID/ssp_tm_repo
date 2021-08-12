package com.ssp.android;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText loginUser, password;
    Button signInBtn, signUpBtn;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        loginUser = findViewById(R.id.login_user);
        password = findViewById(R.id.login_pwd);
        signInBtn = findViewById(R.id.signIn);
        signUpBtn = findViewById(R.id.signUp);

        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent studentRegisterIntent = new Intent(getApplicationContext(), StudentRegisterActivity.class);
                startActivity(studentRegisterIntent);
            }
        });
    }
}
