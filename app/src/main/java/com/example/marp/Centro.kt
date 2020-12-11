package com.example.marp

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Centro : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_centro)

        val btareas = findViewById<Button>(R.id.btareas)
        val btfaturas = findViewById<Button>(R.id.btfaturas)

        btareas?.setOnClickListener{(passaArea())}
        btfaturas?.setOnClickListener{passafatura()}

    }

    private fun passaArea(){
        val intent = Intent(this, Areas::class.java)
        startActivity(intent)
    }

    private fun passafatura(){
        val intent = Intent(this, Fatura::class.java)
        startActivity(intent)
    }
}
