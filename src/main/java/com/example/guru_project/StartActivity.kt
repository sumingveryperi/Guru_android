package com.example.guru_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        //Intent 를 활용해서 액티비티 이동하기
        val intent = Intent(this, LoginActivity::class.java)
        //버튼 지정
        val startButton = findViewById<ImageButton>(R.id.startButton)
        //클릭리스너
        startButton.setOnClickListener {
            //액티비티 이동
            startActivity(intent)
        }

    }

}