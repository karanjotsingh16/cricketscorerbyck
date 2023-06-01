package com.karancreations.cricketscorerbyck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.karancreations.cricketscorerbyck.databinding.ActivityScoreBoardBinding;

public class scoreBoard extends AppCompatActivity {
    ActivityScoreBoardBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityScoreBoardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();  // To hide Title Bar

    }
}