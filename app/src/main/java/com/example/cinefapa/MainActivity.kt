package com.example.cinefapa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoLoginTela1 = findViewById<Button>(R.id.botao_login_tela1)
        val botaoRegistrarTela1 = findViewById<Button>(R.id.botao_registrar_tela1)


        botaoLoginTela1.setOnClickListener {
            val intent = Intent(this, telaLogin::class.java)
            startActivity(intent)
        }

        botaoRegistrarTela1.setOnClickListener {
            val intent = Intent(this, telaRegistro::class.java)
            startActivity(intent)
        }


        }


}