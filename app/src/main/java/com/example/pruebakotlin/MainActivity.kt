package com.example.pruebakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.pruebakotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnResult.setOnClickListener {
            val number1 = binding.etNumber1.text.toString().toFloat()
            val number2 = binding.etNumber2.text.toString().toFloat()
            val number3 = number1 / number2
            val number4 = (number1+number2)/2

            binding.txtResult.text = "El resultado es $number3" + " El promedio es $number4"

            if(number1 > number2){
                binding.txtResult.text = "El primer numero es el mayor"
            }else{
                binding.txtResult.text = "El segundo numero es el mayor"
            }

        }

    }
}