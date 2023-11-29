package com.example.cinefapa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TelaLugares : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_lugares)

        val botaoContinuarTelaLugares = findViewById<Button>(R.id.tela_lugares_continuar)


        botaoContinuarTelaLugares.setOnClickListener {
            val irParaTelaPagamento = Intent(this, TelaPagamento::class.java)
            startActivity(irParaTelaPagamento)
        }

    }
}