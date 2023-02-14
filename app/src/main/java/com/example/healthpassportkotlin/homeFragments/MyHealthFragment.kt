package com.example.healthpassportkotlin.homeFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.healthpassportkotlin.R
import com.example.healthpassportkotlin.databinding.FragmentMyHealthBinding

class MyHealthFragment : Fragment(R.layout.fragment_my_health) {
    private lateinit var binding: FragmentMyHealthBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMyHealthBinding.inflate(inflater, container, false)
        setClicks()
        return binding.root
    }

    private fun setClicks() {
        binding.myHealthConstraintlayout.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.action_myHealthFragment_to_final_profile)
        }
    }
}