package com.example.cinefapa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logar = findViewById<Button>(R.id.logar)
        logar.setOnClickListener {
            irParaTelaDeLogin()
        }
    }
    private fun irParaTelaDeLogin() {
        val telaLogin= Intent(this, TelaLogin::class.java)
        startActivity(telaLogin)
    }
}