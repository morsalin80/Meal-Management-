package com.example.mealmanagement

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mealmanagement.databinding.ActivityMainBinding
import com.example.mealmanagement.ui.RegistrationPage

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener {
            Toast.makeText(this, "Login Button pressed", Toast.LENGTH_LONG).show()
        }

        binding.RegisterBtn.setOnClickListener {
            val intent = Intent(this, RegistrationPage::class.java)
            startActivity(intent)
            /*Toast.makeText(this, "Register Button pressed", Toast.LENGTH_LONG).show()*/
        }
    }
}