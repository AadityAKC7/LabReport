package com.example.labreport2;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {
    Button menuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        menuButton = findViewById(R.id.menuButton);

        menuButton.setOnClickListener(v -> {
            PopupMenu popupMenu = new PopupMenu(MainActivity4.this, menuButton);
            MenuInflater inflater = popupMenu.getMenuInflater();
            inflater.inflate(R.menu.main_menu, popupMenu.getMenu());

            popupMenu.setOnMenuItemClickListener(item -> {
                int id = item.getItemId();

                if (id == R.id.new_item) {
                    Toast.makeText(MainActivity4.this, "New selected", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (id == R.id.edit_item) {
                    Toast.makeText(MainActivity4.this, "Edit selected", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (id == R.id.profile_item) {
                    Toast.makeText(MainActivity4.this, "Profile selected", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (id == R.id.logout_item) {
                    Toast.makeText(MainActivity4.this, "Logout selected", Toast.LENGTH_SHORT).show();
                    return true;
                } else {
                    return false;
                }
            });


            popupMenu.show();
        });
    }
}