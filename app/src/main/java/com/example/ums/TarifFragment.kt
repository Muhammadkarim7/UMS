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
import com.example.ums.databinding.FragmentTarifBinding

class TarifFragment : Fragment() {

    private val binding by lazy { FragmentTarifBinding.inflate(layoutInflater) }
    lateinit var list: ArrayList<user2>
    lateinit var user: Adapter2
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        var key = arguments?.getInt("key")
        when(key){
            0->{
                listData()
                ot()
            }
            1->{
                daqiqa()
                ot()
            }

            2->{
                internet()
                ot()
            }
            3->{
                xizmatlar()
                ot()
            }
            4->{
                sms()
                ot()
            }
            5->{
                news()
                ot()
            }
        }
        return binding.root
    }

    fun ot(){
        user = Adapter2(list, object : Adapter2.RvAction{
            override fun click(position: Int) {
                findNavController().navigate(R.id.aboutFragment2, bundleOf("keyUser" to list[position]))
            }
        })
        binding.rv.adapter = user
    }

    private fun listData(){
        list = ArrayList()
        list.add(user2("Mobi 20", "*111*120#", "20 000/1 000 so'm oylik/kunlik abonet tolovi 500/17"))
        list.add(user2("Mobi 30", "*111*121#", "30 000/2 000 so'm oylik/kunlik abonet tolovi 1000/17"))
        list.add(user2("Mobi 40", "*111*122#", "40 000/3 000 so'm oylik/kunlik abonet tolovi 1500/17"))
        list.add(user2("Mobi 50", "*111*123#", "50 000/4 000 so'm oylik/kunlik abonet tolovi 2000/17"))
        list.add(user2("Mobi 60", "*111*124#", "60 000/5 000 so'm oylik/kunlik abonet tolovi 2500/17"))
        list.add(user2("Mobi 70", "*111*125#", "70 000/6 000 so'm oylik/kunlik abonet tolovi 3000/17"))
        list.add(user2("Mobi 80", "*111*126#", "80 000/7 000 so'm oylik/kunlik abonet tolovi 3500/17"))
        list.add(user2("Mobi 90", "*111*127#", "90 000/8 000 so'm oylik/kunlik abonet tolovi 4000/17"))
        list.add(user2("Mobi 100", "*111*128#", "100 000/9 000 so'm oylik/kunlik abonet tolovi 4500/17"))
    }

    private fun daqiqa(){
        list = ArrayList()
        list.add(user2("<<60-daqiqa", "*110*60#", "Beriladigan daqiqa 60"))
        list.add(user2("<<70-daqiqa", "*110*60#", "Beriladigan daqiqa 70"))
        list.add(user2("<<80-daqiqa", "*110*60#", "Beriladigan daqiqa 80"))
        list.add(user2("<<90-daqiqa", "*110*60#", "Beriladigan daqiqa 90"))
        list.add(user2("<<100-daqiqa", "*110*60#", "Beriladigan daqiqa 100"))
        list.add(user2("<<110-daqiqa", "*110*60#", "Beriladigan daqiqa 110"))
        list.add(user2("<<120-daqiqa", "*110*60#", "Beriladigan daqiqa 120"))
    }

    private fun internet(){
        list = ArrayList()
        list.add(user2("<<100mb", "*110*100#", "Beriladigan mb 100"))
        list.add(user2("<<200mb", "*110*200#", "Beriladigan mb 200"))
        list.add(user2("<<300mb", "*110*300#", "Beriladigan mb 300"))
        list.add(user2("<<400mb", "*110*400#", "Beriladigan mb 400"))
        list.add(user2("<<500mb", "*110*500#", "Beriladigan mb 500"))
        list.add(user2("<<600mb", "*110*600#", "Beriladigan mb 600"))
        list.add(user2("<<700mb", "*110*700#", "Beriladigan mb 700"))
    }

    private fun xizmatlar(){
        list = ArrayList()
        list.add(user2("<<100mb", "*110*100#", "Beriladigan mb 100"))
        list.add(user2("<<200mb", "*110*200#", "Beriladigan mb 200"))
        list.add(user2("<<300mb", "*110*300#", "Beriladigan mb 300"))
        list.add(user2("<<400mb", "*110*400#", "Beriladigan mb 400"))
        list.add(user2("<<500mb", "*110*500#", "Beriladigan mb 500"))
        list.add(user2("<<600mb", "*110*600#", "Beriladigan mb 600"))
        list.add(user2("<<700mb", "*110*700#", "Beriladigan mb 700"))
    }

    private fun sms(){
        list = ArrayList()
        list.add(user2("<<100sms", "*110*100#", "Beriladigan sms 100"))
        list.add(user2("<<200sms", "*110*200#", "Beriladigan sms 200"))
        list.add(user2("<<300sms", "*110*300#", "Beriladigan sms 300"))
        list.add(user2("<<400sms", "*110*400#", "Beriladigan sms 400"))
        list.add(user2("<<500sms", "*110*500#", "Beriladigan sms 500"))
        list.add(user2("<<600sms", "*110*600#", "Beriladigan sms 600"))
        list.add(user2("<<700sms", "*110*700#", "Beriladigan sms 700"))
    }

    private fun news(){
        list = ArrayList()
        list.add(user2("<<100mb", "*110*100#", "Beriladigan mb 100"))
        list.add(user2("<<200mb", "*110*200#", "Beriladigan mb 200"))
        list.add(user2("<<300mb", "*110*300#", "Beriladigan mb 300"))
        list.add(user2("<<400mb", "*110*400#", "Beriladigan mb 400"))
        list.add(user2("<<500mb", "*110*500#", "Beriladigan mb 500"))
        list.add(user2("<<600mb", "*110*600#", "Beriladigan mb 600"))
        list.add(user2("<<700mb", "*110*700#", "Beriladigan mb 700"))
    }
}