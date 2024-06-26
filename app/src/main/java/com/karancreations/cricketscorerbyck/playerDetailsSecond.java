package com.karancreations.cricketscorerbyck;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.karancreations.cricketscorerbyck.databinding.ActivityPlayerDetailsBinding;
import com.karancreations.cricketscorerbyck.databinding.ActivityPlayerDetailsSecondBinding;

public class playerDetailsSecond extends AppCompatActivity {

    ActivityPlayerDetailsSecondBinding binding;

    static String strikerSecInn;
    static String nonStrikerSecInn;
    static String openingBowlerSecInn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPlayerDetailsSecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();  // To hide Title Bar

//        Next Button Code
        binding.nextbtnplayerdetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strikerSecInn = binding.striker.getText().toString();
                nonStrikerSecInn = binding.nstriker.getText().toString();
                openingBowlerSecInn = binding.obowler.getText().toString();
                Intent scoreboardSecond = new Intent(getApplicationContext(), scoreBoardSecond.class);
                startActivity(scoreboardSecond);
            }
        });

    }
}