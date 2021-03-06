package com.dnd.hgmcn.dndalignmentquiz2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.spotify.android.appremote.api.ConnectionParams;
import com.spotify.android.appremote.api.Connector;
import com.spotify.android.appremote.api.SpotifyAppRemote;

import com.spotify.protocol.client.Subscription;
import com.spotify.protocol.types.PlayerState;
import com.spotify.protocol.types.Track;

import com.dnd.hgmcn.dndalignmentquiz2.NewStartScreen;
import com.dnd.hgmcn.dndalignmentquiz2.DnDScreen;
import com.dnd.hgmcn.dndalignmentquiz2.QuizMechanics;
import com.dnd.hgmcn.dndalignmentquiz2.QuizScreen;
import com.dnd.hgmcn.dndalignmentquiz2.ResultScreen;
import com.dnd.hgmcn.dndalignmentquiz2.SavedResultsScreen;

public class ResultScreen extends Activity {
    public Button homeButton3;
    public boolean pressed = false;
    public TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_screen);

        result = findViewById(R.id.resultText);
        if (QuizScreen.chaoticScore <= -25 && QuizScreen.evilScore <= -25) {
            result.setText("Lawful Good");
        } else if (QuizScreen.chaoticScore <= -25 && QuizScreen.evilScore >= -24 && QuizScreen.evilScore <= 24) {
            result.setText("Lawful Neutral");
        } else if (QuizScreen.chaoticScore <= -25 && QuizScreen.evilScore >= 25) {
            result.setText("Lawful Evil");
        } else if (QuizScreen.chaoticScore >= -24 && QuizScreen.chaoticScore <= 24 && QuizScreen.evilScore <= -25) {
            result.setText("Neutral Good");
        } else if (QuizScreen.chaoticScore >= -24 && QuizScreen.chaoticScore <= 24 && QuizScreen.evilScore >= -24 && QuizScreen.evilScore <= 24) {
            result.setText("True Neutral");
        } else if (QuizScreen.chaoticScore >= -24 && QuizScreen.chaoticScore <= 24 && QuizScreen.evilScore >= 25) {
            result.setText("Neutral Evil");
        } else if (QuizScreen.chaoticScore >= 25 && QuizScreen.evilScore <= -25) {
            result.setText("Chaotic Good");
        } else if (QuizScreen.chaoticScore >= 25 && QuizScreen.evilScore >= -24 && QuizScreen.evilScore <= 24) {
            result.setText("Chaotic Neutral");
        } else if (QuizScreen.chaoticScore >= -25 && QuizScreen.evilScore >= 25) {
            result.setText("Chaotic Evil");
        }
        homeButton3 = findViewById(R.id.homeButton3);
        homeButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewStartScreen();
            }
        });
    }
    public void openNewStartScreen() {
        Intent intent = new Intent(this, NewStartScreen.class);
        startActivity(intent);
    }
}
