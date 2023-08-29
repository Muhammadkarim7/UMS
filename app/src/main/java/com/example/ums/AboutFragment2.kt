package com.example.ums

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ums.Utils.user2
import com.example.ums.databinding.FragmentAbout2Binding

class AboutFragment2 : Fragment() {
    private val binding by lazy { FragmentAbout2Binding.inflate(layoutInflater) }
    lateinit var user2: user2
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        user2 = arguments?.getSerializable("keyUser") as user2
        binding.textAbout.text = user2.name
        binding.textAbout2.text = user2.about
        binding.raqam.text = user2.raqam

        return binding.root
    }
}