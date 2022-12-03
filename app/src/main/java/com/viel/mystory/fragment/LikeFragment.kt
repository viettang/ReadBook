package com.viel.mystory.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.viel.mystory.databinding.FragmentLikeBinding

class LikeFragment:Fragment() {

    private lateinit var binding:FragmentLikeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLikeBinding.inflate(inflater,container,false)
        return binding.root

    }
}