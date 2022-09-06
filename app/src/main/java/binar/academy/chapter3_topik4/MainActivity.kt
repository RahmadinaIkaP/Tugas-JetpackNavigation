package binar.academy.chapter3_topik4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import binar.academy.chapter3_topik4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}