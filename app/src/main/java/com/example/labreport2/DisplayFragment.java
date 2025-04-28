package com.example.labreport2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class DisplayFragment extends Fragment {
    TextView nameView, emailView, phoneView, addressView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_display, container, false);

        nameView = v.findViewById(R.id.nameView);
        emailView = v.findViewById(R.id.emailView);
        phoneView = v.findViewById(R.id.phoneView);
        addressView = v.findViewById(R.id.addressView);

        Bundle bundle = getArguments();
        if (bundle != null) {
            nameView.setText("Name: " + bundle.getString("name"));
            emailView.setText("Email: " + bundle.getString("email"));
            phoneView.setText("Phone: " + bundle.getString("phone"));
            addressView.setText("Address: " + bundle.getString("address"));
        }

        return v;
    }
}