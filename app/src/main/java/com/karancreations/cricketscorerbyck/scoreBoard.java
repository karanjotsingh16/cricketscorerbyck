package com.karancreations.cricketscorerbyck;

import androidx.appcompat.app.AppCompatActivity;
import java.lang.Math;

import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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

    int nstRuns = 0;
    int nstBalls = 0;
    float nstStRate = 1;

    int nstFours = 0;
    int nstSixes = 0;

    String nstrikerFours;
    String nstrikerSixes;

    String nstrikerRuns;
    String nstrikerBalls;
    String nstrikerStRate;
    String batsman[] = new String[11];  //Array to store name
    int batsmanRuns[] = new int[11];//Array to store batsman runs
    int batsmanBalls[] = new int[11];//Array to store batsman balls
    int batsmanFours[] = new int[11];//Array to store batsman Fours
    int batsmanSixes[] = new int[11];//Array to store batsman Sixes

    int bowlerBalls = 0;
    int bowlerRuns = 0;
    int bowlerWickets = 0;
    int bowlerOvers = 0;

    String bRuns;
    String bBalls;
    String bWickets;
    String bOvers;

    int bowlereconomy;
    String beconomy;

//    Function that starts on the start of the activity
    @Override
    protected void onStart() {
        super.onStart();
        scStriker = playerDetails.striker;   //store value of striker name to a variable from another activity
        scnonStriker = playerDetails.nonStriker;//store value of non-striker name to a variable from another activity
        scBowler = playerDetails.openingBowler;//store value of bowler name to a variable from another activity
        team1 = CustomMatchInput.nameTeam1;//store value of team1 name to a variable from another activity
        team2 = CustomMatchInput.nameTeam2;//store value of team2 name to a variable from another activity
        teambat = CustomMatchInput.bat;//store value of batting team name to a variable from another activity

        totPlayers = Integer.parseInt(CustomMatchInput.totPlayers);//store value of total players from another activity

        batsman[0] = scStriker;//storing name of 1st batsman in array
        batsman[1] = scnonStriker;//storing name of 2nd batsman in array

        binding.strikersb.setText(batsman[0]);//changing text of batsman in frontend
        binding.nstrikersb.setText(batsman[1]);//changing text of batsman in frontend
        binding.bowlersb.setText(scBowler);//changing text of bowler in frontend
        binding.t1name.setText(team1);//changing text of Team1 in frontend
        binding.t2name.setText(team2);//changing text of Team2 in frontend
        binding.batteam.setText(teambat);//changing text of Batting team in frontend

    }

//    Main Method Starts Here...
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityScoreBoardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();  // To hide Title Bar

        batsman[wickets+1] = com.karancreations.cricketscorerbyck.newBatsman.newBatsman;


        onStart();//Implementing on start method

//        Click on 0 Button Code...
       binding.btn0run.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               totRuns += 0;//to update total runs
               runs = Integer.toString(totRuns);//converting int runs to string runs
               binding.totruns.setText(runs);//changing runs in frontend

               balls += 1;// updating balls
               if (balls == 6){
                   balls = 0;
                   overs += 1;
               }
               totBalls = Integer.toString(balls);//int to string
               totOvers = Integer.toString(overs);//int to string

               binding.balls.setText(totBalls);//changing balls in frontend
               binding.totovers.setText(totOvers);//changing overs in frontend

               strikerRuns += 0;//updating striker runs
               stRuns = Integer.toString(strikerRuns);//int to string
               binding.strikerruns.setText(stRuns);//changing striker runs in frontend

               strikerBalls += 1;//updating striker balls
               stBalls = Integer.toString(strikerBalls);//int to string
               binding.strikerballs.setText(stBalls);//changing striker balls in frontend


//               Calculating and updating Strike Rate
               strikerStrate = (strikerRuns/strikerBalls) * 100;
               stStrikeRate = String.valueOf(strikerStrate);
               binding.strikerstrate.setText(stStrikeRate);

