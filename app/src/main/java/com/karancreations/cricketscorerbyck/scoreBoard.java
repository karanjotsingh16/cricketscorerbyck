package com.karancreations.cricketscorerbyck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.karancreations.cricketscorerbyck.databinding.ActivityScoreBoardBinding;
import com.karancreations.cricketscorerbyck.playerDetails;

public class scoreBoard extends AppCompatActivity {
    ActivityScoreBoardBinding binding;

    String scStriker;
    String scnonStriker;
    String scBowler;
    String team1;
    String team2;
    String teambat;
    int totRuns = 0;

    String runs;
    int overs = 0;
    int balls = 0;
    String totOvers;
    String totBalls;
    int wickets = 0;
    String wick;
    int totPlayers;

    int strikerRuns = 0;
    String stRuns;

    int strikerBalls = 0;
    String stBalls;

    int strikerFours = 0;
    String stFours;

    int strikerSixes = 0;
    String stSixes;

    float strikerStrate = 1;
    String stStrikeRate;

    String batsman[] = new String[11];

    @Override
    protected void onStart() {
        super.onStart();
        scStriker = playerDetails.striker;
        scnonStriker = playerDetails.nonStriker;
        scBowler = playerDetails.openingBowler;
        team1 = CustomMatchInput.nameTeam1;
        team2 = CustomMatchInput.nameTeam2;
        teambat = CustomMatchInput.bat;

        totPlayers = Integer.parseInt(CustomMatchInput.totPlayers);

        batsman[0] = scStriker;
        batsman[1] = scnonStriker;

        binding.strikersb.setText(batsman[0]);
        binding.nstrikersb.setText(batsman[1]);
        binding.bowlersb.setText(scBowler);
        binding.t1name.setText(team1);
        binding.t2name.setText(team2);
        binding.batteam.setText(teambat);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityScoreBoardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();  // To hide Title Bar

        batsman[wickets+1] = com.karancreations.cricketscorerbyck.newBatsman.newBatsman;


        onStart();

       binding.btn0run.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               totRuns += 0;
               runs = Integer.toString(totRuns);
               binding.totruns.setText(runs);

               balls += 1;
               if (balls == 6){
                   balls = 0;
                   overs += 1;
               }
               totBalls = Integer.toString(balls);
               totOvers = Integer.toString(overs);

               binding.balls.setText(totBalls);
               binding.totovers.setText(totOvers);

               strikerRuns += 0;
               stRuns = Integer.toString(strikerRuns);
               binding.strikerruns.setText(stRuns);

               strikerBalls += 1;
               stBalls = Integer.toString(strikerBalls);
               binding.strikerballs.setText(stBalls);


               strikerStrate = (strikerRuns/strikerBalls) * 100;
               stStrikeRate = String.valueOf(strikerStrate);
               binding.strikerstrate.setText(stStrikeRate);

           }
       });

       binding.btn1run.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               totRuns += 1;
               runs = Integer.toString(totRuns);
               binding.totruns.setText(runs);

               balls += 1;
               if (balls == 6){
                   balls = 0;
                   overs += 1;
               }
               totBalls = Integer.toString(balls);
               totOvers = Integer.toString(overs);

               binding.balls.setText(totBalls);
               binding.totovers.setText(totOvers);

               strikerRuns += 1;
               stRuns = Integer.toString(strikerRuns);
               binding.strikerruns.setText(stRuns);

               strikerBalls += 1;
               stBalls = Integer.toString(strikerBalls);
               binding.strikerballs.setText(stBalls);

               strikerStrate = (strikerRuns/strikerBalls) * 100;
               stStrikeRate = String.valueOf(strikerStrate);
               binding.strikerstrate.setText(stStrikeRate);

           }
       });



        binding.btn2run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totRuns += 2;
                runs = Integer.toString(totRuns);
                binding.totruns.setText(runs);

                balls += 1;
                if (balls == 6){
                    balls = 0;
                    overs += 1;
                }
                totBalls = Integer.toString(balls);
                totOvers = Integer.toString(overs);

                binding.balls.setText(totBalls);
                binding.totovers.setText(totOvers);

                strikerRuns += 2;
                stRuns = Integer.toString(strikerRuns);
                binding.strikerruns.setText(stRuns);

                strikerBalls += 1;
                stBalls = Integer.toString(strikerBalls);
                binding.strikerballs.setText(stBalls);


                strikerStrate = (strikerRuns/strikerBalls) * 100;
                stStrikeRate = String.valueOf(strikerStrate);
                binding.strikerstrate.setText(stStrikeRate);

            }
        });



        binding.btn3run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totRuns += 3;
                runs = Integer.toString(totRuns);
                binding.totruns.setText(runs);

                balls += 1;
                if (balls == 6){
                    balls = 0;
                    overs += 1;
                }
                totBalls = Integer.toString(balls);
                totOvers = Integer.toString(overs);

                binding.balls.setText(totBalls);
                binding.totovers.setText(totOvers);

                strikerRuns += 3;
                stRuns = Integer.toString(strikerRuns);
                binding.strikerruns.setText(stRuns);

                strikerBalls += 1;
                stBalls = Integer.toString(strikerBalls);
                binding.strikerballs.setText(stBalls);

                strikerStrate = (strikerRuns/strikerBalls) * 100;
                stStrikeRate = String.valueOf(strikerStrate);
                binding.strikerstrate.setText(stStrikeRate);

            }
        });



        binding.btn4run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totRuns += 4;
                runs = Integer.toString(totRuns);
                binding.totruns.setText(runs);

                balls += 1;
                if (balls == 6){
                    balls = 0;
                    overs += 1;
                }
                totBalls = Integer.toString(balls);
                totOvers = Integer.toString(overs);

                binding.balls.setText(totBalls);
                binding.totovers.setText(totOvers);

                strikerRuns += 4;
                stRuns = Integer.toString(strikerRuns);
                binding.strikerruns.setText(stRuns);

                strikerBalls += 1;
                stBalls = Integer.toString(strikerBalls);
                binding.strikerballs.setText(stBalls);

                strikerFours += 1;
                stFours = Integer.toString(strikerFours);
                binding.strikerfours.setText(stFours);

                strikerStrate = (strikerRuns/strikerBalls) * 100;
                stStrikeRate = String.valueOf(strikerStrate);
                binding.strikerstrate.setText(stStrikeRate);


            }
        });


        binding.btn5run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totRuns += 5;
                runs = Integer.toString(totRuns);
                binding.totruns.setText(runs);

                balls += 1;
                if (balls == 6){
                    balls = 0;
                    overs += 1;
                }
                totBalls = Integer.toString(balls);
                totOvers = Integer.toString(overs);

                binding.balls.setText(totBalls);
                binding.totovers.setText(totOvers);

                strikerRuns += 5;
                stRuns = Integer.toString(strikerRuns);
                binding.strikerruns.setText(stRuns);

                strikerBalls += 1;
                stBalls = Integer.toString(strikerBalls);
                binding.strikerballs.setText(stBalls);

                strikerStrate = (strikerRuns/strikerBalls) * 100;
                stStrikeRate = String.valueOf(strikerStrate);
                binding.strikerstrate.setText(stStrikeRate);


            }
        });


        binding.btn6run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totRuns += 6;
                runs = Integer.toString(totRuns);
                binding.totruns.setText(runs);

                balls += 1;
                if (balls == 6){
                    balls = 0;
                    overs += 1;
                }
                totBalls = Integer.toString(balls);
                totOvers = Integer.toString(overs);

                binding.balls.setText(totBalls);
                binding.totovers.setText(totOvers);

                strikerRuns += 6;
                stRuns = Integer.toString(strikerRuns);
                binding.strikerruns.setText(stRuns);

                strikerBalls += 1;
                stBalls = Integer.toString(strikerBalls);
                binding.strikerballs.setText(stBalls);

                strikerSixes += 1;
                stSixes = Integer.toString(strikerSixes);
                binding.strikersixes.setText(stSixes);

                strikerStrate = (strikerRuns/strikerBalls) * 100;
                stStrikeRate = String.valueOf(strikerStrate);
                binding.strikerstrate.setText(stStrikeRate);


            }
        });

        binding.btnwicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wickets += 1;
                wick = Integer.toString(wickets);
                binding.totwickets.setText(wick);

                balls += 1;
                if (balls == 6){
                    balls = 0;
                    overs += 1;
                }
                totBalls = Integer.toString(balls);
                totOvers = Integer.toString(overs);

                binding.balls.setText(totBalls);
                binding.totovers.setText(totOvers);

                strikerBalls += 1;
                stBalls = Integer.toString(strikerBalls);
                binding.strikerballs.setText(stBalls);

                //                Next Activity Code
                Intent newBatsman = new Intent(getApplicationContext(), newBatsman.class);
                startActivity(newBatsman);

                batsman[wickets+1] = com.karancreations.cricketscorerbyck.newBatsman.newBatsman;




            }
        });



    }
}