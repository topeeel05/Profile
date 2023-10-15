package com.example.myapplication

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val policy = findViewById<Button>(R.id.policy)

        policy.setOnClickListener {
            val dialogBinding = layoutInflater.inflate(R.layout.policy_dialog, null)

            val myPolicy = Dialog(this)
            myPolicy.setContentView(dialogBinding)

            myPolicy.setCancelable(true)
            myPolicy.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myPolicy.show()

            val okbtn = dialogBinding.findViewById<Button>(R.id.privacy_yes)
            okbtn.setOnClickListener {
                myPolicy.dismiss()
            }
        }


        val feedback = findViewById<Button>(R.id.feedback)

        feedback.setOnClickListener {
            val dialogBindingsf = layoutInflater.inflate(R.layout.feedback_dialog, null)

            val myFeedback = Dialog(this)
            myFeedback.setContentView(dialogBindingsf)

            myFeedback.setCancelable(true)
            myFeedback.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myFeedback.show()

            val okbtnsf = dialogBindingsf.findViewById<Button>(R.id.feedback_yes)
            okbtnsf.setOnClickListener {
                myFeedback.dismiss()
            }


        }


    }
}