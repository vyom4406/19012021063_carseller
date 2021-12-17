package com.example.pr7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.pr7.logininfo.Companion.email
import com.example.pr7.logininfo.Companion.password
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login_button=findViewById<Button>(R.id.loginbtn)
        val signup_text=findViewById<TextView>(R.id.noaccountsignup)
        val email_login=findViewById<TextInputEditText>(R.id.loginemail)
        val password_login=findViewById<TextInputEditText>(R.id.loginpassword)
        signup_text.setOnClickListener{
            Intent(this,signup::class.java).apply {
                startActivity(this)
            }
        }
        login_button.setOnClickListener{

            val email_input=email_login.text.toString()
            val password_input=password_login.text.toString()

            if(email_input == email && password_input == password.toString() )
            {
                Intent(this,dashboard::class.java).apply {
                    startActivity(this)
                }
            }
            else{
                Toast.makeText(applicationContext,"Enter valid email or password",Toast.LENGTH_LONG).show()
            }}}}


