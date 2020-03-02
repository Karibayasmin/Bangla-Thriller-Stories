package com.example.karibayasmin.banglathrillerstories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Stories extends AppCompatActivity {
   Button bangladeshi, indian, translated;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);

        bangladeshi = (Button)findViewById(R.id.bangladeshi);
        indian = (Button)findViewById(R.id.indian);
        translated = (Button)findViewById(R.id.translated);

        bangladeshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla = new Intent(getApplicationContext(), Banglastory.class);
                startActivity(bangla);
            }
        });

        indian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent india = new Intent(getApplicationContext(), Indianstory.class);
                startActivity(india);
            }
        });

        translated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent translate = new Intent(getApplicationContext(), Translatedstory.class);
                startActivity(translate);
            }
        });
    }
}
