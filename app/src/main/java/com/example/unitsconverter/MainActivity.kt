package com.example.unitsconverter

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val conversionManager = UnitConversionManager.getInstance()

        val inputEditText = findViewById<EditText>(R.id.inputText)
        val outputText = findViewById<TextView>(R.id.outputText)

        val button_FC = findViewById<Button>(R.id.FCConversionButton)
        val button_CF = findViewById<Button>(R.id.CFConversionButton)

        button_FC.setOnClickListener {
            val input = inputEditText.text.toString()

            if (input.isNotEmpty()) {
                val inputValue = input.toDoubleOrNull()

                if (inputValue != null) {
                    val outputValue = conversionManager.convertFahrenheitToCelsius(inputValue).toString()

                    outputText.text =  "$outputValue C"
                }
            }
        }

        button_CF.setOnClickListener {
            val input = inputEditText.text.toString()

            if (input.isNotEmpty()) {
                val inputValue = input.toDoubleOrNull()

                if (inputValue != null) {
                    val outputValue = conversionManager.convertCelsiusToFahrenheit(inputValue).toString()

                    outputText.text =  "$outputValue F"
                }
            }
        }
    }
}