package com.example.healthpassportkotlin.homeFragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.healthpassportkotlin.R
import com.example.healthpassportkotlin.activities.HomeActivity
import com.example.healthpassportkotlin.databinding.FragmentLoginBinding
import com.example.healthpassportkotlin.databinding.FragmentLoginfragmentBinding

class Loginfragment : Fragment(R.layout.fragment_loginfragment) {
    private lateinit var binding: FragmentLoginfragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLoginfragmentBinding.inflate(inflater, container, false)
        setClicks()
        return binding.root
    }

    private fun setClicks() {
        binding.verify.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_loginfragment_to_welcomeFragment)
        }
        binding.forgotPassword.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_loginfragment_to_forgotByphone)
        }
    }

}