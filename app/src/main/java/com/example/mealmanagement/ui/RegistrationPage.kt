package com.example.mealmanagement.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mealmanagement.databinding.ActivityRegistrationPageBinding

class RegistrationPage : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registrationBtn.setOnClickListener {
            Toast.makeText(this, "Registration button clicked", Toast.LENGTH_LONG).show()
        }
    }
}