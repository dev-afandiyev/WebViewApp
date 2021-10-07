package com.example.webviewapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.databinding.DataBindingUtil
import com.example.webviewapp.R
import com.example.webviewapp.databinding.FragmentFacebookBinding

class FacebookFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentFacebookBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_facebook, container, false
        )

        binding.webView.webViewClient = WebViewClient()
        binding.webView.loadUrl("https://www.facebook.com")

        return binding.root

    }

}