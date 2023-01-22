package com.example.guessthegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.guessthegame.databinding.ActivityMvvmSolutionBinding
import com.example.guessthegame.utils.dataBinding
import com.example.guessthegame.viewModel.SolutionViewModel

class MvvmSolutionActivity : AppCompatActivity() {

    private val viewModel by viewModels<SolutionViewModel>()
    private val binding: ActivityMvvmSolutionBinding by dataBinding(R.layout.activity_mvvm_solution)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvm_solution)

        binding.viewModel = viewModel
        binding.lifecycleOwner = this

    }



}