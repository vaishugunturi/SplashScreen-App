package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Sign_Up_Activity extends AppCompatActivity {

    EditText signupEmail;
    EditText signupPassword;
    Button btsSignup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("SignUp");
        setContentView(R.layout.activity_sign_up);

        signupEmail = findViewById(R.id.editTextsignuppagePasswordEmailAddress);
        signupPassword = findViewById(R.id.editTextsignuppagePassword);
        btsSignup = findViewById(R.id.buttonsignuppage);


        btsSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userSignupEmail = signupEmail.getText().toString();
                String userSignupPassword = signupPassword.getText().toString();


            }
        });
    }
}