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

public class IntentExampleApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_example_app);

        EditText etName = findViewById(R.id.etName);
        Button btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(v -> {
            String name = etName.getText().toString().trim();
            Intent intent = new Intent(IntentExampleApp.this, SecondActivity.class);
            intent.putExtra("user_name", name);
            startActivity(intent);
        });
    }
}