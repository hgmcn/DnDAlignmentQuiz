package com.dnd.hgmcn.dndalignmentquiz2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class QuizScreen extends AppCompatActivity {
    public Button homeButton;
    public Button musicOnButton;
    public Button nextButton;
    public RadioGroup questionGrouping;
    //public RadioButton choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_screen);

        questionGrouping = findViewById(R.id.questionGrouping);

        homeButton = findViewById(R.id.homeButton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewStartScreen();
            }
        });
        musicOnButton = findViewById(R.id.musicOnButton);
        musicOnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pressed = false;
                if (v == musicOnButton && pressed == false) {
                    musicOnButton.setBackgroundResource(R.drawable.mute);
                    pressed = true;
                }
                if (v == musicOnButton && pressed == true) {
                    musicOnButton.setBackgroundResource(R.drawable.volume);
                    pressed = false;
                }
            }
        });
        nextButton = findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openResultScreen();
            }
        });
    }
    public void openNewStartScreen() {
        Intent intent = new Intent(this, NewStartScreen.class);
        startActivity(intent);
    }
    public void openResultScreen() {
        Intent intent = new Intent(this, ResultScreen.class);
        startActivity(intent);
    }
    //public void quizMethod(View v) {
    //}
}
