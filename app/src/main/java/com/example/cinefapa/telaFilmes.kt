package com.example.cinefapa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class telaFilmes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_filmes)

        val botaoComprarFilme1 = findViewById<Button>(R.id.comprar_filme1)
        val botaoComprarFilme2 = findViewById<Button>(R.id.comprar_filme2)
        val botaoComprarFilme3 = findViewById<Button>(R.id.comprar_filme3)


        botaoComprarFilme1.setOnClickListener {
            val intent = Intent(this, telaFilmes::class.java)
            startActivity(intent)
        }
        botaoComprarFilme2.setOnClickListener {
            val intent = Intent(this, telaFilmes::class.java)
            startActivity(intent)
        }
        botaoComprarFilme3.setOnClickListener {
            val intent = Intent(this, telaFilmes::class.java)
            startActivity(intent)
        }
    }
}