package com.example.android.udaplayer;

import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;

public class NowPlaying extends AppCompatActivity {

    SeekBar seekBar;

    MediaPlayer mediaPlayer1;
    MediaPlayer mediaPlayer2;
    MediaPlayer mediaPlayer3;

    Handler handler;
    Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        handler = new Handler();
        seekBar = (SeekBar) findViewById(R.id.seekbar);
        mediaPlayer1 = MediaPlayer.create(getApplicationContext(), R.raw.eminem_mockingbird);
        mediaPlayer2 = MediaPlayer.create(getApplicationContext(), R.raw.allaturca_mozart);
        mediaPlayer3 = MediaPlayer.create(getApplicationContext(), R.raw.johnnyhartman_lushlife);
    }
}
