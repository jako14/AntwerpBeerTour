package com.example.jakub.antwerpbeertour;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Jakub on 2016-04-20.
 */
public class MapActivity extends Activity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Button b = (Button)findViewById(R.id.buttonPopUp);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MapActivity.this, Pop.class));
            }
        });
    }
}
