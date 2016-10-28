package com.evolutiondso.www.playasongpauseasong;
import java.util.concurrent.TimeUnit;


import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends Activity {

    private MediaPlayer mediaPlayer;
    public TextView songName, duration;
    private SeekBar seekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set the layout of the Activity
        setContentView(R.layout.activity_main);


        //initialize views
        initializeViews();
    }

    public void initializeViews(){
        songName = (TextView) findViewById(R.id.songName);
        mediaPlayer = MediaPlayer.create(this, R.raw.daft);
        duration = (TextView) findViewById(R.id.songDuration);
        seekbar = (SeekBar) findViewById(R.id.seekBar);
        songName.setText("DaftPunk.mp3");
        seekbar.setClickable(false);
    }

    // play mp3 song
    public void play(View view) {
        mediaPlayer.start();
    }


    // pause mp3 song
    public void pause(View view) {
        mediaPlayer.pause();
    }

}