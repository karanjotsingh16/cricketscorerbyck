package com.karancreations.cricketscorerbyck;

import static com.karancreations.cricketscorerbyck.CustomMatchInput.tOvers;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.karancreations.cricketscorerbyck.databinding.ActivityScoreBoardBinding;
import com.karancreations.cricketscorerbyck.databinding.ActivityScoreBoardSecondBinding;

public class scoreBoardSecond extends AppCompatActivity {
    ActivityScoreBoardSecondBinding binding;

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
    static String batsman[] = new String[11];  //Array to store name of variables

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

    String newBatsman;


        static int firstInnRuns;
        static String firstInnRunsST;
        static int firstInnWick;
        static String firstInnWickST;
        static int firstInnOvers;
        static String firstInnOversST;
        static int firstInnballs;
        static String firstInnBallsSt;

        static int b1Runs[] = new int[11];
        static int b1Balls[] = new int[11];
        static int b1Fours[] = new int[11];
        static int b1Sixes[] = new int[11];
        static float b1StRate[] = new float[11];

        int k = 0;



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
        binding = ActivityScoreBoardSecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();  // To hide Title Bar

//        batsman[wickets+1] = com.karancreations.cricketscorerbyck.newBatsman.newBatsman;


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

//               Storing Batsman Stats in Array
//               b1Runs[wickets-1] = strikerRuns;
//               b1Balls[wickets-1] = strikerBalls;
//               b1Fours[wickets-1] = strikerFours;
//               b1Sixes[wickets-1] = strikerSixes;
//               b1StRate[wickets-1] = strikerStrate;

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


//               New Bowler Input
               if (balls == 0)
               {
                   binding.newbowlerlayout.setVisibility(View.VISIBLE);
                   binding.btnnewbowler.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view) {
                           scBowler = binding.newbowler.getText().toString();
                           binding.bowlersb.setText(scBowler);
                           binding.newbowlerlayout.setVisibility(View.INVISIBLE);

//                          Changing the Striker after the over is complete
                           if (binding.st1.getVisibility() == View.VISIBLE)
                           {
                               binding.st1.setVisibility(View.INVISIBLE);
                               binding.st2.setVisibility(View.VISIBLE);
                           }
                           else if (binding.st2.getVisibility() == View.VISIBLE)
                           {
                               binding.st2.setVisibility(View.INVISIBLE);
                               binding.st1.setVisibility(View.VISIBLE);
                           }

//                           Clearing Previous Bowler Stats
                           bowlerBalls = 0;
                           bBalls = String.valueOf(bowlerBalls);
                           binding.bowlerballs.setText(bBalls);

                           bowlerRuns = 0;
                           bRuns = String.valueOf(bowlerRuns);
                           binding.bowlerruns.setText(bRuns);

                           bowlerOvers = 0;
                           bOvers = String.valueOf(bowlerOvers);
                           binding.bowlerovers.setText(bOvers);

                           bowlerWickets = 0;
                           bWickets = String.valueOf(bowlerWickets);
                           binding.bowlerwickets.setText(bWickets);


                       }
                   });

               }

//               CODE TO TERMINATE IF THE OVERS ARE COMPLETED
               if (overs == tOvers)
               {
                   firstInnRuns = totRuns;
                   firstInnRunsST = String.valueOf(firstInnRuns);

                   firstInnballs = balls;
                   firstInnBallsSt = String.valueOf(firstInnballs);

                   firstInnWick = wickets;
                   firstInnWickST = String.valueOf(firstInnWick);

                   firstInnOvers = overs;
                   firstInnOversST = String.valueOf(firstInnOvers);


//                   CODE TO START SECOND INNINGS...

                   // Create the object of AlertDialog Builder class
                   AlertDialog.Builder builder = new AlertDialog.Builder(scoreBoardSecond.this);

                   // Set the message show for the Alert time
                   builder.setMessage("Target: " + firstInnRunsST );

                   // Set Alert Title
                   builder.setTitle("First Innings OVER!");

                   // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
                   builder.setCancelable(false);

                   // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
                   builder.setPositiveButton("Yes",  new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialogInterface, int i) {
                           dialogInterface.dismiss();
                           Intent secInn = new Intent(getApplicationContext(), playerDetailsSecond.class);
                           startActivity(secInn);

                       }
                   });


                   // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
                   builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
                       // If user click no then dialog box is canceled.
                       dialog.cancel();
                   });

                   // Create the Alert dialog
                   AlertDialog alertDialog = builder.create();
                   // Show the Alert Dialog box
                   alertDialog.show();



               }



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

                   //               Storing Batsman Stats in Array
