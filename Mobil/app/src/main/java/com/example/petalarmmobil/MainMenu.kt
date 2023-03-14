package com.example.petalarmmobil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainMenu : AppCompatActivity() {

    private lateinit var btnCerrar: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        btnCerrar = findViewById(R.id.btn_cerrar)

        btnCerrar.setOnClickListener {
            setContentView(R.layout.activity_main)
        }
    }
}