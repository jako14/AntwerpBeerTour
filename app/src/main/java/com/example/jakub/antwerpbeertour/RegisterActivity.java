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
public class RegisterActivity extends Activity {

    private Button SignInbtn;
    private ImageButton btnLanguage;
    private ImageButton btnLogo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        SignInbtn = (Button)findViewById(R.id.buttonSignIn);
        SignInbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, MenuActivity.class);
                startActivity(intent);

            }
        });

        String fontPath = "fonts/coolvetica rg.ttf";

        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);

        SignInbtn.setTypeface(tf);

        btnLanguage = (ImageButton)findViewById(R.id.buttonLanguage);

        btnLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this,LanguageActivity.class);
                startActivity(intent);

            }
        });

        btnLogo = (ImageButton)findViewById(R.id.buttonLogo);

        btnLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, MenuActivity.class);
                startActivity(intent);

            }
        });

    }
}
