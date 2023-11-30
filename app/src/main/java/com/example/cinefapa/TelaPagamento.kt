package com.example.cinefapa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TelaPagamento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_pagamento)

        val botaoContinuarTelaResumo = findViewById<Button>(R.id.btn_pagar)


        botaoContinuarTelaResumo.setOnClickListener {
            val irParaTelaResumo = Intent(this, TelaResumo::class.java)
            startActivity(irParaTelaResumo)
        }
    }
}