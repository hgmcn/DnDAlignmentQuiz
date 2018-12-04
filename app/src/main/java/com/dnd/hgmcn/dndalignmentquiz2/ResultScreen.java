package com.dnd.hgmcn.dndalignmentquiz2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ResultScreen extends Activity {
    public Button homeButton3;
    public Button musicOnButton2;
    public Button saveButton;
    public boolean pressed = false;

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
                if (!pressed) {
                    musicOnButton2.setBackgroundResource(R.drawable.mute);
                    pressed = true;
                } else {
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
