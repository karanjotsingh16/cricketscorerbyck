package com.karancreations.cricketscorerbyck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.karancreations.cricketscorerbyck.databinding.ActivityCustomMatchInputBinding;

public class CustomMatchInput extends AppCompatActivity {


    ActivityCustomMatchInputBinding binding;
    static String nameTeam1;
    static String nameTeam2;
    static String resToss;
    static String totOvers;
    static String totPlayers;

    static String bat;
    static int tOvers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityCustomMatchInputBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();  // To hide Title Bar

//        Name of Team 1
        nameTeam1 = binding.team1Name.getText().toString();
//        Name of Team 2
        nameTeam2 = binding.team2Name.getText().toString();


//          Button to change Radio button text with Team Names
       binding.nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Changing name of the teams in Radio Buttons

//                Name of Team 1
                nameTeam1 = binding.team1Name.getText().toString();
//                Name of Team 2
                nameTeam2 = binding.team2Name.getText().toString();
                binding.tossTeam1.setText(nameTeam1);
                binding.tossTeam2.setText(nameTeam2);

                Toast.makeText(CustomMatchInput.this, "Proceed further...", Toast.LENGTH_SHORT).show();
            }
        });



//        Start Match Button Code
        binding.startMatchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//            Storing the final result of the Toss
                if (binding.tossTeam1.isChecked()) {
                    if (binding.bat.isChecked()) {
                        resToss = nameTeam1 + " opted to bat first";
                        bat = nameTeam1;
                    } else if(binding.bowl.isChecked()){
                        resToss = nameTeam1 + " opted to bowl first";
                        bat = nameTeam2;
                    }
                } else if (binding.tossTeam2.isChecked()) {
                    if (binding.bat.isChecked()) {
                        resToss = nameTeam2 + " opted to bat first";
                        bat = nameTeam2;
                    } else if (binding.bowl.isChecked()){
                        resToss = nameTeam2 + " opted to bowl first";
                        bat  = nameTeam1;
                    }
                }

//        Selecting bat or bowl Radio Buttons
                totOvers = binding.overs.getText().toString();
                tOvers = Integer.parseInt(totOvers);

//        Storing total number of Players per team
                totPlayers = binding.players.getText().toString();

//                Toast to check whether the above logic works correctly
                Toast.makeText(CustomMatchInput.this,  resToss, Toast.LENGTH_SHORT).show();

//                Next Activity Code
                Intent playerDetails = new Intent(getApplicationContext(), playerDetails.class);
                startActivity(playerDetails);
            }
        });

//        When user click on Back button
        binding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }
}