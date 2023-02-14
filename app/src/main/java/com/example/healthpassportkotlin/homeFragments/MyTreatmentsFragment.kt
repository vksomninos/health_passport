package com.example.healthpassportkotlin.homeFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.healthpassportkotlin.R
import com.example.healthpassportkotlin.databinding.FragmentMyHealthBinding
import com.example.healthpassportkotlin.databinding.FragmentMyLifestyleBinding
import com.example.healthpassportkotlin.databinding.FragmentMyTreatmentsBinding

class MyTreatmentsFragment: Fragment(R.layout.fragment_my_treatments) {
    private lateinit var binding: FragmentMyTreatmentsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMyTreatmentsBinding.inflate(inflater, container, false)
        return binding.root
    }
}