//                   b1Runs[wickets-1] = strikerRuns;
//                   b1Balls[wickets-1] = strikerBalls;
//                   b1Fours[wickets-1] = strikerFours;
//                   b1Sixes[wickets-1] = strikerSixes;
//                   b1StRate[wickets-1] = strikerStrate;

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


               //               New Bowler Input
               if (balls == 0)
               {
                   binding.newbowlerlayout.setVisibility(View.VISIBLE);
                   binding.btnnewbowler.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view) {
                           scBowler = binding.newbowler.getText().toString();
                           binding.bowlersb.setText(scBowler);
                           binding.newbowlerlayout.setVisibility(View.INVISIBLE);

//                           Changing the Striker after the over is complete

                           if (binding.st1.getVisibility() == View.VISIBLE)
                           {
                               binding.st1.setVisibility(View.INVISIBLE);
                               binding.st2.setVisibility(View.VISIBLE);
                           }
                           else if (binding.st2.getVisibility() == View.VISIBLE)
                           {
                               binding.st2.setVisibility(View.INVISIBLE);
                               binding.st1.setVisibility(View.VISIBLE);
                           }

//                           Clearing Previous Bowler Stats
                           bowlerBalls = 0;
                           bBalls = String.valueOf(bowlerBalls);
                           binding.bowlerballs.setText(bBalls);

                           bowlerRuns = 0;
                           bRuns = String.valueOf(bowlerRuns);
                           binding.bowlerruns.setText(bRuns);

                           bowlerOvers = 0;
                           bOvers = String.valueOf(bowlerOvers);
                           binding.bowlerovers.setText(bOvers);

                           bowlerWickets = 0;
                           bWickets = String.valueOf(bowlerWickets);
                           binding.bowlerwickets.setText(bWickets);


                       }
                   });
               }

               //               CODE TO TERMINATE IF THE OVERS ARE COMPLETED
               if (overs == tOvers)
               {
                   firstInnRuns = totRuns;
                   firstInnRunsST = String.valueOf(firstInnRuns);

                   firstInnballs = balls;
                   firstInnBallsSt = String.valueOf(firstInnballs);

                   firstInnWick = wickets;
                   firstInnWickST = String.valueOf(firstInnWick);

                   firstInnOvers = overs;
                   firstInnOversST = String.valueOf(firstInnOvers);


                   //                   CODE TO START SECOND INNINGS...

                   // Create the object of AlertDialog Builder class
                   AlertDialog.Builder builder = new AlertDialog.Builder(scoreBoardSecond.this);

                   // Set the message show for the Alert time
                   builder.setMessage("Target: " + firstInnRunsST );

                   // Set Alert Title
                   builder.setTitle("First Innings OVER!");

                   // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
                   builder.setCancelable(false);

                   // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
                   builder.setPositiveButton("Yes",  new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialogInterface, int i) {
                           dialogInterface.dismiss();
                           Intent secInn = new Intent(getApplicationContext(), playerDetailsSecond.class);
                           startActivity(secInn);

                       }
                   });


                   // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
                   builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
                       // If user click no then dialog box is canceled.
                       dialog.cancel();
                   });

                   // Create the Alert dialog
                   AlertDialog alertDialog = builder.create();
                   // Show the Alert Dialog box
                   alertDialog.show();


               }



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


                //               New Bowler Input
                if (balls == 0)
                {
                    binding.newbowlerlayout.setVisibility(View.VISIBLE);
                    binding.btnnewbowler.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            scBowler = binding.newbowler.getText().toString();
                            binding.bowlersb.setText(scBowler);
                            binding.newbowlerlayout.setVisibility(View.INVISIBLE);

//                            Changing the Striker after the over is complete
                            if (binding.st1.getVisibility() == View.VISIBLE)
                            {
                                binding.st1.setVisibility(View.INVISIBLE);
                                binding.st2.setVisibility(View.VISIBLE);
                            }
                            else if (binding.st2.getVisibility() == View.VISIBLE)
                            {
                                binding.st2.setVisibility(View.INVISIBLE);
                                binding.st1.setVisibility(View.VISIBLE);
                            }

//                            Clearing Previous Bowler Stats
                            bowlerBalls = 0;
                            bBalls = String.valueOf(bowlerBalls);
                            binding.bowlerballs.setText(bBalls);

                            bowlerRuns = 0;
                            bRuns = String.valueOf(bowlerRuns);
                            binding.bowlerruns.setText(bRuns);

                            bowlerOvers = 0;
                            bOvers = String.valueOf(bowlerOvers);
                            binding.bowlerovers.setText(bOvers);

                            bowlerWickets = 0;
                            bWickets = String.valueOf(bowlerWickets);
                            binding.bowlerwickets.setText(bWickets);

                        }
                    });
                }


                //               CODE TO TERMINATE IF THE OVERS ARE COMPLETED
                if (overs == tOvers)
                {
                    firstInnRuns = totRuns;
                    firstInnRunsST = String.valueOf(firstInnRuns);

                    firstInnballs = balls;
                    firstInnBallsSt = String.valueOf(firstInnballs);

                    firstInnWick = wickets;
                    firstInnWickST = String.valueOf(firstInnWick);

                    firstInnOvers = overs;
                    firstInnOversST = String.valueOf(firstInnOvers);


                    //                   CODE TO START SECOND INNINGS...

                    // Create the object of AlertDialog Builder class
                    AlertDialog.Builder builder = new AlertDialog.Builder(scoreBoardSecond.this);

                    // Set the message show for the Alert time
                    builder.setMessage("Target: " + firstInnRunsST );

                    // Set Alert Title
                    builder.setTitle("First Innings OVER!");

                    // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
                    builder.setCancelable(false);

                    // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
                    builder.setPositiveButton("Yes",  new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            Intent secInn = new Intent(getApplicationContext(), playerDetailsSecond.class);
                            startActivity(secInn);

                        }
                    });


                    // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
                    builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
                        // If user click no then dialog box is canceled.
                        dialog.cancel();
                    });

                    // Create the Alert dialog
                    AlertDialog alertDialog = builder.create();
                    // Show the Alert Dialog box
                    alertDialog.show();




                }


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

                //               New Bowler Input
                if (balls == 0)
                {
                    binding.newbowlerlayout.setVisibility(View.VISIBLE);
                    binding.btnnewbowler.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            scBowler = binding.newbowler.getText().toString();
                            binding.bowlersb.setText(scBowler);
                            binding.newbowlerlayout.setVisibility(View.INVISIBLE);


//                            Changing the Striker after the over is complete
                            if (binding.st1.getVisibility() == View.VISIBLE)
                            {
                                binding.st1.setVisibility(View.INVISIBLE);
                                binding.st2.setVisibility(View.VISIBLE);
                            }
                            else if (binding.st2.getVisibility() == View.VISIBLE)
                            {
                                binding.st2.setVisibility(View.INVISIBLE);
                                binding.st1.setVisibility(View.VISIBLE);
                            }

//                            Clearing Previous Bowler Stats
                            bowlerBalls = 0;
                            bBalls = String.valueOf(bowlerBalls);
                            binding.bowlerballs.setText(bBalls);

                            bowlerRuns = 0;
                            bRuns = String.valueOf(bowlerRuns);
                            binding.bowlerruns.setText(bRuns);

                            bowlerOvers = 0;
                            bOvers = String.valueOf(bowlerOvers);
                            binding.bowlerovers.setText(bOvers);

                            bowlerWickets = 0;
                            bWickets = String.valueOf(bowlerWickets);
                            binding.bowlerwickets.setText(bWickets);


                        }
                    });
                }


                //               CODE TO TERMINATE IF THE OVERS ARE COMPLETED
                if (overs == tOvers)
                {
                    firstInnRuns = totRuns;
                    firstInnRunsST = String.valueOf(firstInnRuns);

                    firstInnballs = balls;
                    firstInnBallsSt = String.valueOf(firstInnballs);

                    firstInnWick = wickets;
                    firstInnWickST = String.valueOf(firstInnWick);

                    firstInnOvers = overs;
                    firstInnOversST = String.valueOf(firstInnOvers);


                    //                   CODE TO START SECOND INNINGS...

                    // Create the object of AlertDialog Builder class
                    AlertDialog.Builder builder = new AlertDialog.Builder(scoreBoardSecond.this);

                    // Set the message show for the Alert time
                    builder.setMessage("Target: " + firstInnRunsST );

                    // Set Alert Title
                    builder.setTitle("First Innings OVER!");

                    // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
                    builder.setCancelable(false);

                    // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
                    builder.setPositiveButton("Yes",  new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            Intent secInn = new Intent(getApplicationContext(), playerDetailsSecond.class);
                            startActivity(secInn);

                        }
                    });


                    // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
                    builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
                        // If user click no then dialog box is canceled.
                        dialog.cancel();
                    });

                    // Create the Alert dialog
                    AlertDialog alertDialog = builder.create();
                    // Show the Alert Dialog box
                    alertDialog.show();




                }



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

                //               New Bowler Input
                if (balls == 0)
                {

                    binding.newbowlerlayout.setVisibility(View.VISIBLE);
                    binding.btnnewbowler.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            scBowler = binding.newbowler.getText().toString();
                            binding.bowlersb.setText(scBowler);
                            binding.newbowlerlayout.setVisibility(View.INVISIBLE);


//                            Changing the Striker after the over is complete
                            if (binding.st1.getVisibility() == View.VISIBLE)
                            {
                                binding.st1.setVisibility(View.INVISIBLE);
                                binding.st2.setVisibility(View.VISIBLE);
                            }
                            else if (binding.st2.getVisibility() == View.VISIBLE)
                            {
                                binding.st2.setVisibility(View.INVISIBLE);
                                binding.st1.setVisibility(View.VISIBLE);
                            }

//                            Clearing Previous Bowler Stats
                            bowlerBalls = 0;
                            bBalls = String.valueOf(bowlerBalls);
                            binding.bowlerballs.setText(bBalls);

                            bowlerRuns = 0;
                            bRuns = String.valueOf(bowlerRuns);
                            binding.bowlerruns.setText(bRuns);

                            bowlerOvers = 0;
                            bOvers = String.valueOf(bowlerOvers);
                            binding.bowlerovers.setText(bOvers);

                            bowlerWickets = 0;
                            bWickets = String.valueOf(bowlerWickets);
                            binding.bowlerwickets.setText(bWickets);

                        }
                    });
                }


                //               CODE TO TERMINATE IF THE OVERS ARE COMPLETED
                if (overs == tOvers)
                {
                    firstInnRuns = totRuns;
                    firstInnRunsST = String.valueOf(firstInnRuns);

                    firstInnballs = balls;
                    firstInnBallsSt = String.valueOf(firstInnballs);

                    firstInnWick = wickets;
                    firstInnWickST = String.valueOf(firstInnWick);

                    firstInnOvers = overs;
                    firstInnOversST = String.valueOf(firstInnOvers);

                    //                   CODE TO START SECOND INNINGS...

                    // Create the object of AlertDialog Builder class
                    AlertDialog.Builder builder = new AlertDialog.Builder(scoreBoardSecond.this);

                    // Set the message show for the Alert time
                    builder.setMessage("Target: " + firstInnRunsST );

                    // Set Alert Title
                    builder.setTitle("First Innings OVER!");

                    // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
                    builder.setCancelable(false);

                    // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
                    builder.setPositiveButton("Yes",  new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            Intent secInn = new Intent(getApplicationContext(), playerDetailsSecond.class);
                            startActivity(secInn);

                        }
                    });


                    // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
                    builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
                        // If user click no then dialog box is canceled.
                        dialog.cancel();
                    });

                    // Create the Alert dialog
                    AlertDialog alertDialog = builder.create();
                    // Show the Alert Dialog box
                    alertDialog.show();




                }



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

                //               New Bowler Input
                if (balls == 0)
                {
                    binding.newbowlerlayout.setVisibility(View.VISIBLE);
                    binding.btnnewbowler.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            scBowler = binding.newbowler.getText().toString();
                            binding.bowlersb.setText(scBowler);
                            binding.newbowlerlayout.setVisibility(View.INVISIBLE);

//                            Changing the Striker after the over is complete
                            if (binding.st1.getVisibility() == View.VISIBLE)
                            {
                                binding.st1.setVisibility(View.INVISIBLE);
                                binding.st2.setVisibility(View.VISIBLE);
                            }
                            else if (binding.st2.getVisibility() == View.VISIBLE)
                            {
                                binding.st2.setVisibility(View.INVISIBLE);
                                binding.st1.setVisibility(View.VISIBLE);
                            }

//                            Clearing Previous Bowler Stats
                            bowlerBalls = 0;
                            bBalls = String.valueOf(bowlerBalls);
                            binding.bowlerballs.setText(bBalls);

                            bowlerRuns = 0;
                            bRuns = String.valueOf(bowlerRuns);
                            binding.bowlerruns.setText(bRuns);

                            bowlerOvers = 0;
                            bOvers = String.valueOf(bowlerOvers);
                            binding.bowlerovers.setText(bOvers);

                            bowlerWickets = 0;
                            bWickets = String.valueOf(bowlerWickets);
                            binding.bowlerwickets.setText(bWickets);


                        }
                    });
                }


                //               CODE TO TERMINATE IF THE OVERS ARE COMPLETED
                if (overs == tOvers)
                {
                    firstInnRuns = totRuns;
                    firstInnRunsST = String.valueOf(firstInnRuns);

                    firstInnballs = balls;
                    firstInnBallsSt = String.valueOf(firstInnballs);

                    firstInnWick = wickets;
                    firstInnWickST = String.valueOf(firstInnWick);

                    firstInnOvers = overs;
                    firstInnOversST = String.valueOf(firstInnOvers);

                    //                   CODE TO START SECOND INNINGS...

                    // Create the object of AlertDialog Builder class
                    AlertDialog.Builder builder = new AlertDialog.Builder(scoreBoardSecond.this);

                    // Set the message show for the Alert time
                    builder.setMessage("Target: " + firstInnRunsST );

                    // Set Alert Title
                    builder.setTitle("First Innings OVER!");

                    // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
                    builder.setCancelable(false);

                    // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
                    builder.setPositiveButton("Yes",  new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            Intent secInn = new Intent(getApplicationContext(), playerDetailsSecond.class);
                            startActivity(secInn);

                        }
                    });


                    // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
                    builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
                        // If user click no then dialog box is canceled.
                        dialog.cancel();
                    });

                    // Create the Alert dialog
                    AlertDialog alertDialog = builder.create();
                    // Show the Alert Dialog box
                    alertDialog.show();



                }


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



