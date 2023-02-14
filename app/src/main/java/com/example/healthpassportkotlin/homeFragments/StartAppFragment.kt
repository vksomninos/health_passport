package com.example.healthpassportkotlin.homeFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.healthpassportkotlin.R
import com.example.healthpassportkotlin.databinding.FragmentStartAppBinding

class StartAppFragment : Fragment(R.layout.fragment_start_app) {
    private lateinit var binding: FragmentStartAppBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentStartAppBinding.inflate(inflater, container, false)
        setClicks()
        return binding.root
    }

    private fun setClicks() {
        binding.btnRegister.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_startAppFragment_to_loginSignUpFragment)
        }
    }

}