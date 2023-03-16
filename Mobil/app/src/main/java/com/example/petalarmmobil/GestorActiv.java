package com.example.petalarmmobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GestorActiv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestor);
    }

    public void goMenu(View view){
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

}