//               New Bowler Input
                if (balls == 0)
                {
                    binding.newbowlerlayout.setVisibility(View.VISIBLE);
                    binding.btnnewbowler.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            scBowler = binding.newbowler.getText().toString();
                            binding.bowlersb.setText(scBowler);
                            binding.newbowlerlayout.setVisibility(View.INVISIBLE);

//                            Changing the Striker after the over is complete
                            if (binding.st1.getVisibility() == View.VISIBLE)
                            {
                                binding.st1.setVisibility(View.INVISIBLE);
                                binding.st2.setVisibility(View.VISIBLE);
                            }
                            else if (binding.st2.getVisibility() == View.VISIBLE)
                            {
                                binding.st2.setVisibility(View.INVISIBLE);
                                binding.st1.setVisibility(View.VISIBLE);
                            }

//                            Clearing Previous Bowler Stats
                            bowlerBalls = 0;
                            bBalls = String.valueOf(bowlerBalls);
                            binding.bowlerballs.setText(bBalls);

                            bowlerRuns = 0;
                            bRuns = String.valueOf(bowlerRuns);
                            binding.bowlerruns.setText(bRuns);

                            bowlerOvers = 0;
                            bOvers = String.valueOf(bowlerOvers);
                            binding.bowlerovers.setText(bOvers);

                            bowlerWickets = 0;
                            bWickets = String.valueOf(bowlerWickets);
                            binding.bowlerwickets.setText(bWickets);


                        }
                    });
                }


                //               CODE TO TERMINATE IF THE OVERS ARE COMPLETED
                if (overs == tOvers)
                {
                    firstInnRuns = totRuns;
                    firstInnRunsST = String.valueOf(firstInnRuns);

                    firstInnballs = balls;
                    firstInnBallsSt = String.valueOf(firstInnballs);

                    firstInnWick = wickets;
                    firstInnWickST = String.valueOf(firstInnWick);

                    firstInnOvers = overs;
                    firstInnOversST = String.valueOf(firstInnOvers);

                    //                   CODE TO START SECOND INNINGS...

                    // Create the object of AlertDialog Builder class
                    AlertDialog.Builder builder = new AlertDialog.Builder(scoreBoardSecond.this);

                    // Set the message show for the Alert time
                    builder.setMessage("Target: " + firstInnRunsST );

                    // Set Alert Title
                    builder.setTitle("First Innings OVER!");

                    // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
                    builder.setCancelable(false);

                    // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
                    builder.setPositiveButton("Yes",  new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            Intent secInn = new Intent(getApplicationContext(), playerDetailsSecond.class);
                            startActivity(secInn);

                        }
                    });


                    // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
                    builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
                        // If user click no then dialog box is canceled.
                        dialog.cancel();
                    });

                    // Create the Alert dialog
                    AlertDialog alertDialog = builder.create();
                    // Show the Alert Dialog box
                    alertDialog.show();



                }


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



