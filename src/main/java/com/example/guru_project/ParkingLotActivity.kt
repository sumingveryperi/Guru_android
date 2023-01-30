package com.example.guru_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.guru_project.databinding.ActivityParkingLotBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class ParkingLotActivity : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var mMap: GoogleMap
    //binding 객체 생성
    private lateinit var binding: ActivityParkingLotBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityParkingLotBinding.inflate(layoutInflater)
        //레이아웃(root)뷰 표시
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * 사용 가능한 경우 지도를 조작합니다.
     * 이 콜백은 맵을 사용할 준비가 되면 트리거됩니다.
     * 여기에서 마커 또는 라인을 추가하거나 청취자를 추가하거나 카메라를 이동할 수 있습니다. 이 경우,
     * 기기에 Google Play 서비스가 설치되어 있지 않으면 사용자에게 설치하라는 메시지가 표시됩니다.
     * SupportMapFragment 내부에 있습니다. 이 메서드는 사용자가
     * Google Play 서비스를 설치하고 앱으로 돌아왔습니다.
     */

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // 경도 위도 좌표 넣기
        val sin = LatLng(37.535309707284476,126.95515580481047 )
        mMap.addMarker(MarkerOptions().position(sin).title("신창동 공영주차장").snippet("잔여 자리 : 6대"))

        val han = LatLng( 37.52998631587209, 127.00739619268705)
        mMap.addMarker(MarkerOptions().position(han).title("한남유수지 공영주차장").snippet("잔여 자리 : 5대"))

        val hannam = LatLng(37.53505242643492, 127.00006222839228)
        mMap.addMarker(MarkerOptions().position(hannam).title("한남동 공영주차장").snippet("잔여 자리 : 8대"))

        val  Itaewon = LatLng( 37.540314043395234,126.99270745147157)
        mMap.addMarker(MarkerOptions().position(Itaewon).title("이태원2동 공영주차장").snippet("잔여 자리 : 3대"))

        val Yongsan = LatLng( 37.54303468210981,126.98803955953068)
        mMap.addMarker(MarkerOptions().position(Yongsan).title("용산2가동 기계식공영주차장").snippet("잔여 자리 : 20대"))

        val star = LatLng(37.54316087169531,126.98854024928741)
        mMap.addMarker(MarkerOptions().position(star).title("서계동 공영주차장").snippet("잔여 자리 : 15대"))

        val museum = LatLng( 37.546097811984524,126.98563726566391)
        mMap.addMarker(MarkerOptions().position(museum).title("그린존 용산2가 주민센터 공용주차장").snippet("잔여 자리 : 1대"))

        val mun = LatLng( 37.53896416684111, 126.95760045118983 )
        mMap.addMarker(MarkerOptions().position(mun).title("용문동 주민센터 공용주차장").snippet("잔여 자리 : 1대"))

        val Cheongpa = LatLng(37.542729276646675,126.968594071201 )
        mMap.addMarker(MarkerOptions().position(Cheongpa).title("청파동1마을공원 공영주차장").snippet("잔여 자리 : 3대"))

        val park = LatLng( 37.545410063800134, 126.96979808121687 )
        mMap.addMarker(MarkerOptions().position(park).title("청파동 주민센터 공영주차장").snippet("잔여 자리 : 2대"))

        val Huam = LatLng(  37.53896416684111, 126.95760045118983 )
        mMap.addMarker(
            MarkerOptions().position(Huam).title("\n" +
                "후암동공영주차장").snippet("잔여 자리 : 1대"))


        //CameraUpdateFactory를 이용하여 지도가 특정 픽셀 수만큼 이동하도록 카메라의 위도와 경도 변경
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sin))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sin, 14F));


    }
}