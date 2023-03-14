package com.example.petalarmmobil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnRegistro: Button

    private lateinit var btnIngresar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnRegistro = findViewById(R.id.btn_registrarse)
        btnIngresar = findViewById(R.id.btn_ingresar)

        btnRegistro.setOnClickListener {
            setContentView(R.layout.activity_registro)
        }


        btnIngresar.setOnClickListener {
            setContentView(R.layout.activity_main_menu)
        }



    }
}