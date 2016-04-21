package com.example.jakub.antwerpbeertour;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;

public class choose_login extends AppCompatActivity {

    private Button btnRegistration;
    private Button btnFacebook;
    private Button btnTwitter;
    private  Button btnGoogle;
    private ImageButton btnLanguage;
    private ImageButton btnLogo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_login);

        btnRegistration = (Button)findViewById(R.id.buttonRegistration);

        btnRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(choose_login.this, RegisterActivity.class);
                startActivity(intent);

            }
        });



        btnFacebook = (Button)findViewById(R.id.buttonFacebook);


        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(choose_login.this,MenuActivity.class);
                startActivity(intent);

            }
        });

        btnTwitter = (Button)findViewById(R.id.buttonTwitter);

        btnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(choose_login.this,MenuActivity.class);
                startActivity(intent);

            }
        });

        btnGoogle = (Button)findViewById(R.id.buttonGoogle);

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(choose_login.this,MenuActivity.class);
                startActivity(intent);

            }
        });

        btnLanguage = (ImageButton)findViewById(R.id.buttonLanguage);

        btnLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(choose_login.this,LanguageActivity.class);
                startActivity(intent);

            }
        });

        btnLogo = (ImageButton)findViewById(R.id.buttonLogo);

        btnLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(choose_login.this,MenuActivity.class);
                startActivity(intent);

            }
        });


        String fontPath = "fonts/coolvetica rg.ttf";

        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
        btnRegistration.setTypeface(tf);
        btnTwitter.setTypeface(tf);
        btnFacebook.setTypeface(tf);
        btnGoogle.setTypeface(tf);



    }
}
