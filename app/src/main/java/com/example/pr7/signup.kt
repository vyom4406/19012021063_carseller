package com.example.pr7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val login=findViewById<Button>(R.id.signup)
        val sign=findViewById<TextView>(R.id.noaccountsignup)
        val fullname_signup=findViewById<TextInputEditText>(R.id.sign_name)
        val phone_signup=findViewById<TextInputEditText>(R.id.sign_phone)
        val email_signup=findViewById<TextInputEditText>(R.id.sign_email)
        val city_signup=findViewById<TextInputEditText>(R.id.sign_city)
        val password_signup=findViewById<TextInputEditText>(R.id.sign_pass)
        val confirm_pass_signup=findViewById<TextInputEditText>(R.id.sign_confirmpass)

        login.setOnClickListener({

            logininfo.fullname =fullname_signup.text.toString()
            logininfo.phone =phone_signup.text.toString()
            logininfo.email =email_signup.text.toString()
            logininfo.city =city_signup.text.toString()
            logininfo.password =password_signup.text.toString()
            logininfo.confirm_pass =confirm_pass_signup.text.toString()

            if(logininfo.password == logininfo.confirm_pass)
            {
                Intent(this,MainActivity::class.java).apply {
                    startActivity(this)
                }
            }
            else{

                Toast.makeText(applicationContext,"Password and Confirm Password does not match",
                    Toast.LENGTH_LONG).show()
            }

        })

    }
}

