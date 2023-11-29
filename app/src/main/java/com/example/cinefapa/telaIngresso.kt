package com.example.cinefapa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class telaIngresso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_ingresso)

        val botaoContinuarTelaIngresso = findViewById<Button>(R.id.tela_lugares_continuar)

        botaoContinuarTelaIngresso.setOnClickListener {
            val irParaLugares = Intent(this, TelaLugares::class.java)
            startActivity(irParaLugares)
        }
    }
}