package com.example.jakub.antwerpbeertour;

import android.app.Activity;
import android.os.Bundle;
import google.zxing.integration.android.IntentResult;
import google.zxing.integration.android.IntentIntegrator;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;



/**
 * Created by Jakub on 2016-04-21.
 */
public class ScannerActivity extends Activity implements OnClickListener{

    private Button scanBtn;
    private TextView formatTxt, contentTxt;
    private ImageButton btnLanguage;
    private ImageButton btnLogo;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);

        scanBtn = (Button)findViewById(R.id.buttonScan);
        formatTxt = (TextView)findViewById(R.id.scanFormat);
        contentTxt = (TextView)findViewById(R.id.scanContent);

        scanBtn.setOnClickListener(this);

        btnLanguage = (ImageButton)findViewById(R.id.buttonLanguage);

        btnLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScannerActivity.this,LanguageActivity.class);
                startActivity(intent);

            }
        });

        btnLogo = (ImageButton)findViewById(R.id.buttonLogo);

        btnLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScannerActivity.this, MenuActivity.class);
                startActivity(intent);

            }
        });

    }
    public void onClick(View v)
    {
        if(v.getId()==R.id.buttonScan) {
            IntentIntegrator scanIntegrator = new IntentIntegrator(this);
            scanIntegrator.initiateScan();
        }
    }

        public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        IntentResult scanningResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
        if (scanningResult != null) {
            String scanContent = scanningResult.getContents();
            String scanFormat = scanningResult.getFormatName();
            formatTxt.setText("FORMAT: " + scanFormat);
            contentTxt.setText(scanContent);
           if (scanContent.equals("4z7") )
           {

                Intent intentScan = new Intent(ScannerActivity.this, Question1Activity.class);
                startActivity(intentScan);
            }
        }
        else{
            Toast toast = Toast.makeText(getApplicationContext(),
                    "No scan data received!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}


