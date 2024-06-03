package com.example.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonShowContent = findViewById<Button>(R.id.button_show_content)
        val textViewContent = findViewById<TextView>(R.id.text_view_content)

        buttonShowContent.setOnClickListener {

            if (textViewContent.visibility == View.VISIBLE) {
                textViewContent.visibility = View.GONE
            } else {
                textViewContent.visibility = View.VISIBLE
                textViewContent.text = "Hi Everyone!."
            }
        }
    }
}
