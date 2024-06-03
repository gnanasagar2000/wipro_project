package com.example.smartlight

import android.os.Bundle
import android.widget.SeekBar
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var lightSwitch: Switch
    private lateinit var thermostatSeekBar: SeekBar
    private lateinit var temperatureTextView: TextView
    private lateinit var RelativeLayout;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        lightSwitch = findViewById(R.id.lightSwitch)

        thermostatSeekBar = findViewById(R.id.thermostatSeekBar)
        temperatureTextView = findViewById(R.id.temperatureTextView)


        lightSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {

            } else {
            }
        }

        thermostatSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {

                temperatureTextView.text = "$progress°C"

            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })
    }
}


