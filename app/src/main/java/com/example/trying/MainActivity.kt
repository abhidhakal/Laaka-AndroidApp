package com.example.trying

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var username: EditText
    lateinit var password: EditText
    lateinit var login_button: Button
    lateinit var signup_button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        username= findViewById(R.id.usernamebar)
        password= findViewById(R.id.passwordbar)
        login_button= findViewById(R.id.login_btn)
        signup_button= findViewById(R.id.signup_btn)

        login_button.setOnClickListener {
            val username = username.text.toString()
            val password = password.text.toString()
            Log.i("Test Credentials","username: $username and Password : $password")

            val intent = Intent(this@MainActivity, Dashboard::class.java)
            startActivity(intent)
        }

        signup_button.setOnClickListener{
            val intent = Intent(this@MainActivity, SignUpPage::class.java)
            startActivity(intent)
        }
    }
}