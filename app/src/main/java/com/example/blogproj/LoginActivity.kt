package com.example.blogproj

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var editTextID: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonLogin: Button
    private lateinit var textViewSignUp: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        editTextID = findViewById(R.id.editTextID)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonLogin = findViewById(R.id.buttonLogin)
        textViewSignUp = findViewById(R.id.textViewSignUp)

        buttonLogin.setOnClickListener {
            val id = editTextID.text.toString()
            val password = editTextPassword.text.toString()

            if (authenticateUser(id, password)) {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show()
            }
        }

        textViewSignUp.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }

    private fun authenticateUser(id: String, password: String): Boolean {
        val prefs: SharedPreferences = getSharedPreferences("UserPrefs", MODE_PRIVATE)
        val storedPassword = prefs.getString(id, null)
        return password == storedPassword
    }
}