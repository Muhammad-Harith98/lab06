package com.harith.lab06

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.harith.lab06.databinding.ActivityMainBinding
import com.lab_06.myapplication.R
import com.lab_06.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(view)
    }

        binding.course.setOnClickListener {
            binding.infoTextView.text="Android ATC 801 consist of topics ranging from"+"UI Creation, App Development and Firebase"

            binding.exams.setOnClickListener {
                binding.InfoTextView.text="Exam consists of 45 question in 90 minutes with passing mark"

                binding.freelance.setOnClickListener {
                    binding.InfoTextView.text=   "you can be an android Engineer upon completion on the course"
                }
            }