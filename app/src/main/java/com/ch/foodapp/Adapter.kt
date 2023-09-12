package com.ch.foodapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ch.foodapp.databinding.ItemBinding

class Adapter(val list: ArrayList<Property>) : RecyclerView.Adapter<Adapter.MyView>() {
    inner class MyView(val itemBinding: ItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {
        return MyView(ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyView, position: Int) {
        holder.itemBinding.ivImage.setImageResource(list[position].image)
        holder.itemBinding.tvName.text = list[position].name
        holder.itemBinding.tvPrice.text = list[position].price

    }


}