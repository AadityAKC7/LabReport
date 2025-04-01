package com.example.labreport1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SimpleInterestOutput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_interest_output);

        TextView tvResult = findViewById(R.id.tvResult);

        double principal = Double.parseDouble(getIntent().getStringExtra("principal"));
        double rate = Double.parseDouble(getIntent().getStringExtra("rate"));
        double time = Double.parseDouble(getIntent().getStringExtra("time"));

        double simpleInterest = (principal * rate * time) / 100;

        String result = "Principal: " + principal + "\nRate: " + rate + "%\nTime: " + time + " years\n\nSimple Interest: " + simpleInterest;
        tvResult.setText(result);
    }
}