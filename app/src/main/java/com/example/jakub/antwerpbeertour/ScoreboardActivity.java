package com.example.jakub.antwerpbeertour;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Jakub on 2016-04-20.
 */
public class ScoreboardActivity extends Activity {

    private TextView txt1;
    private TextView txt2;
    private TextView txt3;
    private TextView txt4;
    private TextView txt5;
    private TextView txt6;
    private TextView txt7;
    private TextView txt8;
    private TextView txt9;
    private TextView txt10;
    private TextView txt11;
    private TextView txt12;
    private TextView txt13;
    private TextView txt14;
    private TextView txt15;
    private TextView txt16;
    private ImageButton btnLanguage;
    private ImageButton btnLogo;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoreboard);

        String fontPath = "fonts/coolvetica rg.ttf";

        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);

        txt1 = (TextView)findViewById(R.id.textViewHighscore);
        txt2 = (TextView)findViewById(R.id.textViewOne);
        txt3 = (TextView)findViewById(R.id.textViewAlina);
        txt4 = (TextView)findViewById(R.id.textViewScoreFirst);
        txt5 = (TextView)findViewById(R.id.textViewTwo);
        txt6 = (TextView)findViewById(R.id.textViewPaul);
        txt7 = (TextView)findViewById(R.id.textViewScoreSecond);
        txt8 = (TextView)findViewById(R.id.textViewThree);
        txt9 = (TextView)findViewById(R.id.textViewCamila);
        txt10 = (TextView)findViewById(R.id.textViewScoreThird);
        txt11 = (TextView)findViewById(R.id.textViewFour);
        txt12 = (TextView)findViewById(R.id.textViewStijn);
        txt13 = (TextView)findViewById(R.id.textViewScoreFourth);
        txt14 = (TextView)findViewById(R.id.textViewFive);
        txt15 = (TextView)findViewById(R.id.textViewJacob);
        txt16 = (TextView)findViewById(R.id.textViewScoreFifth);

        txt1.setTypeface(tf);
        txt2.setTypeface(tf);
        txt3.setTypeface(tf);
        txt4.setTypeface(tf);
        txt5.setTypeface(tf);
        txt6.setTypeface(tf);
        txt7.setTypeface(tf);
        txt8.setTypeface(tf);
        txt9.setTypeface(tf);
        txt10.setTypeface(tf);
        txt11.setTypeface(tf);
        txt12.setTypeface(tf);
        txt13.setTypeface(tf);
        txt14.setTypeface(tf);
        txt15.setTypeface(tf);
        txt16.setTypeface(tf);

        btnLanguage = (ImageButton)findViewById(R.id.buttonLanguage);

        btnLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScoreboardActivity.this, LanguageActivity.class);
                startActivity(intent);

            }
        });

        btnLogo = (ImageButton)findViewById(R.id.buttonLogo);

        btnLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScoreboardActivity.this, MenuActivity.class);
                startActivity(intent);

            }
        });

    }
}
