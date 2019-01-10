package com.ldj.parallelespressotesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener { text.text = "You clicked button 1" }
        button2.setOnClickListener { text.text = "You clicked button 2" }
        button3.setOnClickListener { text.text = "You clicked button 3" }
    }
}
