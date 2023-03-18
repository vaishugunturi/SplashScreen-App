package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.gms.common.SignInButton;

public class Login_Activity extends AppCompatActivity {

    EditText email;
    EditText password;
    Button login;
    TextView signup;

    SignInButton googleButton;

    TextView forgotPassword;
    ProgressBar progressBar;



    

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Login");
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.editTextEmailAddress);
        password = findViewById(R.id.editTextPassword);
        login = findViewById(R.id.buttonLogin);
        signup = findViewById(R.id.signInButtongoogle);
        progressBar = findViewById(R.id.progressBar);

        forgotPassword = findViewById(R.id.textviewforgotpassword);
        googleButton = findViewById(R.id.signInButtongoogle);

        progressBar.setVisibility(View.INVISIBLE);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userEmail = email.getText().toString();
                String userPassword = password.getText().toString();

            }
        });
        googleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Login_Activity.this,Sign_Up_Activity.class);
                startActivity(i);
                finish();

            }
        });

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
    public void signInGoogle(String userEmail,String userPassword){

        progressBar.setVisibility(View.VISIBLE);
        login.setClickable(false);



    }
}