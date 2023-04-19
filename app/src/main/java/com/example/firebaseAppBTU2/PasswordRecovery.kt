package com.example.firebaseAppBTU2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class PasswordRecovery : AppCompatActivity() {
    lateinit var EmailInput: EditText;
    lateinit var SendButton:Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_recovery)
        init()





        SendButton.setOnClickListener {

            if (EmailInput.text.isEmpty() ) {
                Toast.makeText(
                    applicationContext,
                    " ველი ცარიელია  ! ",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }
            if( EmailInput.text.contains("@")  &&  EmailInput.text.contains(".") ){

                FirebaseAuth.getInstance().sendPasswordResetEmail(EmailInput.text.toString()).addOnCompleteListener { it ->
                    if(it.isSuccessful){

                        Toast.makeText(this,"გთხოვთ გადაამოწმოთ ელ-ფოსტა და მიჰყვეთ ინსტრუქციებს",Toast.LENGTH_LONG).show()

                    }
                    else{
                        Toast.makeText(this," დაფიქსირდა შეცდომა ",Toast.LENGTH_LONG).show() }

                }

            }else{
                Toast.makeText(this,"  გთხოვთ  შეყვანოთ ვალიდური ელფოსტა ",Toast.LENGTH_LONG).show()


            }






                 }


        }


    fun init(){

        EmailInput=findViewById(R.id.emailverificationInput)
        SendButton=findViewById(R.id.sendemailbtn)



    }












}