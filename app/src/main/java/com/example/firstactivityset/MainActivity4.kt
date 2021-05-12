package com.example.firstactivityset

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main4.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        button_blue.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                background.setBackgroundColor(Color.BLUE)
            }
        })

        button_yellow.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                background.setBackgroundColor(Color.YELLOW)
            }
        })

        button_green.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                background.setBackgroundColor(Color.GREEN)
            }
        })

        button_red.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                background.setBackgroundColor(Color.RED)
            }
        })
    }
}