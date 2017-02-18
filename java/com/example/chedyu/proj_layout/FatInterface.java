package com.example.chedyu.proj_layout;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Created by Ched Yu on 18/02/2017.
 */

public class FatInterface extends AppCompatActivity {

    TextView fv_1, fv_2, fv_3, fv_4, fv_5;
    Typeface ff_1, ff_2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_fat);

        fv_1 = (TextView) findViewById(R.id.textView26);
        fv_2 = (TextView) findViewById(R.id.textView25);
        fv_3 = (TextView) findViewById(R.id.textView27);
        fv_4 = (TextView) findViewById(R.id.textView28);
        fv_5 = (TextView) findViewById(R.id.textView29);

        ff_1 = Typeface.createFromAsset(getAssets(), "font2.otf");
        ff_2 = Typeface.createFromAsset(getAssets(), "font1.otf");

        fv_1.setTypeface(ff_1);
        fv_2.setTypeface(ff_2);
        fv_3.setTypeface(ff_2);
        fv_4.setTypeface(ff_2);
        fv_5.setTypeface(ff_2);
    }
}
