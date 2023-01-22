package com.example.guessthegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class OldSolutionActivity : AppCompatActivity() {

    lateinit var txtTry: TextView
    lateinit var txtResult: TextView
    lateinit var edtGuess: EditText
    lateinit var btnGuess: Button
    var myNumber: Int = 5
    var numberOfTry = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_old_solution)

        init()

    }


    fun init() {

        txtTry = findViewById(R.id.txtTry)
        txtResult = findViewById(R.id.txtResult)
        edtGuess = findViewById(R.id.edtGuess)
        btnGuess = findViewById(R.id.btnGuess)

        btnGuess.setOnClickListener {

            increaseScore()
            val result = edtGuess.text.toString()

            if (result.isNotEmpty()) {
                checkGuess(result.toInt())
            }

        }

    }

    fun checkGuess(userGuess: Int) {

        if (userGuess == myNumber) {
            txtResult.text = "Bildin"
        } else if (userGuess > myNumber) {
            txtResult.text = "Aşağı"
        } else {
            txtResult.text = "Yukarı"
        }

    }

    fun increaseScore() {
        ++numberOfTry
        txtTry.text = "Deneme: $numberOfTry"
    }


}