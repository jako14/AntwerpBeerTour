package com.example.jakub.antwerpbeertour;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Jakub on 2016-04-21.
 */
public class LanguageActivity extends Activity {

    private Button btnEng;
    private Button btnFr;
    private Button btnDu;
    private Button btnChi;
    private ImageButton btnLogo;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        btnEng = (Button)findViewById(R.id.buttonEnglish);
        btnFr = (Button)findViewById(R.id.buttonFrench);
        btnDu = (Button)findViewById(R.id.buttonDutch);
        btnChi = (Button)findViewById(R.id.buttonChinese);


        String fontPath = "fonts/coolvetica rg.ttf";

        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);

        btnEng.setTypeface(tf);
        btnChi.setTypeface(tf);
        btnDu.setTypeface(tf);
        btnFr.setTypeface(tf);


        btnLogo = (ImageButton)findViewById(R.id.buttonLogo);

        btnLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LanguageActivity.this, MenuActivity.class);
                startActivity(intent);

            }
        });

    }
}
