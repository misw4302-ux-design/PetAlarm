package com.example.petalarmmobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void gestorAlarma(View view){
        Intent intent = new Intent(this, MainAdminAlarm.class);
        startActivity(intent);
    }

    public void goHome(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void gestorActividad(View view) {
        Intent intent = new Intent(this, GestorActiv.class);
        startActivity(intent);
    }

    public void gestorIOT(View view){
        Intent intent = new Intent(this, IotAdmin.class);
        startActivity(intent);
    }
}