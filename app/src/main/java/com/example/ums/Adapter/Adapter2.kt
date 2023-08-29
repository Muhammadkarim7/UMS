package com.example.ums.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ums.Utils.user2
import com.example.ums.databinding.ItemTarfBinding

class Adapter2(val list: List<user2>, val rvAction: RvAction) : RecyclerView.Adapter<Adapter2.Vh>(){

    inner class Vh(val item: ItemTarfBinding): RecyclerView.ViewHolder(item.root){
        fun bind(user: user2){

            item.name.text = user.name
            item.raqam.text = user.raqam
            item.about.text = user.about

            item.root.setOnClickListener {
                rvAction.click(position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter2.Vh {
        return Vh(ItemTarfBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    interface RvAction{
        fun click(position: Int)
    }
}