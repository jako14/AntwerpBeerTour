package com.example.jakub.antwerpbeertour;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Jakub on 2016-04-20.
 */
public class RegisterActivity extends Activity {

    private Button SignInbtn;

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

    }
}
