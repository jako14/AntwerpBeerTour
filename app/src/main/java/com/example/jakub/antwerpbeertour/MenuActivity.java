package com.example.jakub.antwerpbeertour;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Jakub on 2016-04-20.
 */
public class MenuActivity extends Activity {

    private Button btnScoreboard;
    private Button btnInformation;
    private Button btnPlayGame;
    private ImageButton btnLanguage;
    private ImageButton btnLogo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnScoreboard = (Button)findViewById(R.id.buttonScore);

        btnScoreboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,ScoreboardActivity.class);
                startActivity(intent);

            }
        });

        btnInformation = (Button)findViewById(R.id.buttonInfo);

        btnInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,InformationActivity.class);
                startActivity(intent);

            }
        });

        btnPlayGame = (Button)findViewById(R.id.buttonPlay);


        btnPlayGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,MapActivity.class);
                startActivity(intent);

            }
        });

        String fontPath = "fonts/coolvetica rg.ttf";

        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);

        btnPlayGame.setTypeface(tf);
        btnScoreboard.setTypeface(tf);
        btnInformation.setTypeface(tf);

        btnLanguage = (ImageButton)findViewById(R.id.buttonLanguage);

        btnLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, LanguageActivity.class);
                startActivity(intent);

            }
        });

        btnLogo = (ImageButton)findViewById(R.id.buttonLogo);

        btnLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MenuActivity.class);
                startActivity(intent);

            }
        });

    }
}



