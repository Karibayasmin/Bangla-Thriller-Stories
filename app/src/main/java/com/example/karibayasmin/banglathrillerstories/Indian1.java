package com.example.karibayasmin.banglathrillerstories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Indian1 extends AppCompatActivity {

    PDFView indianpdf1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian1);

        indianpdf1 = (PDFView) findViewById(R.id.indianpdf1);
        indianpdf1.fromAsset("Feluda Samagra-Part-1.pdf").load();
    }
}
