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

public class UserInfo2Another extends AppCompatActivity {

    EditText etName, etEmail, etPhone, etAddress;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info2_another);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPhone = findViewById(R.id.etPhone);
        etAddress = findViewById(R.id.etAddress);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(v -> {
            Intent intent = new Intent(UserInfo2Another.this, DisplayActivity.class);
            intent.putExtra("name", etName.getText().toString().trim());
            intent.putExtra("email", etEmail.getText().toString().trim());
            intent.putExtra("phone", etPhone.getText().toString().trim());
            intent.putExtra("address", etAddress.getText().toString().trim());
            startActivity(intent);
        });
    }
}