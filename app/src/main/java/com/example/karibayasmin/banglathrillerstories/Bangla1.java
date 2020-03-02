package com.example.karibayasmin.banglathrillerstories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bangla1 extends AppCompatActivity {

    PDFView banglapdf1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla1);

        banglapdf1 = (PDFView) findViewById(R.id.banglapdf1);
        banglapdf1.fromAsset("Science-Fiction-Shamagra-Part-2-By-Muhammed-Zafar-Iqbal.pdf").load();
    }
}
