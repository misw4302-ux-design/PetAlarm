package com.example.petalarmmobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class new_alarm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_alarm);
    }


    public void goHome(View view){
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }


    public void goAdminAlarm(View view){
        Intent intent = new Intent(this, MainAdminAlarm.class);
        startActivity(intent);
    }
}