//               CODE TO TERMINATE 1ST INNINGS IF THE WHOLE TEAM IS ALL OUT
                if (wickets == (totPlayers - 1))
                {
                    firstInnRuns = totRuns;
                    firstInnRunsST = String.valueOf(firstInnRuns);

                    firstInnballs = balls;
                    firstInnBallsSt = String.valueOf(firstInnballs);

                    firstInnWick = wickets;
                    firstInnWickST = String.valueOf(firstInnWick);

                    firstInnOvers = overs;
                    firstInnOversST = String.valueOf(firstInnOvers);

                    //                   CODE TO START SECOND INNINGS...

                    // Create the object of AlertDialog Builder class
                    AlertDialog.Builder builder = new AlertDialog.Builder(scoreBoardSecond.this);

                    // Set the message show for the Alert time
                    builder.setMessage("Target: " + firstInnRunsST );

                    // Set Alert Title
                    builder.setTitle("First Innings OVER!");

                    // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
                    builder.setCancelable(false);

                    // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
                    builder.setPositiveButton("Yes",  new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            Intent secInn = new Intent(getApplicationContext(), playerDetailsSecond.class);
                            startActivity(secInn);

                        }
                    });


                    // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
                    builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
                        // If user click no then dialog box is canceled.
                        dialog.cancel();
                    });

                    // Create the Alert dialog
                    AlertDialog alertDialog = builder.create();
                    // Show the Alert Dialog box
                    alertDialog.show();



                    binding.newbatsmanlayout.setVisibility(View.INVISIBLE);

                }

                else {
                    binding.newbatsmanlayout.setVisibility(View.VISIBLE);
                }

                //               CODE TO TERMINATE IF THE OVERS ARE COMPLETED
                if (overs == tOvers)
                {
                    firstInnRuns = totRuns;
                    firstInnRunsST = String.valueOf(firstInnRuns);

                    firstInnballs = balls;
                    firstInnBallsSt = String.valueOf(firstInnballs);

                    firstInnWick = wickets;
                    firstInnWickST = String.valueOf(firstInnWick);

                    firstInnOvers = overs;
                    firstInnOversST = String.valueOf(firstInnOvers);

                    //                   CODE TO START SECOND INNINGS...

                    // Create the object of AlertDialog Builder class
                    AlertDialog.Builder builder = new AlertDialog.Builder(scoreBoardSecond.this);

                    // Set the message show for the Alert time
                    builder.setMessage("Target: " + firstInnRunsST );

                    // Set Alert Title
                    builder.setTitle("First Innings OVER!");

                    // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
                    builder.setCancelable(false);

                    // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
                    builder.setPositiveButton("Yes",  new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            Intent secInn = new Intent(getApplicationContext(), playerDetailsSecond.class);
                            startActivity(secInn);

                        }
                    });


                    // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
                    builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
                        // If user click no then dialog box is canceled.
                        dialog.cancel();
                    });

                    // Create the Alert dialog
                    AlertDialog alertDialog = builder.create();
                    // Show the Alert Dialog box
                    alertDialog.show();


                }



            }
        });