//               Bowler

               bowlerRuns += 0;
               bRuns = Integer.toString(bowlerRuns);
               binding.bowlerruns.setText(bRuns);

               bowlerBalls += 1;// updating bowler balls
               if (bowlerBalls == 6){
                   bowlerBalls = 0;
                   bowlerOvers += 1;
               }

               bBalls = Integer.toString(bowlerBalls);
               binding.bowlerballs.setText(bBalls);

               bOvers = Integer.toString(bowlerOvers);
               binding.bowlerovers.setText(bOvers);

//               bowlereconomy = bowlerRuns/bowlerOvers;
//               beconomy = String.valueOf(bowlereconomy);
//
//               if (bowlerBalls == 0)
//                   binding.bowlerecon.setText(beconomy);


           }
       });

//        Click on 1 Button Code...
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

               if(binding.st1.getVisibility() == View.VISIBLE)
               {
                   strikerRuns += 1;
                   stRuns = Integer.toString(strikerRuns);
                   binding.strikerruns.setText(stRuns);

                   strikerBalls += 1;
                   stBalls = Integer.toString(strikerBalls);
                   binding.strikerballs.setText(stBalls);

                   strikerStrate = (strikerRuns/strikerBalls) * 100;
                   stStrikeRate = String.valueOf(strikerStrate);
                   binding.strikerstrate.setText(stStrikeRate);

                   binding.st1.setVisibility(View.INVISIBLE);
                   binding.st2.setVisibility(View.VISIBLE);

               } else if (binding.st2.getVisibility() == View.VISIBLE) {

                   nstRuns += 1;
                   nstrikerRuns = Integer.toString(nstRuns);
                   binding.nstrikerruns.setText(nstrikerRuns);

                   nstBalls +=1;
                   nstrikerBalls = Integer.toString(nstBalls);
                   binding.nstrikerballs.setText(nstrikerBalls);

                   nstStRate =  (strikerRuns/strikerBalls) * 100;
                   nstrikerStRate = String.valueOf(nstStRate);
                   binding.nstrikerstrate.setText(nstrikerStRate);

                   binding.st2.setVisibility(View.INVISIBLE);
                   binding.st1.setVisibility(View.VISIBLE);
               }

               //               Bowler

               bowlerRuns += 1;
               bRuns = Integer.toString(bowlerRuns);
               binding.bowlerruns.setText(bRuns);

               bowlerBalls += 1;// updating bowler balls
               if (bowlerBalls == 6){
                   bowlerBalls = 0;
                   bowlerOvers += 1;
               }

               bBalls = Integer.toString(bowlerBalls);
               binding.bowlerballs.setText(bBalls);

               bOvers = Integer.toString(bowlerOvers);
               binding.bowlerovers.setText(bOvers);

//               bowlereconomy = bowlerRuns/bowlerOvers;
//               beconomy = String.valueOf(bowlereconomy);
//
//               if (bowlerBalls == 0)
//                   binding.bowlerecon.setText(beconomy);



           }
       });


//        Click on 2 Button Code...
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

                if(binding.st1.getVisibility() == View.VISIBLE)
                {
                    strikerRuns += 2;
                    stRuns = Integer.toString(strikerRuns);
                    binding.strikerruns.setText(stRuns);

                    strikerBalls += 1;
                    stBalls = Integer.toString(strikerBalls);
                    binding.strikerballs.setText(stBalls);

                    strikerStrate = (strikerRuns/strikerBalls) * 100;
                    stStrikeRate = String.valueOf(strikerStrate);
                    binding.strikerstrate.setText(stStrikeRate);

                } else if (binding.st2.getVisibility() == View.VISIBLE) {

                    nstRuns += 2;
                    nstrikerRuns = Integer.toString(nstRuns);
                    binding.nstrikerruns.setText(nstrikerRuns);

                    nstBalls +=1;
                    nstrikerBalls = Integer.toString(nstBalls);
                    binding.nstrikerballs.setText(nstrikerBalls);

                    nstStRate =  (strikerRuns/strikerBalls) * 100;
                    nstrikerStRate = String.valueOf(nstStRate);
                    binding.nstrikerstrate.setText(nstrikerStRate);

                }

                //               Bowler

                bowlerRuns += 2;
                bRuns = Integer.toString(bowlerRuns);
                binding.bowlerruns.setText(bRuns);

                bowlerBalls += 1;// updating bowler balls
                if (bowlerBalls == 6){
                    bowlerBalls = 0;
                    bowlerOvers += 1;
                }

                bBalls = Integer.toString(bowlerBalls);
                binding.bowlerballs.setText(bBalls);

                bOvers = Integer.toString(bowlerOvers);
                binding.bowlerovers.setText(bOvers);

