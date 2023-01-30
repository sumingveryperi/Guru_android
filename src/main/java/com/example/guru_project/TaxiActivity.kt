package com.example.guru_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_report.*
import kotlinx.android.synthetic.main.activity_taxi.*

class TaxiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_taxi)

        webView.apply {
            webViewClient = WebViewClient()
            settings.javaScriptEnabled = true
        }

        // 실행할 웹 사이트의 url
        webView.loadUrl("https://www.sisul.or.kr/open_content/calltaxi/")
    }

    //뒤로가기 버튼을 눌렀을 때 이전 웹 페이지로 이동
    override fun onBackPressed() {
        if (webView.canGoBack())
        {
            webView.goBack()
        }
        else
        {
            finish()
        }
    }
}