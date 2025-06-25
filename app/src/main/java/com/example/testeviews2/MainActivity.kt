package com.example.testeviews2

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val botao: Button = findViewById(R.id.botao)
        botao.setOnClickListener {
            Toast.makeText(this, "Botão clicado!", Toast.LENGTH_SHORT).show()
        }
    }
}