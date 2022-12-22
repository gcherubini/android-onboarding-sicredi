package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_main)
        setupButtonClick()
    }

    private fun setupButtonClick() {
        val enterButton = findViewById<Button>(R.id.enterButton)
        enterButton.setOnClickListener {
            val userNameEditText = findViewById<EditText>(R.id.userNameEditText)

            val toast = Toast.makeText(
                applicationContext,
                "Nome do Usuário: ${userNameEditText.text}", Toast.LENGTH_SHORT
            )
            toast.show()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("NOME_USUARIO", userNameEditText.text.toString())
            startActivity(intent)
        }
    }
}