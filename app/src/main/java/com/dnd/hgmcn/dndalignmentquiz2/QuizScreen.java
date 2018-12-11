package com.dnd.hgmcn.dndalignmentquiz2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.spotify.android.appremote.api.ConnectionParams;
import com.spotify.android.appremote.api.Connector;
import com.spotify.android.appremote.api.SpotifyAppRemote;

import com.spotify.protocol.client.Subscription;
import com.spotify.protocol.types.PlayerState;
import com.spotify.protocol.types.Track;

public class QuizScreen extends Activity {
    public Button homeButton;
    public Button musicOnButton;
    public Button nextButton;
    public boolean pressed = false;
    public RadioGroup choice;
    public RadioButton firstChoice;
    public RadioButton secondChoice;
    public RadioButton thirdChoice;
    public TextView quizQuestionText;
    public int current = 0;
    public int chaoticAddition = 0;
    public int evilAddition =  0;
    public static int chaoticScore = 0;
    public static int evilScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_screen);

        quizQuestionText = findViewById(R.id.quizQuestionText);
        quizQuestionText.setText(QuizMechanics.questions[0]);

        firstChoice = findViewById(R.id.aAnswer); //
        secondChoice = findViewById(R.id.bAnswer); //
        thirdChoice = findViewById(R.id.cAnswer); //
        firstChoice.setText(QuizMechanics.choices[0][0]);
        secondChoice.setText(QuizMechanics.choices[0][1]);
        thirdChoice.setText(QuizMechanics.choices[0][2]);

        chaoticScore = 0;
        evilScore =  0;

        homeButton = findViewById(R.id.homeButton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewStartScreen();
            }
        });
        nextButton = findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current++;
                if (current < 30) {
                    quizQuestionText.setText(QuizMechanics.questions[current]);
                    firstChoice.setText(QuizMechanics.choices[current][0]);
                    secondChoice.setText(QuizMechanics.choices[current][1]);
                    thirdChoice.setText(QuizMechanics.choices[current][2]);
                    if (current < 15) {
                        if (firstChoice.isChecked()) {
                            chaoticAddition = 5;
                        }
                        if (secondChoice.isChecked()) {
                            chaoticAddition = 0;
                        }
                        if (thirdChoice.isChecked()) {
                            chaoticAddition = -5;
                        }
                        chaoticScore += chaoticAddition;
                    }
                    if (current >= 15) {
                        if (firstChoice.isChecked()) {
                            evilAddition = 5;
                        }
                        if (secondChoice.isChecked()) {
                            evilAddition = 0;
                        }
                        if (thirdChoice.isChecked()) {
                            evilAddition = -5;
                        }
                        evilScore += evilAddition;
                    }
                }
                else {
                    openResultScreen();
                    System.out.println("Chaotic score is " + chaoticScore);
                    System.out.println("Evil score is " + evilScore);
                }
            }
        });
        choice = findViewById(R.id.choice);
        choice.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Log.d("Radio Choice selection", "it has been selected");
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
}
