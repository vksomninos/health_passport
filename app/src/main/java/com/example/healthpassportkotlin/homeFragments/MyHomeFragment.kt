package com.example.healthpassportkotlin.homeFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.healthpassportkotlin.R
import com.example.healthpassportkotlin.databinding.FragmentMyHealthBinding
import com.example.healthpassportkotlin.databinding.FragmentMyHomeBinding

class MyHomeFragment: Fragment(R.layout.fragment_my_home) {
    private lateinit var binding: FragmentMyHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMyHomeBinding.inflate(inflater, container, false)
        return binding.root
    }
}