//        CODE TO INPUT NEW BATSMAN
        binding.btnnewbatsman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                IF STRIKER IS OUT
                if (binding.st1.getVisibility() == View.VISIBLE)
                {
                    Toast.makeText(scoreBoardSecond.this, "Enter New Batsman", Toast.LENGTH_SHORT).show();
                    newBatsman = binding.newbatsman.getText().toString();
                    scStriker = newBatsman;
                    binding.strikersb.setText(scStriker);

//                    Storing batsman in Array
                    batsman[wickets+1] = scStriker;
//                    Toast.makeText(scoreBoard.this, batsman[wickets+1], Toast.LENGTH_SHORT).show();

                    strikerRuns = 0;
                    stRuns = String.valueOf(strikerRuns);
                    binding.strikerruns.setText(stRuns);

                    strikerBalls = 0;
                    stBalls = String.valueOf(strikerBalls);
                    binding.strikerballs.setText(stBalls);

                    strikerFours = 0;
                    stFours = String.valueOf(strikerFours);
                    binding.strikerfours.setText(stFours);

                    strikerSixes = 0;
                    stSixes = String.valueOf(strikerSixes);
                    binding.strikersixes.setText(stSixes);

                    strikerStrate = 0;
                    stStrikeRate = String.valueOf(strikerStrate);
                    binding.strikerstrate.setText(stStrikeRate);



                    binding.newbatsmanlayout.setVisibility(View.INVISIBLE);

                }
