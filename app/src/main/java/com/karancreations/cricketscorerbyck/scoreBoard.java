package com.karancreations.cricketscorerbyck;

import androidx.appcompat.app.AppCompatActivity;

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

        binding.strikersb.setText(scStriker);
        binding.nstrikersb.setText(scnonStriker);
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


            }
        });



    }
}