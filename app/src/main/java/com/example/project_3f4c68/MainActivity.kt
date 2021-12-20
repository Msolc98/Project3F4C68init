package com.example.project_3f4c68

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_button.setOnClickListener({
            var intent = Intent(this,StoreSelctActivity::class.java)
            startActivity(intent)
            })

        signup_button.setOnClickListener({
            var intent = Intent(this,SignupActivity::class.java)
            startActivity(intent)
        })
    }
}