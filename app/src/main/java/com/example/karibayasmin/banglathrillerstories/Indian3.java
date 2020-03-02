package com.example.karibayasmin.banglathrillerstories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Indian3 extends AppCompatActivity {

    PDFView indianpdf3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian3);

        indianpdf3 = (PDFView) findViewById(R.id.indianpdf3);
        indianpdf3.fromAsset("Felu da Part-3.pdf").load();
    }
}
