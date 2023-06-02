package com.karancreations.cricketscorerbyck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.karancreations.cricketscorerbyck.databinding.ActivityNewBatsmanBinding;

public class newBatsman extends AppCompatActivity {

    ActivityNewBatsmanBinding binding;

    static String newBatsman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNewBatsmanBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();  // To hide Title Bar

        newBatsman = binding.newBatsman.getText().toString();

        binding.btnnewBatsman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //                Next Activity Code
                Intent scoreboard = new Intent(getApplicationContext(), scoreBoard.class);
                startActivity(scoreboard);
            }
        });


    }
}