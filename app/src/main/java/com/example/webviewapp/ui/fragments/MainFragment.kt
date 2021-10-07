package com.example.webviewapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentTransaction
import com.example.webviewapp.R
import com.example.webviewapp.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var choiceFragment: ChoiceFragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentMainBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_main, container, false
        )

        binding.btSelectionScreen.setOnClickListener {
            choiceFragment = ChoiceFragment()
            choiceFragment?.show(requireFragmentManager(), null)
        }

        return binding.root
    }

}