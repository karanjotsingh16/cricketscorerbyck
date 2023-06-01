package com.karancreations.cricketscorerbyck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.karancreations.cricketscorerbyck.databinding.ActivityPlayerDetailsBinding;

public class playerDetails extends AppCompatActivity {

    ActivityPlayerDetailsBinding binding;

    static String striker;
    static String nonStriker;
    static String openingBowler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPlayerDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();  // To hide Title Bar

//        Next Button Code
        binding.nextbtnplayerdetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                striker = binding.striker.getText().toString();
                nonStriker = binding.nstriker.getText().toString();
                openingBowler = binding.obowler.getText().toString();
                Intent scoreboard = new Intent(getApplicationContext(), scoreBoard.class);
                startActivity(scoreboard);
            }
        });

    }
}