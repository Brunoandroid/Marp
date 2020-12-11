package com.example.marp

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient



class Fatura : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fatura)

        // Declara WebView
        val webfatura = findViewById<WebView>(R.id.webfatura)
        webfatura.settings.javaScriptEnabled = true

        webfatura.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
            }
        }

        // Inicializa a URL
        webfatura!!.loadUrl("http://express.marpnet.com.br/login/logon/?login=app&password=marp2020")


    }
}
