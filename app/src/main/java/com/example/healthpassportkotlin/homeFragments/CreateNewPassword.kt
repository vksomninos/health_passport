package com.example.healthpassportkotlin.homeFragments

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import com.example.healthpassportkotlin.R

class CreateNewPassword : Fragment() {
    var createpassword: AppCompatButton? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_new_password, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        createpassword = view.findViewById<AppCompatButton>(R.id.createpass)
        createpassword?.setOnClickListener(View.OnClickListener {
            val dialog = Dialog(requireContext())
            dialog.setContentView(R.layout.fragment_congrts_screen)
            dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog.setCanceledOnTouchOutside(true)
            val window = dialog.window
            window!!.setGravity(Gravity.CENTER)
            dialog.show()
            dialog.findViewById<View>(R.id.done_CongrtsScreen).setOnClickListener {
//                requireActivity().supportFragmentManager.beginTransaction()
//                    .replace(R.id.fragment_container, LoginSignUpFragment()).addToBackStack(null).commit()
                dialog.dismiss()
            }
        })
    }
}