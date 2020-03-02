package com.example.karibayasmin.banglathrillerstories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Banglastory extends AppCompatActivity {

    Button bangla1, bangla2, bangla3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banglastory);

        bangla1 = (Button) findViewById(R.id.bangla1);
        bangla2 = (Button) findViewById(R.id.bangla2);
        bangla3 = (Button) findViewById(R.id.bangla3);

        bangla1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Bangla1.class);
                startActivity(intent);

            }
        });

        bangla2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Bangla2.class);
                startActivity(intent);

            }
        });

        bangla3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Bangla3.class);
                startActivity(intent);

            }
        });
    }
}
