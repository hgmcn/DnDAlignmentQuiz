package com.dnd.hgmcn.dndalignmentquiz2;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.spotify.android.appremote.api.ConnectionParams;
import com.spotify.android.appremote.api.Connector;
import com.spotify.android.appremote.api.SpotifyAppRemote;

import com.spotify.protocol.client.Subscription;
import com.spotify.protocol.types.PlayerState;
import com.spotify.protocol.types.Track;

public class NewStartScreen extends Activity {
    Button beginButton;
    Button savedResultsButton;
    Button dndButton;

    /** Code added while setting up Spotify. */

    private static final String CLIENT_ID = "3d956635503d420abb4a8dc59cf4d5aa";
    private static final String REDIRECT_URI = "testschema://callback";
    private SpotifyAppRemote mSpotifyAppRemote;

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

    /** Code added while setting up Spotify */

    @Override
    protected void onStart() {
        super.onStart();
        ConnectionParams connectionParams =
                new ConnectionParams.Builder(CLIENT_ID)
                .setRedirectUri(REDIRECT_URI)
                .showAuthView(true)
                .build();
        SpotifyAppRemote.connect(this, connectionParams,
                new Connector.ConnectionListener() {
                    @Override
                    public void onConnected(SpotifyAppRemote spotifyAppRemote) {
                        mSpotifyAppRemote = spotifyAppRemote;
                        Log.d("NewStartScreen", "Connected! Yay!");

                        connected();
                    }

                    @Override
                    public void onFailure(Throwable throwable) {
                        Log.e("NewStartScreen", throwable.getMessage(), throwable);
                    }
                });
    }

    private void connected() {
        mSpotifyAppRemote.getPlayerApi().play("spotify:playlist:37i9dQZF1DX2sUQwD7tbmL");
    }

    @Override
    protected void onStop() {
        super.onStop();
        // Aaand we will finish off here.
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
