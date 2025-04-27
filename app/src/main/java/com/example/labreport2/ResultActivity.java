package com.example.labreport2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        double result = getIntent().getDoubleExtra("result", 0);

        ResultFragment fragment = new ResultFragment();
        Bundle bundle = new Bundle();
        bundle.putDouble("result", result);
        fragment.setArguments(bundle);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }
}