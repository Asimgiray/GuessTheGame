package com.example.guessthegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.guessthegame.databinding.ActivityMainBinding
import com.example.guessthegame.utils.dataBinding
import com.example.guessthegame.utils.isEmpty

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by dataBinding(R.layout.activity_main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()


    }

    private fun init() {

        binding.txtOld.setOnClickListener {

            val intent = Intent(this, OldSolutionActivity::class.java)
            startActivity(intent)

        }

        binding.txtMvvm.setOnClickListener {

            val intent = Intent(this, MvvmSolutionActivity::class.java)
            startActivity(intent)

        }


    }
}