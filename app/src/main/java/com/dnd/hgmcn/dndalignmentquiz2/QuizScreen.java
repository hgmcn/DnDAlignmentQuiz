package com.dnd.hgmcn.dndalignmentquiz2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
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
    public TextView quizQuestionText;
    public int current = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_screen);

        quizQuestionText = findViewById(R.id.quizQuestionText);
        quizQuestionText.setText(QuizMechanics.questions[0]);

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
                if (!pressed) {
                    musicOnButton.setBackgroundResource(R.drawable.mute);
                    pressed = true;
                } else {
                    musicOnButton.setBackgroundResource(R.drawable.volume);
                    pressed = false;
                }
            }
        });
        nextButton = findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current++;
                if (current < 30) {
                    quizQuestionText.setText(QuizMechanics.questions[current]);
                }
                else {
                    openResultScreen();
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
