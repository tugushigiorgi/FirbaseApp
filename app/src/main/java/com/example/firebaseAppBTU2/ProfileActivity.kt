package com.example.firebaseAppBTU2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth

class ProfileActivity : AppCompatActivity() {
    lateinit var signoutBTN:Button
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        signoutBTN.setOnClickListener {


             val firebaseAuth = FirebaseAuth.getInstance().signOut()
                startActivity(Intent(this,LoginActivity::class.java))
            finish()



        }

    }
}