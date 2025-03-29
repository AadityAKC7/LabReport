package com.example.labreport1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LayoutDemoApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_demo_app);
        Button btnSubmit = findViewById(R.id.btnSubmit);
        Button btnSave = findViewById(R.id.btnSave);

        btnSubmit.setOnClickListener(v ->
                Toast.makeText(this, "Form Submitted", Toast.LENGTH_SHORT).show());

        btnSave.setOnClickListener(v ->
                Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show());
    }
}