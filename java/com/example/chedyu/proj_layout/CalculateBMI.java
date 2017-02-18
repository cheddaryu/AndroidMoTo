package com.example.chedyu.proj_layout;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Created by Ched Yu on 18/02/2017.
 */

public class CalculateBMI extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10,
        tv11, tv12, tv13, tv14, tv15, tv16, tv17;
    Typeface tf1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign);

        tv1 = (TextView) findViewById(R.id.textView3);
        tv2 = (TextView) findViewById(R.id.textView4);
        tv3 = (TextView) findViewById(R.id.textView5);
        tv4 = (TextView) findViewById(R.id.textView7);
        tv5 = (TextView) findViewById(R.id.bmiTxt);
        tv6 = (TextView) findViewById(R.id.textView8);
        tv7 = (TextView) findViewById(R.id.idealweightTxt);
        tv8 = (TextView) findViewById(R.id.textView9);
        tv9 = (TextView) findViewById(R.id.fatTxt);
        tv10 = (TextView) findViewById(R.id.VSunderTxt);
        tv11 = (TextView) findViewById(R.id.SunderTxt);
        tv12 = (TextView) findViewById(R.id.UnderTxt);
        tv13 = (TextView) findViewById(R.id.NormalTxt);
        tv14 = (TextView) findViewById(R.id.OverweightTxt);
        tv15 = (TextView) findViewById(R.id.ObeseITxt);
        tv16 = (TextView) findViewById(R.id.ObeseIITxt);
        tv17 = (TextView) findViewById(R.id.ObeseIIITxt);

        tf1 = Typeface.createFromAsset(getAssets(), "font1.otf");

        tv1.setTypeface(tf1);
        tv2.setTypeface(tf1);
        tv3.setTypeface(tf1);
        tv4.setTypeface(tf1);
        tv5.setTypeface(tf1);
        tv6.setTypeface(tf1);
        tv7.setTypeface(tf1);
        tv8.setTypeface(tf1);
        tv9.setTypeface(tf1);
        tv10.setTypeface(tf1);
        tv11.setTypeface(tf1);
        tv12.setTypeface(tf1);
        tv13.setTypeface(tf1);
        tv14.setTypeface(tf1);
        tv15.setTypeface(tf1);
        tv16.setTypeface(tf1);
        tv17.setTypeface(tf1);

    }
}
