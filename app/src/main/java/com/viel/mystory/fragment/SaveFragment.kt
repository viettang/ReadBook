package com.viel.mystory.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.viel.mystory.databinding.FragmentSaveBinding

class SaveFragment:Fragment() {

    private lateinit var binding:FragmentSaveBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSaveBinding.inflate(inflater,container,false)
        return binding.root
    }
}