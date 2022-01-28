package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static String username;
    public static String userId;
    public static final String EXTRA_MESSAGE = "Secure Message";
    public static final String EXTRA_ID = "Secure Id";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText text = findViewById(R.id.usernameId);
        EditText id = findViewById(R.id.UserIdId);

        Button btn = findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = text.getText().toString();
                userId = id.getText().toString();
                if(!username.equals("")&&!userId.equals("")){
                    Intent intent = new Intent(MainActivity.this, Homepage.class);
                    intent.putExtra(EXTRA_MESSAGE, username);
                    intent.putExtra(EXTRA_ID, userId);

                    startActivity(intent);


                }
            }
        });


    }
}