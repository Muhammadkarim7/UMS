package com.example.ums

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.ums.Adapter.Adapter2
import com.example.ums.Utils.user2
import com.example.ums.databinding.FragmentMinuteBinding

class MinuteFragment : Fragment() {

    private val binding by lazy { FragmentMinuteBinding.inflate(layoutInflater) }
    lateinit var list: ArrayList<user2>
    lateinit var user: Adapter2
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        listData()

        user = Adapter2(list, object : Adapter2.RvAction{
            override fun click(position: Int) {
                findNavController().navigate(R.id.aboutFragment2, bundleOf("keyUser" to list[position]))
            }
        })

        binding.rv2.adapter = user

        return binding.root
    }

    private fun listData() {
        list= ArrayList()
        list.add(user2("<<60-Daqiqa>>", "*103*60#", "Toplamga kiritilgan daqiqalar 60 daqiqa"))
        list.add(user2("<<120-Daqiqa>>", "*103*120#", "Toplamga kiritilgan daqiqalar 120 daqiqa"))
        list.add(user2("<<180-Daqiqa>>", "*103*180#", "Toplamga kiritilgan daqiqalar 180 daqiqa"))
        list.add(user2("<<300-Daqiqa>>", "*103*300#", "Toplamga kiritilgan daqiqalar 300 daqiqa"))
        list.add(user2("<<400-Daqiqa>>", "*103*400#", "Toplamga kiritilgan daqiqalar 400 daqiqa"))
        list.add(user2("<<500-Daqiqa>>", "*103*500#", "Toplamga kiritilgan daqiqalar 500 daqiqa"))
    }

}