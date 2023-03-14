package com.example.petalarmmobil

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Registro : AppCompatActivity() {

    private lateinit var btnCerrar: ImageView

    private lateinit var btnRegistred: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        btnCerrar = findViewById(R.id.btn_cerrar)

        btnRegistred = findViewById(R.id.btn_registred)

        btnRegistred.setOnClickListener {
            setContentView(R.layout.activity_main)
        }

    }
}