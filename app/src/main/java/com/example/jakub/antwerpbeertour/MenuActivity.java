package com.example.jakub.antwerpbeertour;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Jakub on 2016-04-20.
 */
public class MenuActivity extends Activity {

    private Button btnScoreboard;
    private Button btnInformation;

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


    }
}



