package com.example.healthpassportkotlin.homeFragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.healthpassportkotlin.R
import com.example.healthpassportkotlin.activities.HomeActivity
import com.example.healthpassportkotlin.databinding.FragmentVerificationCodeBinding

class VerificationCode : Fragment(R.layout.fragment_verification_code) {
    private lateinit var binding: FragmentVerificationCodeBinding
    var verify: AppCompatButton? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentVerificationCodeBinding.inflate(inflater, container, false)
        setClicks()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun setClicks() {
        binding.verify.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_verificationCode_to_createNewPassword)
        }
    }
}