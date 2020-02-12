package com.example.intentextra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_two.*
import java.lang.System.*
import android.content.Intent
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class TwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)
        setTitle("ผลลัพธ์")

        var intent = intent
        val namelast = intent.getStringExtra("Namelast")
        val age = intent.getStringExtra("Age")
        val phone = intent.getStringExtra("Phone")
        val email = intent.getStringExtra("Email")
        val department = intent.getStringExtra("Department")
        val nickname = intent.getStringExtra("Nickname")

        val namelastTv = findViewById<TextView>(R.id.namelastTv)
        val ageTv = findViewById<TextView>(R.id.ageTv)
        val phoneTv = findViewById<TextView>(R.id.phoneTv)
        val emailTv = findViewById<TextView>(R.id.emailTv)
        val departmentTv = findViewById<TextView>(R.id.departmentTv)
        val nicknameTv = findViewById<TextView>(R.id.nicknameTv)

        namelastTv.text = namelast
        ageTv.text = age
        phoneTv.text = phone
        emailTv.text = email
        departmentTv.text = department
        nicknameTv.text = nickname

        backBtn.setOnClickListener {
            val intent = Intent(this@TwoActivity, MainActivity::class.java)
            startActivity(intent)
            exit(0)
        }
        closeBtn.setOnClickListener {
            exit(-1)
        }


    }
}
