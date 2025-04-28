package com.example.labreport2;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity6 extends AppCompatActivity {

    EditText editText;
    String clipboardText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        editText = findViewById(R.id.edit_text);
        registerForContextMenu(editText);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Select Action");
        menu.add(0, v.getId(), 0, "Copy");
        menu.add(0, v.getId(), 1, "Paste");
        menu.add(0, v.getId(), 2, "Cut");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getTitle() == "Copy") {
            clipboardText = editText.getText().toString();
            Toast.makeText(this, "Copied", Toast.LENGTH_SHORT).show();
        } else if (item.getTitle() == "Paste") {
            editText.setText(editText.getText().toString() + clipboardText);
            Toast.makeText(this, "Pasted", Toast.LENGTH_SHORT).show();
        } else if (item.getTitle() == "Cut") {
            clipboardText = editText.getText().toString();
            editText.setText("");
            Toast.makeText(this, "Cut", Toast.LENGTH_SHORT).show();
        } else {
            return false;
        }
        return true;
    }
}