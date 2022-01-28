package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Intent in = getIntent();
        String username = in.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String userId = in.getStringExtra(MainActivity.EXTRA_ID);




        TextView welcomeMsg = findViewById(R.id.homeMsgId);
        welcomeMsg.setText("Welcome " + username);

        TextView id = findViewById(R.id.logedInas);
        id.setText("Logged in as " + userId);

        Button btn  = findViewById(R.id.btn2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Homepage.this, Songs.class);
                startActivity(intent);
            }
        });


    }
}