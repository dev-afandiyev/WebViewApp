package com.example.webviewapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.webviewapp.databinding.FragmentChoiceBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import androidx.fragment.app.FragmentTransaction
import com.example.webviewapp.R
import kotlin.system.exitProcess

class ChoiceFragment : BottomSheetDialogFragment() {

    private var facebookFragment = FacebookFragment()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentChoiceBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_choice, container, false
        )

        binding.btContinue.setOnClickListener {
                val tr: FragmentTransaction = activity?.supportFragmentManager!!.beginTransaction()
                tr.replace(R.id.fragmentContainerView, facebookFragment)
                tr.commit()
                dismiss()
        }

        binding.btExit.setOnClickListener {
            exitProcess(0);
        }

        return binding.root
    }

}