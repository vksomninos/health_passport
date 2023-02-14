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
import com.example.healthpassportkotlin.databinding.FragmentCongrtsScreenBinding
import com.example.healthpassportkotlin.databinding.FragmentLoginBinding
import com.example.healthpassportkotlin.databinding.FragmentLoginfragmentBinding

class WelcomeFragment: Fragment(R.layout.fragment_congrts_screen) {
    private lateinit var binding: FragmentCongrtsScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCongrtsScreenBinding.inflate(inflater, container, false)
        setClicks()
        return binding.root
    }

    private fun setClicks() {
        binding.doneCongrtsScreen.setOnClickListener {
            startActivity(Intent(activity, HomeActivity::class.java))
        }
    }

}