package com.example.scanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BarcodeResultActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcode_result);
        String code = getIntent().getStringExtra("code");
        TextView barcodeTextView = findViewById(R.id.barcodeTextView);
        barcodeTextView.setText(code);
    }
}
