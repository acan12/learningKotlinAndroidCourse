package com.mimo.pigeon.learningkotlinandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.mimo.pigeon.learningkotlinandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUI()
    }


    private fun initUI() = binding.apply {
        val ft: FragmentTransaction = supportFragmentManager.beginTransaction()
        val fragment = OneFragment()
        ft.add(R.id.container, fragment)
        ft.commit()
    }


}