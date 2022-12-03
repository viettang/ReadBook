package com.viel.mystory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.viel.mystory.databinding.ActivityContentBinding

class ContentActivity : AppCompatActivity() {

    private lateinit var binding:ActivityContentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.showContent.fromAsset("python.pdf").load()
    }
}