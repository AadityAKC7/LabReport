package com.example.labreport2;
import android.app.Dialog;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class MyDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        builder.setTitle("Popup Dialog")
                .setMessage("This is a dialog using Fragment!")
                .setPositiveButton("OK", (dialog, id) -> dialog.dismiss());

        return builder.create();
    }
}