//                bowlereconomy = bowlerRuns/bowlerOvers;
//                beconomy = String.valueOf(bowlereconomy);
//
//                if (bowlerBalls == 0)
//                    binding.bowlerecon.setText(beconomy);


            }
        });


//        Click on 3 Button Code...
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


                if(binding.st1.getVisibility() == View.VISIBLE)
                {
                    strikerRuns += 3;
                    stRuns = Integer.toString(strikerRuns);
                    binding.strikerruns.setText(stRuns);

                    strikerBalls += 1;
                    stBalls = Integer.toString(strikerBalls);
                    binding.strikerballs.setText(stBalls);

                    strikerStrate = (strikerRuns/strikerBalls) * 100;
                    stStrikeRate = String.valueOf(strikerStrate);
                    binding.strikerstrate.setText(stStrikeRate);

                    binding.st1.setVisibility(View.INVISIBLE);
                    binding.st2.setVisibility(View.VISIBLE);

                } else if (binding.st2.getVisibility() == View.VISIBLE) {

                    nstRuns += 3;
                    nstrikerRuns = Integer.toString(nstRuns);
                    binding.nstrikerruns.setText(nstrikerRuns);

                    nstBalls +=1;
                    nstrikerBalls = Integer.toString(nstBalls);
                    binding.nstrikerballs.setText(nstrikerBalls);

                    nstStRate =  (strikerRuns/strikerBalls) * 100;
                    nstrikerStRate = String.valueOf(nstStRate);
                    binding.nstrikerstrate.setText(nstrikerStRate);

                    binding.st2.setVisibility(View.INVISIBLE);
                    binding.st1.setVisibility(View.VISIBLE);
                }

                //               Bowler

                bowlerRuns += 3;
                bRuns = Integer.toString(bowlerRuns);
                binding.bowlerruns.setText(bRuns);

                bowlerBalls += 1;// updating bowler balls
                if (bowlerBalls == 6){
                    bowlerBalls = 0;
                    bowlerOvers += 1;
                }

                bBalls = Integer.toString(bowlerBalls);
                binding.bowlerballs.setText(bBalls);

                bOvers = Integer.toString(bowlerOvers);
                binding.bowlerovers.setText(bOvers);

//                bowlereconomy = bowlerRuns/bowlerOvers;
//                beconomy = String.valueOf(bowlereconomy);
//
//                if (bowlerBalls == 0)
//                    binding.bowlerecon.setText(beconomy);

            }
        });


