package com.example.jakub.antwerpbeertour;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by Jakub on 2016-04-20.
 */
public class Question1Activity extends Activity {

    private TextView textView1;
    private RadioButton r1;
    private RadioButton r2;
    private RadioButton r3;
    private ImageButton btnLanguage;
    private ImageButton btnLogo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        String fontPath = "fonts/coolvetica rg.ttf";

        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);

        textView1 = (TextView)findViewById(R.id.textViewQuestion1);
        textView1.setTypeface(tf);
        r1 = (RadioButton)findViewById(R.id.radioButtonQ1A1);
        r2 = (RadioButton)findViewById(R.id.radioButtonQ1A2);
        r3 = (RadioButton)findViewById(R.id.radioButtonQ1A3);

        r1.setTypeface(tf);
        r2.setTypeface(tf);
        r3.setTypeface(tf);

        btnLanguage = (ImageButton)findViewById(R.id.buttonLanguage);

        btnLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Question1Activity.this, LanguageActivity.class);
                startActivity(intent);

            }
        });

        btnLogo = (ImageButton)findViewById(R.id.buttonLogo);

        btnLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Question1Activity.this, MenuActivity.class);
                startActivity(intent);

            }
        });

    }
}
