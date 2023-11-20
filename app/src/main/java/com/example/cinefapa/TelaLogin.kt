package com.example.cinefapa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TelaLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_login)

        val telaExibir = findViewById<Button>(R.id.tela2_login)
        telaExibir.setOnClickListener {
            irParaTelaExibicao()
        }
    }
    private fun irParaTelaExibicao(){
        val telaExibir = Intent(this, telaExibicao::class.java)
        startActivity(telaExibir)
    }
}