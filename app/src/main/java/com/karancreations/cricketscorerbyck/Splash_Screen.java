package com.karancreations.cricketscorerbyck;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.view.View;
import android.view.WindowManager;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.karancreations.cricketscorerbyck.databinding.ActivitySplashScreenBinding;

public class Splash_Screen extends AppCompatActivity {

    private static final int SPLASH_SCREEN_TIME_OUT = 3000;
    private AppBarConfiguration appBarConfiguration;
    private ActivitySplashScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySplashScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // It is used to hide Title Bar from screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen); // this will bind your MainActivity.class file with activity_main.

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Intent is used to switch from one activity to another.
                Intent i = new Intent(Splash_Screen.this, selectMatch.class);
                startActivity(i); // invoke the SecondActivity.
                finish(); // the current activity will get finished.
            }


        }, SPLASH_SCREEN_TIME_OUT);
    }

}
