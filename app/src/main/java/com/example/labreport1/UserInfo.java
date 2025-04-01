package com.example.labreport1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class UserInfo extends AppCompatActivity {

    EditText etName, etEmail, etAge, etWebsite;
    RadioGroup rgGender;
    Button btnSubmit;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        rgGender = findViewById(R.id.rgGender);
        etAge = findViewById(R.id.etAge);
        etWebsite = findViewById(R.id.etWebsite);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvResult = findViewById(R.id.tvResult);

        btnSubmit.setOnClickListener(v -> {
            String name = etName.getText().toString().trim();
            String email = etEmail.getText().toString().trim();
            String age = etAge.getText().toString().trim();
            String website = etWebsite.getText().toString().trim();
            int selectedGenderId = rgGender.getCheckedRadioButtonId();
            String gender = selectedGenderId != -1 ? ((RadioButton) findViewById(selectedGenderId)).getText().toString() : "Not Selected";

            String result = "Name: " + name + "\nEmail: " + email + "\nGender: " + gender + "\nAge: " + age + "\nWebsite: " + website;
            tvResult.setText(result);
            tvResult.setVisibility(View.VISIBLE);
        });
    }
}