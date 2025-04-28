package com.example.labreport2;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity7 extends AppCompatActivity {

    EditText subject1, subject2, subject3, subject4, subject5;
    Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        subject1 = findViewById(R.id.subject1);
        subject2 = findViewById(R.id.subject2);
        subject3 = findViewById(R.id.subject3);
        subject4 = findViewById(R.id.subject4);
        subject5 = findViewById(R.id.subject5);
        calculateButton = findViewById(R.id.calculate_button);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateResult();
            }
        });
    }

    private void calculateResult() {
        try {
            int marks1 = Integer.parseInt(subject1.getText().toString());
            int marks2 = Integer.parseInt(subject2.getText().toString());
            int marks3 = Integer.parseInt(subject3.getText().toString());
            int marks4 = Integer.parseInt(subject4.getText().toString());
            int marks5 = Integer.parseInt(subject5.getText().toString());

            int totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;
            float percentage = (totalMarks / 500.0f) * 100;

            String result = "Fail";
            if (marks1 >= 35 && marks2 >= 35 && marks3 >= 35 && marks4 >= 35 && marks5 >= 35) {
                result = "Pass";
            }

            showResultDialog(totalMarks, result, percentage);
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity7.this, "Please enter valid marks", Toast.LENGTH_SHORT).show();
        }
    }

    private void showResultDialog(int totalMarks, String result, float percentage) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity7.this);
        builder.setTitle("Result");
        builder.setMessage("Total Marks: " + totalMarks + "\nResult: " + result + "\nPercentage: " + percentage + "%");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.create().show();
    }
}