//        Click on 4 Button Code...
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

                if(binding.st1.getVisibility() == View.VISIBLE)
                {
                    strikerRuns += 4;
                    stRuns = Integer.toString(strikerRuns);
                    binding.strikerruns.setText(stRuns);

                    strikerBalls += 1;
                    stBalls = Integer.toString(strikerBalls);
                    binding.strikerballs.setText(stBalls);

                    strikerStrate = (strikerRuns/strikerBalls) * 100;
                    stStrikeRate = String.valueOf(strikerStrate);
                    binding.strikerstrate.setText(stStrikeRate);

                    strikerFours += 1;
                    stFours = Integer.toString(strikerFours);
                    binding.strikerfours.setText(stFours);


                } else if (binding.st2.getVisibility() == View.VISIBLE) {

                    nstRuns += 4;
                    nstrikerRuns = Integer.toString(nstRuns);
                    binding.nstrikerruns.setText(nstrikerRuns);

                    nstBalls +=1;
                    nstrikerBalls = Integer.toString(nstBalls);
                    binding.nstrikerballs.setText(nstrikerBalls);

                    nstStRate =  (strikerRuns/strikerBalls) * 100;
                    nstrikerStRate = String.valueOf(nstStRate);
                    binding.nstrikerstrate.setText(nstrikerStRate);

                    nstFours += 1;
                    nstrikerFours = Integer.toString(nstFours);
                    binding.nstrikerfours.setText(nstrikerFours);


                }

                //               Bowler

                bowlerRuns += 4;
                bRuns = Integer.toString(bowlerRuns);
                binding.bowlerruns.setText(bRuns);

                bowlerBalls += 1;// updating bowler balls
                if (bowlerBalls == 6){
                    bowlerBalls = 0;
                    bowlerOvers += 1;
                }

                bBalls = Integer.toString(bowlerBalls);
                binding.bowlerballs.setText(bBalls);

                bOvers = Integer.toString(bowlerOvers);
                binding.bowlerovers.setText(bOvers);

//                bowlereconomy = bowlerRuns/bowlerOvers;
//                beconomy = String.valueOf(bowlereconomy);
//
//                if (bowlerBalls == 0)
//                    binding.bowlerecon.setText(beconomy);



            }
        });

//        Click on 5 Button Code...
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


                if(binding.st1.getVisibility() == View.VISIBLE)
                {
                    strikerRuns += 5;
                    stRuns = Integer.toString(strikerRuns);
                    binding.strikerruns.setText(stRuns);

                    strikerBalls += 1;
                    stBalls = Integer.toString(strikerBalls);
                    binding.strikerballs.setText(stBalls);

                    strikerStrate = (strikerRuns/strikerBalls) * 100;
                    stStrikeRate = String.valueOf(strikerStrate);
                    binding.strikerstrate.setText(stStrikeRate);

                    binding.st1.setVisibility(View.INVISIBLE);
                    binding.st2.setVisibility(View.VISIBLE);

                } else if (binding.st2.getVisibility() == View.VISIBLE) {

                    nstRuns += 5;
                    nstrikerRuns = Integer.toString(nstRuns);
                    binding.nstrikerruns.setText(nstrikerRuns);

                    nstBalls +=1;
                    nstrikerBalls = Integer.toString(nstBalls);
                    binding.nstrikerballs.setText(nstrikerBalls);

                    nstStRate =  (strikerRuns/strikerBalls) * 100;
                    nstrikerStRate = String.valueOf(nstStRate);
                    binding.nstrikerstrate.setText(nstrikerStRate);

                    binding.st2.setVisibility(View.INVISIBLE);
                    binding.st1.setVisibility(View.VISIBLE);
                }

                //               Bowler

                bowlerRuns += 5;
                bRuns = Integer.toString(bowlerRuns);
                binding.bowlerruns.setText(bRuns);

                bowlerBalls += 1;// updating bowler balls
                if (bowlerBalls == 6){
                    bowlerBalls = 0;
                    bowlerOvers += 1;
                }

                bBalls = Integer.toString(bowlerBalls);
                binding.bowlerballs.setText(bBalls);

                bOvers = Integer.toString(bowlerOvers);
                binding.bowlerovers.setText(bOvers);

//                bowlereconomy = bowlerRuns/bowlerOvers;
//                beconomy = String.valueOf(bowlereconomy);
//
//                if (bowlerBalls == 0)
//                    binding.bowlerecon.setText(beconomy);


            }
        });

