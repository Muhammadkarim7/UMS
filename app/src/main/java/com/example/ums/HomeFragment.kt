package com.example.ums

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.ums.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding.shop.setOnClickListener {
            findNavController().navigate(R.id.tarifFragment, bundleOf("key" to  0))
        }

        binding.time.setOnClickListener {
            findNavController().navigate(R.id.tarifFragment, bundleOf("key" to 1))
        }

        binding.sms.setOnClickListener {
            findNavController().navigate(R.id.tarifFragment, bundleOf("key" to 2))
        }

        binding.internet.setOnClickListener {
            findNavController().navigate(R.id.tarifFragment, bundleOf("key" to 3))
        }

        binding.xizmat.setOnClickListener {
            findNavController().navigate(R.id.tarifFragment, bundleOf("key" to 4))
        }

        binding.news.setOnClickListener {
            findNavController().navigate(R.id.tarifFragment, bundleOf("key" to 5))
        }

        return binding.root
    }

}