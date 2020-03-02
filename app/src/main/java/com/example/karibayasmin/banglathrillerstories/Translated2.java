package com.example.karibayasmin.banglathrillerstories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Translated2 extends AppCompatActivity {

    PDFView translatedpdf2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translated2);

        translatedpdf2 = (PDFView) findViewById(R.id.translatedpdf2);
        translatedpdf2.fromAsset("Child Of Storm by Henry Rider Hagard.pdf").load();
    }
}
