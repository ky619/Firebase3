package com.example.firebase0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SuccessActivity extends AppCompatActivity {
    private TextView success;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        success = (TextView) findViewById(R.id.success_icon);
    }
}