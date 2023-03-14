package com.example.petalarmmobil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainMenu : AppCompatActivity() {

    private lateinit var btnCerrar: ImageView

    private lateinit var btn_gestor_alarmas: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        btnCerrar = findViewById(R.id.btn_cerrar)

        btn_gestor_alarmas = findViewById(R.id.btn_gestor_alarmas)

        btnCerrar.setOnClickListener {
            setContentView(R.layout.activity_main)
        }

        fun onClick(view: View) {
            val intent = Intent(this, MainAdminAlarm::class.java)
            startActivity(intent)
        }
    }


}