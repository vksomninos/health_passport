package com.example.healthpassportkotlin.loginFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.healthpassportkotlin.R
import com.example.healthpassportkotlin.databinding.FragmentFragmentBinding

class StartFragment : Fragment() {
    private lateinit var binding: FragmentFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFragmentBinding.inflate(inflater, container, false)
        onClicks()
        return binding.root
    }

    private fun onClicks() {
        binding.btnRegister.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_startAppFragment_to_loginSignUpFragment)
        }
    }
}