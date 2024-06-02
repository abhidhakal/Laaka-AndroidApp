package com.example.trying

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.trying.databinding.ActivitySignUpPageBinding

class SignUpPage : AppCompatActivity() {

    lateinit var viewBindingSignup : ActivitySignUpPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        viewBindingSignup = ActivitySignUpPageBinding.inflate(layoutInflater)
        val view = viewBindingSignup.root
        setContentView(view)

        viewBindingSignup.registerBtn.setOnClickListener {
            val intent = Intent(this@SignUpPage, Dashboard::class.java)
            startActivity(intent)
        }
    }
}