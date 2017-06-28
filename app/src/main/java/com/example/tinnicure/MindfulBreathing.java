package com.example.tinnicure;

import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

public class MindfulBreathing extends AppCompatActivity {

    MediaPlayer mp;
    SeekBar seek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mindful_breathing);
        seek.findViewById(R.id.seekBar);
        seek.setMax(mp.getDuration());

        mp = MediaPlayer.create(this,R.raw.mbm);
    }

    private Handler mHandler = new Handler();
    private Runnable m

    public void playMusic(View view) {
        mp.start();
    }

    public void pauseMusic(View view){
        mp.pause();
    }



}
