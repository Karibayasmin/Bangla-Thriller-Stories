package com.example.karibayasmin.banglathrillerstories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Translatedstory extends AppCompatActivity {

    Button translated1, translated2, translated3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translatedstory);

        translated1 = (Button) findViewById(R.id.translated1);
        translated2 = (Button) findViewById(R.id.translated2);
        translated3 = (Button) findViewById(R.id.translated3);

        translated1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Translated1.class);
                startActivity(intent);

            }
        });

        translated2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Translated2.class);
                startActivity(intent);

            }
        });

        translated3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Translated3.class);
                startActivity(intent);

            }
        });
    }
}
