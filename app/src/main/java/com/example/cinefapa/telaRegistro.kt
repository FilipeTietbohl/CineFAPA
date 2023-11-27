package com.example.cinefapa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class telaRegistro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_registro)

        val botaoRegistrarTela2 = findViewById<Button>(R.id.botao_tela2_registrar)

        botaoRegistrarTela2.setOnClickListener {
            val intent = Intent(this, telaFilmes::class.java)
            startActivity(intent)
        }
    }
}