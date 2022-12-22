package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_main)

        val nomeUsuarioParam = intent.getStringExtra("NOME_USUARIO")

        val userNameTextView = findViewById<TextView>(R.id.userNameTextView)
        userNameTextView.text = "Bem vindo $nomeUsuarioParam"
    }
}