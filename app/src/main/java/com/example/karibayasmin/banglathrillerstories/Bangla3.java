package com.example.karibayasmin.banglathrillerstories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bangla3 extends AppCompatActivity {

    PDFView banglapdf3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla3);

        banglapdf3 = (PDFView) findViewById(R.id.banglapdf3);
        banglapdf3.fromAsset("Science-Fiction-Shamagra-Part-1-By-Muhammed-Zafar-Iqbal.pdf").load();
    }
}
