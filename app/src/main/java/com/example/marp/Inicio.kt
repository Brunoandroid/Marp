package com.example.marp

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Inicio : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        // DECLARACAO DE VARIAVEIS
        val bt = findViewById<Button>(R.id.bt)
        val usuario = findViewById<EditText>(R.id.campusu)
        val senha = findViewById<EditText>(R.id.campsenha)

        // CHAMADA DE FUNCAO
        bt?.setOnClickListener { passa() }

    }

    //FUNCAO RESPONSAVEL POR PASSAR A TELA
    private fun passa() {
        Toast.makeText(this, "BEM VINDO", Toast.LENGTH_LONG).show()
      //  val intent = Intent(this, Centro::class.java)
        //startActivity(intent)

        val intent = Intent(this, Centro::class.java)
        startActivity(intent)

        //FUNCAO MATA TELA
        finish()
    }
}
