package com.example.healthpassportkotlin.homeFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.healthpassportkotlin.R

class ForgotByphone : Fragment() {
    var email: TextView? = null
    var btnnext: AppCompatButton? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_forgot_byphone, container, false)
        btnnext = view.findViewById<AppCompatButton>(R.id.questionIndustry_ContinueBtn)
        btnnext?.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_forgotByphone_to_verificationCode)
        }
        return view
    }
}