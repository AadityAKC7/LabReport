package com.example.labreport1;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LogInfo extends AppCompatActivity {

    private static final String TAG = "LogInfo";
    TextView tvLifecycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_info);
        tvLifecycle = findViewById(R.id.tvLifecycle);
        logState("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        logState("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        logState("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        logState("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        logState("onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        logState("onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logState("onDestroy");
    }

    private void logState(String state) {
        Log.d(TAG, state);
        tvLifecycle.setText(state);
    }
}