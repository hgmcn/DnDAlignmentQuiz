package com.dnd.hgmcn.dndalignmentquiz2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DnDScreen extends Activity {
    public Button musicOnButton4;
    public Button homeButton4;
    public boolean pressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dn_dscreen);

        homeButton4 = findViewById(R.id.homeButton4);
        homeButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewStartScreen();
            }
        });
        musicOnButton4 = findViewById(R.id.musicOnButton4);
        musicOnButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == musicOnButton4) {
                    if (!pressed) {
                        musicOnButton4.setBackgroundResource(R.drawable.mute);
                        pressed = true;
                    } else {
                        musicOnButton4.setBackgroundResource(R.drawable.volume);
                        pressed = false;
                    }
                }
            }
        });
    }
    public void openNewStartScreen() {
        Intent intent = new Intent(this, NewStartScreen.class);
        startActivity(intent);
    }
}
