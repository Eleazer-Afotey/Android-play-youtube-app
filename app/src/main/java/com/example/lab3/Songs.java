package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(Songs.this, SongOnYouTube.class);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=ZbZSe6N_BXs&ab_channel=PharrellWilliamsVEVO"));
                startActivity(intent);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(Songs.this, SongOnYouTube.class);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=Rxym2vuZn8M&ab_channel=1daBanton"));
                startActivity(intent);

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(Songs.this, SongOnYouTube.class);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=d6BzCEkGd3I&ab_channel=VersuS"));
                startActivity(intent);

            }
        });


    }
}