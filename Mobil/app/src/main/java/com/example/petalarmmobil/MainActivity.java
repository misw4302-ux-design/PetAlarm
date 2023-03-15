package com.example.petalarmmobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ingresar(View view){
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }
    public void registrarse(View view){
        Intent intent = new Intent(this, Registro.class);
        startActivity(intent);
    }
}