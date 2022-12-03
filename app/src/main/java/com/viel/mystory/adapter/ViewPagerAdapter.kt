package com.viel.mystory.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.ListFragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.viel.mystory.fragment.HomeFragment
import com.viel.mystory.fragment.LikeFragment
import com.viel.mystory.fragment.SaveFragment

class ViewPagerAdapter(activity:AppCompatActivity): FragmentStateAdapter(activity) {


    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> HomeFragment()
            1 -> LikeFragment()
            2 -> SaveFragment()
            else -> throw IllegalArgumentException("No fragment at $position")
        }
    }
}