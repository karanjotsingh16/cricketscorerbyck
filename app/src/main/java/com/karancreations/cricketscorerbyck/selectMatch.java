package com.karancreations.cricketscorerbyck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.karancreations.cricketscorerbyck.databinding.ActivitySplashScreenBinding;

public class selectMatch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_match);
        getSupportActionBar().hide();  // To hide Title Bar


//        // It is used to hide Title Bar from screen
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);

//       Creation of Objects from XMl to Java
        ImageView custom = findViewById(R.id.custom_img);

//       Custom Match Button Code
         custom.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent custom = new Intent(getApplicationContext(), CustomMatchInput.class);
                 startActivity(custom);
             }
         });

    }
}