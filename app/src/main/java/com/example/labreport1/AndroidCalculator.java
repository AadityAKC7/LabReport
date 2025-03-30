package com.example.labreport1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AndroidCalculator extends AppCompatActivity {

    EditText etNumber1, etNumber2, etOperator;
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_calculator);

        etNumber1 = findViewById(R.id.etNumber1);
        etNumber2 = findViewById(R.id.etNumber2);
        etOperator = findViewById(R.id.etOperator);
        btnCalculate = findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(v -> {
            try {
                double num1 = Double.parseDouble(etNumber1.getText().toString().trim());
                double num2 = Double.parseDouble(etNumber2.getText().toString().trim());
                String operator = etOperator.getText().toString().trim();

                double result = 0;
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0)
                            result = num1 / num2;
                        else {
                            Toast.makeText(AndroidCalculator.this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        break;
                    default:
                        Toast.makeText(AndroidCalculator.this, "Invalid Operator", Toast.LENGTH_SHORT).show();
                        return;
                }

                Toast.makeText(AndroidCalculator.this, "Result: " + result, Toast.LENGTH_LONG).show();

            } catch (Exception e) {
                Toast.makeText(AndroidCalculator.this, "Invalid Input", Toast.LENGTH_SHORT).show();
            }
        });
    }
}