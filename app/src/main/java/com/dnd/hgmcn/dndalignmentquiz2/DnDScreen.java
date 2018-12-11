package com.dnd.hgmcn.dndalignmentquiz2;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dnd.hgmcn.dndalignmentquiz2.NewStartScreen;
import com.dnd.hgmcn.dndalignmentquiz2.DnDScreen;
import com.dnd.hgmcn.dndalignmentquiz2.QuizMechanics;
import com.dnd.hgmcn.dndalignmentquiz2.QuizScreen;
import com.dnd.hgmcn.dndalignmentquiz2.ResultScreen;
import com.dnd.hgmcn.dndalignmentquiz2.SavedResultsScreen;

/** Code used to import necessary pieces of Spotify API. */

import com.spotify.android.appremote.api.ConnectionParams;
import com.spotify.android.appremote.api.Connector;
import com.spotify.android.appremote.api.SpotifyAppRemote;

import com.spotify.protocol.client.Subscription;
import com.spotify.protocol.types.PlayerState;
import com.spotify.protocol.types.Track;

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
























        
    }
    public void openNewStartScreen() {
        Intent intent = new Intent(this, NewStartScreen.class);
        startActivity(intent);
    }
}
