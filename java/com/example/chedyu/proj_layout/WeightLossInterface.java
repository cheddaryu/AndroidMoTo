package com.example.chedyu.proj_layout;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Created by Ched Yu on 18/02/2017.
 */

public class WeightLossInterface extends AppCompatActivity {

    TextView wv_1, wv_2, wv_3, wv_4, wv_5, wv_6, wv_7, wv_8, wv_9, wv_10, wv_11, wv_12,
            wv_13, wv_14, wv_15, wv_16, wv_17;
    Typeface wt_1, wt_2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_weight);

        wv_1 = (TextView) findViewById(R.id.textView2);
        wv_2 = (TextView) findViewById(R.id.textView6);
        wv_3 = (TextView) findViewById(R.id.textView10);
        wv_4 = (TextView) findViewById(R.id.textView11);
        wv_5 = (TextView) findViewById(R.id.textView12);
        wv_6 = (TextView) findViewById(R.id.textView13);
        wv_7 = (TextView) findViewById(R.id.textView14);
        wv_8 = (TextView) findViewById(R.id.textView15);
        wv_9 = (TextView) findViewById(R.id.textView16);
        wv_10 = (TextView) findViewById(R.id.textView17);
        wv_11 = (TextView) findViewById(R.id.textView18);
        wv_12 = (TextView) findViewById(R.id.textView19);
        wv_13 = (TextView) findViewById(R.id.textView20);
        wv_14 = (TextView) findViewById(R.id.textView21);
        wv_15 = (TextView) findViewById(R.id.textView22);
        wv_16 = (TextView) findViewById(R.id.textView23);
        wv_17 = (TextView) findViewById(R.id.textView24);

        wt_1 = Typeface.createFromAsset(getAssets(), "font2.otf");
        wt_2 = Typeface.createFromAsset(getAssets(), "font1.otf");

        wv_1.setTypeface(wt_1);
        wv_2.setTypeface(wt_2);
        wv_3.setTypeface(wt_2);
        wv_4.setTypeface(wt_2);
        wv_5.setTypeface(wt_2);
        wv_6.setTypeface(wt_2);
        wv_7.setTypeface(wt_2);
        wv_8.setTypeface(wt_2);
        wv_9.setTypeface(wt_2);
        wv_10.setTypeface(wt_2);
        wv_11.setTypeface(wt_2);
        wv_12.setTypeface(wt_2);
        wv_13.setTypeface(wt_2);
        wv_14.setTypeface(wt_2);
        wv_15.setTypeface(wt_2);
        wv_16.setTypeface(wt_2);
        wv_17.setTypeface(wt_2);
    }
}
