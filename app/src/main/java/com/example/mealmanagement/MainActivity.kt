package com.example.mealmanagement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnLogin: Button
    lateinit var btnRegister: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin = findViewById(R.id.loginBtn)
        btnRegister = findViewById(R.id.RegisterBtn)

        btnLogin.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Login Button pressed", Toast.LENGTH_LONG).show()
        })

        btnRegister.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Register Button pressed", Toast.LENGTH_LONG).show()
        })
    }
}