//        Click on 6 Button Code...
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

                if(binding.st1.getVisibility() == View.VISIBLE)
                {
                    strikerRuns += 6;
                    stRuns = Integer.toString(strikerRuns);
                    binding.strikerruns.setText(stRuns);

                    strikerBalls += 1;
                    stBalls = Integer.toString(strikerBalls);
                    binding.strikerballs.setText(stBalls);

                    strikerStrate = (strikerRuns/strikerBalls) * 100;
                    stStrikeRate = String.valueOf(strikerStrate);
                    binding.strikerstrate.setText(stStrikeRate);

                    strikerSixes += 1;
                    stSixes = Integer.toString(strikerSixes);
                    binding.strikersixes.setText(stSixes);


                } else if (binding.st2.getVisibility() == View.VISIBLE) {

                    nstRuns += 6;
                    nstrikerRuns = Integer.toString(nstRuns);
                    binding.nstrikerruns.setText(nstrikerRuns);

                    nstBalls +=1;
                    nstrikerBalls = Integer.toString(nstBalls);
                    binding.nstrikerballs.setText(nstrikerBalls);

                    nstStRate =  (strikerRuns/strikerBalls) * 100;
                    nstrikerStRate = String.valueOf(nstStRate);
                    binding.nstrikerstrate.setText(nstrikerStRate);

                    nstSixes += 1;
                    nstrikerSixes = Integer.toString(nstSixes);
                    binding.nstrikersixes.setText(nstrikerSixes);


                }

                //               Bowler

                bowlerRuns += 6;
                bRuns = Integer.toString(bowlerRuns);
                binding.bowlerruns.setText(bRuns);

                bowlerBalls += 1;// updating bowler balls
                if (bowlerBalls == 6){
                    bowlerBalls = 0;
                    bowlerOvers += 1;
                }

                bBalls = Integer.toString(bowlerBalls);
                binding.bowlerballs.setText(bBalls);

                bOvers = Integer.toString(bowlerOvers);
                binding.bowlerovers.setText(bOvers);

//                bowlereconomy = bowlerRuns/bowlerOvers;
//                beconomy = String.valueOf(bowlereconomy);
//
//                if (bowlerBalls == 0)
//                    binding.bowlerecon.setText(beconomy);



            }
        });

//        Click on wicket Button Code...
        binding.btnwicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wickets += 1;//updating wickets
                wick = Integer.toString(wickets);//int to string
                binding.totwickets.setText(wick);//changing wickets in frontend

                balls += 1;//updating balls
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

//               Bowler

                bowlerRuns += 0;
                bRuns = Integer.toString(bowlerRuns);
                binding.bowlerruns.setText(bRuns);

                bowlerBalls += 1;// updating bowler balls
                if (bowlerBalls == 6){
                    bowlerBalls = 0;
                    bowlerOvers += 1;
                }

                bBalls = Integer.toString(bowlerBalls);
                binding.bowlerballs.setText(bBalls);

                bOvers = Integer.toString(bowlerOvers);
                binding.bowlerovers.setText(bOvers);

                bowlerWickets += 1;
                bWickets = Integer.toString(bowlerWickets);
                binding.bowlerwickets.setText(bWickets);

//                bowlereconomy = bowlerRuns/bowlerOvers;
//                beconomy = String.valueOf(bowlereconomy);
//
//                if (bowlerBalls == 0)
//                    binding.bowlerecon.setText(beconomy);

                binding.newbatsmanpanel.setVisibility(View.VISIBLE);



            }
        });

        binding.newbatsmanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.st1.getVisibility() == View.VISIBLE)
                {
                    int i = wickets + 1;
                    scStriker = binding.newbatsmaninput.getText().toString();
                    batsman[i] = binding.newbatsmaninput.getText().toString();
                    binding.strikersb.setText(scStriker);
                    binding.newbatsmanpanel.setVisibility(View.INVISIBLE);
                    batsmanRuns[i-2] = strikerRuns;
                    String bRuns = String.valueOf(batsmanRuns[0]);
                    Toast.makeText(scoreBoard.this, bRuns, Toast.LENGTH_SHORT).show();
                }
                else if (binding.st2.getVisibility() == View.VISIBLE)
                {
                    scnonStriker = binding.newbatsmaninput.getText().toString();
                    batsman[wickets + 1] = binding.newbatsmaninput.getText().toString();
                    binding.nstrikersb.setText(scnonStriker);
                    binding.newbatsmanpanel.setVisibility(View.INVISIBLE);
                }
            }
        });



    }
}