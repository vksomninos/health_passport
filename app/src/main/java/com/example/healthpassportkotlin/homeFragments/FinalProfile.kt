package com.example.healthpassportkotlin.homeFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.healthpassportkotlin.R
import com.example.healthpassportkotlin.databinding.FragmentFinalProfileBinding

class FinalProfile : Fragment(R.layout.fragment_final_profile) {
    private lateinit var binding: FragmentFinalProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFinalProfileBinding.inflate(inflater, container, false)
        return binding.root
    }
}