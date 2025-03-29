package com.example.labreport1;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class RegistrationFormApp extends AppCompatActivity {
    EditText etUserName, etPassword, etAddress, etAge;
    RadioGroup rgGender;
    Spinner spinnerState;
    TextView tvOutput;
    Button btnSubmit, btnPickDate;
    String selectedDate = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form_app);

        etUserName = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        etAddress = findViewById(R.id.etAddress);
        etAge = findViewById(R.id.etAge);
        rgGender = findViewById(R.id.rgGender);
        spinnerState = findViewById(R.id.spinnerstate);
        tvOutput = findViewById(R.id.tvOutput);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnPickDate = findViewById(R.id.btnPickDate);

        // Populate Spinner with State Names
        String[] states = {"Select State", "State 1", "State 2", "State 3", "State 4", "State 5"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, states);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerState.setAdapter(adapter);

        // Date Picker
        btnPickDate.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    (view, year1, monthOfYear, dayOfMonth) -> {
                        selectedDate = dayOfMonth + "/" + (monthOfYear + 1) + "/" + year1;
                        btnPickDate.setText(selectedDate);
                    }, year, month, day);
            datePickerDialog.show();
        });

        // Submit Button
        btnSubmit.setOnClickListener(v -> {
            String userName = etUserName.getText().toString().trim();
            String password = etPassword.getText().toString().trim();
            String address = etAddress.getText().toString().trim();
            String age = etAge.getText().toString().trim();
            String gender = ((RadioButton) findViewById(rgGender.getCheckedRadioButtonId())).getText().toString();
            String state = spinnerState.getSelectedItem().toString();

            // Display Data
            String output = "User Name: " + userName + "\n" +
                    "Password: " + password + "\n" +
                    "Address: " + address + "\n" +
                    "Gender: " + gender + "\n" +
                    "Age: " + age + "\n" +
                    "Date of Birth: " + selectedDate + "\n" +
                    "State: " + state;

            tvOutput.setText(output);
        });
    }
}