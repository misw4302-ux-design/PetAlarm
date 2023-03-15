package com.example.petalarmmobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainAdminAlarm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_admin_alarm);
    }

    public void crearAlarma(View view){
        Intent intent = new Intent(this, new_alarm.class);
        startActivity(intent);
    }
}