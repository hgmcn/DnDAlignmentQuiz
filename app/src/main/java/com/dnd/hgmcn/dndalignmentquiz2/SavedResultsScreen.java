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

public class SavedResultsScreen extends Activity {
    public Button homeButton2;
    public boolean pressed = false;

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
    }
    public void openNewStartScreen() {
        Intent intent = new Intent(this, NewStartScreen.class);
        startActivity(intent);
    }
}
