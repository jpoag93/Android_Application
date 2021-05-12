package com.example.firstactivityset

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val topicList = mutableListOf("1", "2", "3", "4" )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        generateTopic()

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }

        val helpbtn = findViewById<Button>(R.id.helpbtn)
        helpbtn.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)

        }

        val pref = findViewById<Button>(R.id.pref)
        pref.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)

        }

    }

    private fun generateTopic() {

       topic.setOnClickListener{

           val random = (0 until(topicList.size)).random()

           topic.text = topicList[random]
       }


    }
}