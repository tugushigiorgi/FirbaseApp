package com.example.firebaseAppBTU2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var signUpEmailEditText : EditText
    private lateinit var signUpPasswordEditText : EditText
    private lateinit var signUpButton : Button
    private lateinit var alreadyRegisteredButton : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init(){
        signUpEmailEditText = findViewById(R.id.signUpEmailEditText)
        signUpPasswordEditText = findViewById(R.id.signUpPasswordEditText)
        signUpButton = findViewById(R.id.signUpButton)
        alreadyRegisteredButton = findViewById(R.id.alreadyRegisteredButton)
    }

}