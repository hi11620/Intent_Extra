package com.example.intentextra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.lang.System.exit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("ชัชวิทย์ 022")

        val namelastEt = findViewById<EditText>(R.id.namelastEt)
        val ageEt = findViewById<EditText>(R.id.ageEt)
        val phoneEt = findViewById<EditText>(R.id.phoneEt)
        val emailEt = findViewById<EditText>(R.id.emailEt)
        val departmentEt = findViewById<EditText>(R.id.departmentEt)
        val nicknameEt = findViewById<EditText>(R.id.nicknameEt)

        val saveBtn = findViewById<Button>(R.id.saveBtn)
        val closeBtn = findViewById<Button>(R.id.closeBtn)

        saveBtn.setOnClickListener {
            val namelast = namelastEt.text.toString()
            val age = ageEt.text.toString()
            val phone = phoneEt.text.toString()
            val email = emailEt.text.toString()
            val department = departmentEt.text.toString()
            val nickname = nicknameEt.text.toString()


            val intent = Intent(this@MainActivity, TwoActivity::class.java)

            intent.putExtra("Namelast", namelast)
            intent.putExtra("Age", age)
            intent.putExtra("Phone", phone)
            intent.putExtra("Email", email)
            intent.putExtra("Department",department)
            intent.putExtra("Nickname",nickname)
            startActivity(intent)
            exit(0)
        }
        closeBtn.setOnClickListener {
            exit(-1)
        }
    }
}
