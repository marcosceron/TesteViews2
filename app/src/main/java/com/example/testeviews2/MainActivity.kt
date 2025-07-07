package com.example.testeviews2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // Exercício 2
        val botao: Button = findViewById(R.id.botao)
        botao.setOnClickListener {
            Toast.makeText(this, "Botão clicado!", Toast.LENGTH_SHORT).show()
        }

        // Exercício 3
        val inputText: EditText = findViewById<EditText>(R.id.input_text)
        val botaoMostrar: Button = findViewById<Button>(R.id.mostrar_texto)
        botaoMostrar.setOnClickListener {
            val text = inputText.text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
    }
}