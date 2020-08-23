package com.example.exercise_ui_createaccount;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

        Button createbutton = findViewById(R.id.create_button);
        createbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCreatAccount();
            }
        });




    }

    public void openCreatAccount() {
        Intent intent = new Intent(this, CreateAccountPage.class);
        startActivity(intent);
    }
}