package com.example.courserablock4;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

import com.google.android.material.switchmaterial.SwitchMaterial;

public class MainActivity extends AppCompatActivity {

    MediaPlayer pianoMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pianoMusic = MediaPlayer.create(this, R.raw.piano);
        SwitchMaterial switchMaterial = findViewById(R.id.loop);
        switchMaterial.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });
    }

    public void playMusic(View view){
        pianoMusic.start();
    }

    public void pauseMusic(View v){
        if(pianoMusic.isPlaying()){
            pianoMusic.pause();
        }
    }
}