package com.example.labreport2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class ResultFragment extends Fragment {
    TextView resultView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_result, container, false);
        resultView = v.findViewById(R.id.resultView);

        double res = getArguments().getDouble("result", 0);
        resultView.setText("Result: " + res);

        return v;
    }
}