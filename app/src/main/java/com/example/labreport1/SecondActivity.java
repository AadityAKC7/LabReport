package com.example.labreport1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tvWelcome = findViewById(R.id.tvWelcome);
        String name = getIntent().getStringExtra("user_name");

        tvWelcome.setText("Hello, " + name);
    }
}