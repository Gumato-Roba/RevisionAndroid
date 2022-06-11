package dev.gumato.myactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    lateinit var tillusername: TextInputLayout
    lateinit var etusername: TextInputEditText
    lateinit var tilpassword: TextInputLayout
    lateinit var etPassword: TextInputEditText
    lateinit var btnLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        castViews()
    }

    fun castViews() {
        tillusername = findViewById(R.id.tillusername)
        etusername = findViewById(R.id.etusername)
        tilpassword = findViewById(R.id.tilpassword)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnlogin)
    }

    fun validating() {
        var username = etusername.text.toString()
        if (username.isBlank()) {
            tillusername.error = "UserName is required"
        }
        var password = etPassword.text.toString()
        if (password.isBlank()) {
            tilpassword.error = "Password is required"

        }
    }
}