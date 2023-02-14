package com.example.healthpassportkotlin.homeFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.healthpassportkotlin.R
import com.example.healthpassportkotlin.databinding.FragmentMyHealthBinding
import com.example.healthpassportkotlin.databinding.FragmentMyLifestyleBinding
import com.example.healthpassportkotlin.databinding.FragmentMyNetworkBinding
import com.example.healthpassportkotlin.databinding.FragmentMyTreatmentsBinding

class MyNetworkFragment: Fragment(R.layout.fragment_my_network) {
    private lateinit var binding: FragmentMyNetworkBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMyNetworkBinding.inflate(inflater, container, false)
        return binding.root
    }
}
