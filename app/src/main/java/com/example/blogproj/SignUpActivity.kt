package com.example.blogproj

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {

    private lateinit var editTextNewID: EditText
    private lateinit var editTextNewPassword: EditText
    private lateinit var buttonSignUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        editTextNewID = findViewById(R.id.editTextNewID)
        editTextNewPassword = findViewById(R.id.editTextNewPassword)
        buttonSignUp = findViewById(R.id.buttonSignUp)

        buttonSignUp.setOnClickListener {
            val newID = editTextNewID.text.toString()
            val newPassword = editTextNewPassword.text.toString()

            val prefs: SharedPreferences = getSharedPreferences("UserPrefs", MODE_PRIVATE)
            with(prefs.edit()) {
                putString(newID, newPassword)
                apply()
            }

            Toast.makeText(this, "Account created!", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}