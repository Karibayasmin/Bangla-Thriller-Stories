package com.example.karibayasmin.banglathrillerstories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Translated1 extends AppCompatActivity {

    PDFView translatedpdf1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translated1);

        translatedpdf1 = (PDFView) findViewById(R.id.translatedpdf1);
        translatedpdf1.fromAsset("Allan and the Holy Flower by Henry Rider Haggard.pdf").load();
    }
}
