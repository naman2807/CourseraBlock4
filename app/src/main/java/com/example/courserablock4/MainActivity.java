package com.example.courserablock4;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer pianoMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pianoMusic = MediaPlayer.create(this, R.raw.piano);
    }

    public void playMusic(View view){
        pianoMusic.start();
    }

    public void pauseMusic(View v){

    }
}