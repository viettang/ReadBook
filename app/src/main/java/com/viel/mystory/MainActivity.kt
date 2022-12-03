package com.viel.mystory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.navigation.NavigationBarView
import com.viel.mystory.Dialog.LoadingDialog
import com.viel.mystory.adapter.ViewPagerAdapter
import com.viel.mystory.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        LoadingDialog.loadDialog(this)

        binding.vpMain.adapter = ViewPagerAdapter(this)
        binding.vpMain.isUserInputEnabled = false

        binding.bnMain.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_home -> binding.vpMain.setCurrentItem(0, true)
                R.id.bottom_like -> binding.vpMain.setCurrentItem(1, true)
                R.id.bottom_save -> binding.vpMain.setCurrentItem(2, true)
            }
            true
        }


        binding.vpMain.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                when(position){
                    0 -> binding.bnMain.menu.findItem(R.id.bottom_home).isChecked = true
                    1 -> binding.bnMain.menu.findItem(R.id.bottom_like).isChecked = true
                    2 -> binding.bnMain.menu.findItem(R.id.bottom_save).isChecked = true
                }
            }
        })

    }
}