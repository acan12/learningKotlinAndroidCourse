package com.mimo.pigeon.learningkotlinandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.mimo.pigeon.learningkotlinandroid.adapter.AlphabetAdapter
import com.mimo.pigeon.learningkotlinandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val dataSet = arrayListOf("Amir", "Budi",  "Charles", "Danang")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUI()
    }

    private fun initUI() = binding.apply {
        val adapter = AlphabetAdapter(dataSet)
        listOfData.layoutManager = LinearLayoutManager(this@MainActivity)
        listOfData.adapter = adapter

        btnTambah.setOnClickListener {
            adapter.addDataSet("Baru Ditambah")
        }

        btnUpdate.setOnClickListener {
            adapter.updateDataSet("Update")
        }
    }


}