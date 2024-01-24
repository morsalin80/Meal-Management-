package com.example.mealmanagement.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mealmanagement.databinding.ActivityLoginPageBinding
import com.example.mealmanagement.databinding.ActivityLoginPageBinding.inflate

class LoginPage : AppCompatActivity() {
    private lateinit var binding:ActivityLoginPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener {
            Toast.makeText(this, "Login button clicked", Toast.LENGTH_LONG).show()
        }
    }
}