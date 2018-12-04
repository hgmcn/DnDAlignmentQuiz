package com.dnd.hgmcn.dndalignmentquiz2;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class NewStartScreen extends Activity {
    private Button beginButton;
    private Button savedResultsButton;
    private Button dndButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_start_screen);

        dndButton = findViewById(R.id.dndButton);
        dndButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDnDScreen();
            }
        });

        savedResultsButton = findViewById(R.id.savedResultsButton);
        savedResultsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSavedResultsScreen();
            }
        });

        beginButton = findViewById(R.id.beginButton);
        beginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuizScreen();
            }
        });
    }
    public void openQuizScreen() {
        Intent intent = new Intent(this, QuizScreen.class);
        startActivity(intent);
    }
    public void openSavedResultsScreen() {
        Intent intent = new Intent(this, SavedResultsScreen.class);
        startActivity(intent);
    }
    public void openDnDScreen() {
        Intent intent = new Intent(this, DnDScreen.class);
        startActivity(intent);
    }
}
