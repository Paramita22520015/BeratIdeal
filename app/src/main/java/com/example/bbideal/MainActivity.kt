package com.example.bbideal

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNama = findViewById<EditText>(R.id.et_nama)
        val etTb = findViewById<EditText>(R.id.et_tb)
        val btnHitung = findViewById<Button>(R.id.btn_hitung)
        val tvHasil = findViewById<TextView>(R.id.tv_hasil)
        val tvKet = findViewById<TextView>(R.id.tv_ket)

        btnHitung.setOnClickListener{
            val tb = etTb.text.toString()

            val bmi = tb.toFloat()-110
            //rumusnya nanti disini

            val bmi2Digit = String.format("%.2f", bmi).toFloat()
            displayResult(bmi2Digit)
        }
    }

    private fun displayResult(bmi:Float){
        val resultIndex = findViewById<TextView>(R.id.tv_hasil)

        resultIndex.text = bmi.toString()
    }
}