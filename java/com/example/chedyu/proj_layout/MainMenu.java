package com.example.chedyu.proj_layout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by Ched Yu on 18/02/2017.
 */

public class MainMenu extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
    }

    public void doCalcBtn(View v){
        Intent intent = new Intent(this, CalculateBMI.class);
        startActivity(intent);
    }

    public void doWeightBtn(View v){
        Intent intent = new Intent(this, WeightLossInterface.class);
        startActivity(intent);
    }

    public void doFatBtn(View v){
        Intent intent = new Intent(this, FatInterface.class);
        startActivity(intent);
    }
}
