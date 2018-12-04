package com.dnd.hgmcn.dndalignmentquiz2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SavedResultsScreen extends AppCompatActivity {
    public Button homeButton2;
    public Button musicOnButton3;
    public Button deleteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_results_screen);

        homeButton2 = findViewById(R.id.homeButton2);
        homeButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewStartScreen();
            }
        });
        musicOnButton3 = findViewById(R.id.musicOnButton3);
        musicOnButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (v == musicOnButton3 && pressed == false) {
                    musicOnButton3.setBackgroundResource(R.drawable.mute);
                    pressed = true;
                }
                if (v == musicOnButton3 && pressed == true) {
                    musicOnButton3.setBackgroundResource(R.drawable.volume);
                    pressed = false;
                }
            }
        });
        deleteButton = findViewById(R.id.deleteButton);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("deleteTag", "delete button has been pressed.");
            }
        });
    }
    public void openNewStartScreen() {
        Intent intent = new Intent(this, NewStartScreen.class);
        startActivity(intent);
    }
}
