package com.example.labreport2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.fragment.app.Fragment;

public class CalcFragment extends Fragment {
    EditText num1, num2, operator;
    Button calcBtn;
    TextView result;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_calc, container, false);
        num1 = v.findViewById(R.id.num1);
        num2 = v.findViewById(R.id.num2);
        operator = v.findViewById(R.id.operator);
        calcBtn = v.findViewById(R.id.calcBtn);
        result = v.findViewById(R.id.result);

        calcBtn.setOnClickListener(view -> {
            double n1 = Double.parseDouble(num1.getText().toString());
            double n2 = Double.parseDouble(num2.getText().toString());
            String op = operator.getText().toString();
            double res = 0;
            switch (op) {
                case "+": res = n1 + n2; break;
                case "-": res = n1 - n2; break;
                case "*": res = n1 * n2; break;
                case "/": res = n2 != 0 ? n1 / n2 : 0; break;
            }
            result.setText("Result: " + res);
        });

        return v;
    }
}

