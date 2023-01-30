package com.example.guru_project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Intent 를 활용해서 액티비티 이동하기
        // communityBtn 의 이미지 버튼 클릭 후 CommunityActivity 로 화면 이동
        val community = Intent(this, CommunityActivity::class.java)
        val communityBtn = findViewById<ImageButton>(R.id.communityBtn)
        communityBtn.setOnClickListener { startActivity(community) }

        // parkBtn 의 이미지 버튼 클릭 후 ParkingLotActivity 로 화면 이동
        val parkingLot = Intent(this, ParkingLotActivity::class.java)
        val parkBtn = findViewById<ImageButton>(R.id.parkBtn)
        parkBtn.setOnClickListener { startActivity(parkingLot) }

        // reportBtn 의 이미지 버튼 클릭 후 LinkApiActivity 로 화면 이동
        val report = Intent(this, ReportActivity::class.java)
        val reportBtn = findViewById<ImageButton>(R.id.reportBtn)
        reportBtn.setOnClickListener { startActivity(report) }

        // taxiBtn 의 이미지 버튼 클릭 후 TaxiActivity 로 화면 이동
        val taxi = Intent(this, TaxiActivity::class.java)
        val taxiBtn = findViewById<ImageButton>(R.id.taxiBtn)
        taxiBtn.setOnClickListener { startActivity(taxi) }

        // LogoutBtn 버튼 클릭 후 StartActivity 로 화면 이동
        val logOut = Intent(this, StartActivity::class.java)
        val logOutBtn = findViewById<ImageButton>(R.id.LogoutBtn)
        logOutBtn.setOnClickListener { startActivity(logOut) }
    }
}