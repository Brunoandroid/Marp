package com.example.marp

import android.content.Intent
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import java.util.*
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //DEIXAR EM FULL
        val decorView = window.decorView
        decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)

        Timer().schedule(3000) {
            val i = Intent(this@MainActivity, Centro::class.java)
            startActivity(i)
            //MATA TELA
            finish()
        }
     }
}
