package com.example.karibayasmin.banglathrillerstories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bangla2 extends AppCompatActivity {

    PDFView banglapdf2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla2);

        banglapdf2 = (PDFView) findViewById(R.id.banglapdf2);
        banglapdf2.fromAsset("Science-Fiction-Shamagra-Part-3-By-Muhammed-Zafar-Iqbal.pdf").load();
    }
}
