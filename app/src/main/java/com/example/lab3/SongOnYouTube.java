package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class SongOnYouTube extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_on_you_tube);

        Intent intent = getIntent();
        Uri link = intent.getData();

        Intent launch = new Intent(intent.ACTION_VIEW, link);
        startActivity(launch);

    }
}