package com.example.guessthegame.viewModel

import android.util.Log
import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random.Default.nextInt

class SolutionViewModel : ViewModel() {

    private var _currentScore = MutableLiveData<String>()
    val currentScore: LiveData<String> get() = _currentScore


    private var _result = MutableLiveData<String>()
    val result: LiveData<String> get() = _result

    var myScore = 0

    var randomNumber = 0
    var guessResult = ""

    var currentText = ObservableField<String>()

    init {
        createRandomNumber()
    }


    fun increaseScore() {
        ++myScore
        _currentScore.value = "Deneme: $myScore"
    }

    fun checkGuess(userGuess: Int) {

        _result.value = if (userGuess == randomNumber) {
            createRandomNumber()
            "Bildin"
        } else if (userGuess > randomNumber) {
            "Aşağı"
        } else {
            "Yukarı"
        }

    }

    fun guessClick() {
        Log.d("GuessClick", guessResult)
        increaseScore()
        checkGuess(guessResult.toInt())
        currentText.set("")
    }

    fun guessChanged(s: CharSequence) {
        Log.d("EditTextResult", s.toString())
        guessResult = s.toString()
    }


    private fun createRandomNumber() {
        randomNumber = nextInt(0,20)
        Log.d("NewNumber", "$randomNumber")

    }


}