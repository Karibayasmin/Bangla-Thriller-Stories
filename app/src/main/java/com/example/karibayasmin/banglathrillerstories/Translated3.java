package com.example.karibayasmin.banglathrillerstories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Translated3 extends AppCompatActivity {

    PDFView translatedpdf3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translated3);

        translatedpdf3 = (PDFView) findViewById(R.id.translatedpdf3);
        translatedpdf3.fromAsset("King Solomon's Mines by Henry Rider Hagard.pdf").load();
    }
}
