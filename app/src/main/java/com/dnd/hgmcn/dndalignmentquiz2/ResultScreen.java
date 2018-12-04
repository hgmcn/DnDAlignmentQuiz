package com.dnd.hgmcn.dndalignmentquiz2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ResultScreen extends AppCompatActivity {
    public Button homeButton3;
    public Button musicOnButton2;
    public Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_screen);

        homeButton3 = findViewById(R.id.homeButton3);
        homeButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewStartScreen();
            }
        });
        musicOnButton2 = findViewById(R.id.musicOnButton2);
        musicOnButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (v == musicOnButton2 && pressed == false) {
                    musicOnButton2.setBackgroundResource(R.drawable.mute);
                    pressed = true;
                }
                if (v == musicOnButton2 && pressed == true) {
                    musicOnButton2.setBackgroundResource(R.drawable.volume);
                    pressed = false;
                }
            }
        });
        saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("saveTag", "Save button has been pressed.");
            }
        });
    }
    public void openNewStartScreen() {
        Intent intent = new Intent(this, NewStartScreen.class);
        startActivity(intent);
    }
}
