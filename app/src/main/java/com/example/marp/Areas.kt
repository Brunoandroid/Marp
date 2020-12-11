package com.example.marp

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Areas : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_areas)

        // Declara a WebView
        val webarea = findViewById<WebView>(R.id.webarea)
        webarea.settings.javaScriptEnabled = true

        webarea.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
            }
        }

        // Inicializa a WebView
        webarea!!.loadUrl("http://177.39.56.36/new")
    }
}
