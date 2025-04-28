package com.example.labreport2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.fragment.app.Fragment;

public class InputFragment extends Fragment {
    EditText name, email, phone, address;
    Button submitBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_input, container, false);

        name = v.findViewById(R.id.name);
        email = v.findViewById(R.id.email);
        phone = v.findViewById(R.id.phone);
        address = v.findViewById(R.id.address);
        submitBtn = v.findViewById(R.id.submitBtn);

        submitBtn.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("name", name.getText().toString());
            bundle.putString("email", email.getText().toString());
            bundle.putString("phone", phone.getText().toString());
            bundle.putString("address", address.getText().toString());

            DisplayFragment displayFragment = new DisplayFragment();
            displayFragment.setArguments(bundle);

            requireActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, displayFragment)
                    .addToBackStack(null)
                    .commit();
        });

        return v;
    }
}