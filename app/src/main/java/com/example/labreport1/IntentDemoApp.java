package com.example.labreport1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class IntentDemoApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_demo_app);


        Button btnExplicitIntent = findViewById(R.id.btnExplicitIntent);
        Button btnImplicitIntent = findViewById(R.id.btnImplicitIntent);

        // Explicit Intent (Navigate to SecondActivity)
        btnExplicitIntent.setOnClickListener(v -> {
            Intent explicitIntent = new Intent(IntentDemoApp.this, SecondActivity1.class);
            startActivity(explicitIntent);
        });

        // Implicit Intent (Open Web Page)
        btnImplicitIntent.setOnClickListener(v -> {
            Intent implicitIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
            startActivity(implicitIntent);
        });
    }
}