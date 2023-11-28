package com.example.cinefapa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class TelaLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_login)

        val botaoLogarTela2 = findViewById<Button>(R.id.botao_tela2_logar)


        botaoLogarTela2.setOnClickListener {
            val intent = Intent(this, telaFilmes::class.java)
            startActivity(intent)
        }

    }
}