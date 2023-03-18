package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splashscreeenActivity extends AppCompatActivity {
    ImageView title,logo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreeen);

        logo = findViewById(R.id.imageViewLogo);
        title = findViewById(R.id.imageViewTitle);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.splash_animation);
        title.startAnimation(animation);
        logo.startAnimation(animation);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashscreeenActivity.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        },6000);
    }
}