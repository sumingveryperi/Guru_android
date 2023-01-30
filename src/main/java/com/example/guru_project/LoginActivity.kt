package com.example.guru_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.guru_project.databinding.ActivityLoginBinding
import com.example.guru_project.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.view.*
import kotlinx.android.synthetic.main.activity_start.*

class LoginActivity : AppCompatActivity() {
    lateinit var db: DBHelper
    var users = ArrayList<User>()
    //binding 객체 생성
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = DBHelper(this)

        // 회원가입 버튼 및 실행 코드
        binding.JoinButton.setOnClickListener {
            createUser().let {
                if (it != null) {
                    db.addUser(it)
                }
            }
        }

        // 로그인 버튼 및 실행 코드
        binding.LoginButton.setOnClickListener {
            createUser().let {
                if (it != null) {
                    if (db.login(it)) {
                        Toast.makeText(this, "로그인 성공!", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, MainActivity::class.java)
                        intent.putExtra("name", binding.nameEditText.text.toString())
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "로그인 실패!", Toast.LENGTH_SHORT).show()
                    }
                }else{
                    Toast.makeText(this, "정보를 모두 입력해주세요", Toast.LENGTH_SHORT).show()
                }

            }
        }

    }

    // createUser 메소드로 이름, 아이디, 비밀번호를 입력하고 User 클래스로 반환
    fun createUser(): User?{
        val name = binding.nameEditText.text.toString()
        val id = binding.idEditText.text.toString()
        val pw = binding.pwEditText.text.toString()

        if(name == "" || id == "" || pw == "") // 입력 정보가 하나라도 비어있으면
            return null // Null 반환

        return User(name,id,pw)
    }

}