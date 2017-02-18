package com.example.chedyu.proj_layout;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Created by Ched Yu on 18/02/2017.
 */

public class SignUpInterface extends AppCompatActivity {

    TextView sign_1, sign_2, sign_3, sign_4, sign_5, sign_6, sign_7, sign_8;
    Typeface sType_1, sType_2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign);

        sign_1 = (TextView) findViewById(R.id.textView);
        sign_2 = (TextView) findViewById(R.id.first_view);
        sign_3 = (TextView) findViewById(R.id.middle_view);
        sign_4 = (TextView) findViewById(R.id.last_view);
        sign_5 = (TextView) findViewById(R.id.eadd_view);
        sign_6 = (TextView) findViewById(R.id.pword_view);
        sign_7 = (TextView) findViewById(R.id.age_view);
        sign_8 = (TextView) findViewById(R.id.bday_view);

        sType_1 = Typeface.createFromAsset(getAssets(), "font2.otf");
        sType_2 = Typeface.createFromAsset(getAssets(), "font1.otf");

        sign_1.setTypeface(sType_1);
        sign_2.setTypeface(sType_2);
        sign_3.setTypeface(sType_2);
        sign_4.setTypeface(sType_2);
        sign_5.setTypeface(sType_2);
        sign_6.setTypeface(sType_2);
        sign_7.setTypeface(sType_2);
        sign_8.setTypeface(sType_2);
    }
}
