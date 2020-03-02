package com.example.karibayasmin.banglathrillerstories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Indian2 extends AppCompatActivity {

    PDFView indianpdf2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian2);

        indianpdf2 = (PDFView) findViewById(R.id.indianpdf2);
        indianpdf2.fromAsset("felu da part- 2.pdf").load();
    }
}