//                IF NON-STRIKER IS OUT
                else if (binding.st2.getVisibility() == View.VISIBLE)
                {
                    Toast.makeText(scoreBoardSecond.this, "Enter New Batsman", Toast.LENGTH_SHORT).show();
                    newBatsman = binding.newbatsman.getText().toString();
                    scnonStriker = newBatsman;
                    binding.nstrikersb.setText(scnonStriker);

//                    Storing Batsman in Array
                    batsman[wickets+1] = scnonStriker;
//                    Toast.makeText(scoreBoard.this, batsman[wickets+1], Toast.LENGTH_SHORT).show();

                    nstRuns = 0;
                    nstrikerRuns = String.valueOf(nstRuns);
                    binding.nstrikerruns.setText(nstrikerRuns);

                    nstBalls = 0;
                    nstrikerBalls = String.valueOf(nstBalls);
                    binding.nstrikerballs.setText(nstrikerBalls);

                    nstFours = 0;
                    nstrikerFours = String.valueOf(nstFours);
                    binding.nstrikerfours.setText(nstrikerFours);

                    nstSixes = 0;
                    nstrikerSixes = String.valueOf(nstSixes);
                    binding.nstrikersixes.setText(nstrikerSixes);

                    nstStRate = 0;
                    nstrikerStRate = String.valueOf(nstStRate);
                    binding.nstrikerstrate.setText(nstrikerStRate);


                    binding.newbatsmanlayout.setVisibility(View.INVISIBLE);
                }

                //               New Bowler Input
                if (balls == 0)
                {


                    Toast.makeText(scoreBoardSecond.this, "Enter Bowler Name", Toast.LENGTH_SHORT).show();
                    binding.newbowlerlayout.setVisibility(View.VISIBLE);
                    binding.btnnewbowler.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            scBowler = binding.newbowler.getText().toString();
                            binding.bowlersb.setText(scBowler);
                            binding.newbowlerlayout.setVisibility(View.INVISIBLE);

//                            Changing the Striker after the over is complete
                            if (binding.st1.getVisibility() == View.VISIBLE)
                            {
                                binding.st1.setVisibility(View.INVISIBLE);
                                binding.st2.setVisibility(View.VISIBLE);
                            }
                            else if (binding.st2.getVisibility() == View.VISIBLE)
                            {
                                binding.st2.setVisibility(View.INVISIBLE);
                                binding.st1.setVisibility(View.VISIBLE);
                            }

//                            Clearing Previous Bowler Stats
                            bowlerBalls = 0;
                            bBalls = String.valueOf(bowlerBalls);
                            binding.bowlerballs.setText(bBalls);

                            bowlerRuns = 0;
                            bRuns = String.valueOf(bowlerRuns);
                            binding.bowlerruns.setText(bRuns);

                            bowlerOvers = 0;
                            bOvers = String.valueOf(bowlerOvers);
                            binding.bowlerovers.setText(bOvers);

                            bowlerWickets = 0;
                            bWickets = String.valueOf(bowlerWickets);
                            binding.bowlerwickets.setText(bWickets);





                        }
                    });



                }
            }
        });





    }
}