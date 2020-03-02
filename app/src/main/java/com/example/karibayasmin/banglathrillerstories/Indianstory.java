package com.example.karibayasmin.banglathrillerstories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Indianstory extends AppCompatActivity {

    Button indian1, indian2, indian3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indianstory);

        indian1 = (Button) findViewById(R.id.indian1);
        indian2 = (Button) findViewById(R.id.indian2);
        indian3 = (Button) findViewById(R.id.indian3);

        indian1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Indian1.class);
                startActivity(intent);

            }
        });

        indian2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Indian2.class);
                startActivity(intent);

            }
        });

        indian3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Indian3.class);
                startActivity(intent);

            }
        });

    }
}
