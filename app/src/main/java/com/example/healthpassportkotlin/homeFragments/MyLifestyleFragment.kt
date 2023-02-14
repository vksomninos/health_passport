package com.example.healthpassportkotlin.homeFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.healthpassportkotlin.R
import com.example.healthpassportkotlin.databinding.FragmentMyHealthBinding
import com.example.healthpassportkotlin.databinding.FragmentMyLifestyleBinding

class MyLifestyleFragment: Fragment(R.layout.fragment_my_lifestyle) {
    private lateinit var binding: FragmentMyLifestyleBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMyLifestyleBinding.inflate(inflater, container, false)
        return binding.root
    }
}