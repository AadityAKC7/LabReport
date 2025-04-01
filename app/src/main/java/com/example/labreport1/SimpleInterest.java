package com.example.labreport1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SimpleInterest extends AppCompatActivity {

    EditText etPrincipal, etRate, etTime;
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_interest);

        etPrincipal = findViewById(R.id.etPrincipal);
        etRate = findViewById(R.id.etRate);
        etTime = findViewById(R.id.etTime);
        btnCalculate = findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(v -> {
            Intent intent = new Intent(SimpleInterest.this, SimpleInterestOutput.class);
            intent.putExtra("principal", etPrincipal.getText().toString().trim());
            intent.putExtra("rate", etRate.getText().toString().trim());
            intent.putExtra("time", etTime.getText().toString().trim());
            startActivity(intent);
        });
    }
}