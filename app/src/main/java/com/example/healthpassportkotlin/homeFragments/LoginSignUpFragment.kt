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
import com.example.healthpassportkotlin.databinding.FragmentLoginSignUpBinding

class LoginSignUpFragment : Fragment() {
    private lateinit var binding: FragmentLoginSignUpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLoginSignUpBinding.inflate(inflater, container, false)
        setClicks()
        return binding.root
    }

    private fun setClicks() {
        binding.btnLogin.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_loginSignUpFragment_to_loginfragment)
        }

        binding.btnSignup.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_loginSignUpFragment_to_signUpFragment)
        }
    }
}