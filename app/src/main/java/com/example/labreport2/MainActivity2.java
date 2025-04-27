package com.example.labreport2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    EditText num1, num2;
    Button sumBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        sumBtn = findViewById(R.id.sumBtn);

        sumBtn.setOnClickListener(v -> {
            double n1 = Double.parseDouble(num1.getText().toString());
            double n2 = Double.parseDouble(num2.getText().toString());
            double sum = n1 + n2;

            Intent i = new Intent(MainActivity2.this, ResultActivity.class);
            i.putExtra("result", sum);
            startActivity(i);
        });
    }
}