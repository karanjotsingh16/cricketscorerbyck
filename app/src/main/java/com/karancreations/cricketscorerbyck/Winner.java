package com.karancreations.cricketscorerbyck;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import com.karancreations.cricketscorerbyck.databinding.ActivityWinnerBinding;

public class Winner extends AppCompatActivity {
    ActivityWinnerBinding binding;


    String totWickets;
    String batTeam;
    String team1;
    String team2;
    String[] temp = {"Wickets", "Runs"};
    @Override
    protected void onStart() {
        super.onStart();
        totWickets = CustomMatchInput.totPlayers;
        batTeam = CustomMatchInput.bat;
        team1 = CustomMatchInput.nameTeam1;
        team2 = CustomMatchInput.nameTeam2;
        temp = new String[2];


        if (batTeam == team1) {
            binding.txtteamname.setText(team2);
        }
        else {
            binding.txtteamname.setText(team1);
        }

        binding.txtrunswickets.setText(totWickets);
        binding.txtRunswicketsname.setText(temp[0]);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);

    }
}