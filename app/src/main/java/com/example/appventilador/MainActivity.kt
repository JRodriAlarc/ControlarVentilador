package com.example.appventilador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apagar: Button = findViewById(R.id.btn_apagar)
        val encender: Button = findViewById(R.id.btn_encender)

        encender.setOnClickListener {
            enecnderVentilador()
        }

        apagar.setOnClickListener {
            apagarVentilador()
        }
    }

    fun enecnderVentilador(){
        Toast.makeText(this, "Ventilador Encendido", Toast.LENGTH_SHORT).show()
    }

    fun apagarVentilador(){
        Toast.makeText(this, "Ventilador Apagado", Toast.LENGTH_SHORT).show()
    }

}

