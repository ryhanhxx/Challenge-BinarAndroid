package com.ch.foodapp.presentation.adapter

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.ch.foodapp.binder.ViewHolderBinder
import com.ch.foodapp.databinding.FoodItemGridBinding
import com.ch.foodapp.databinding.FoodItemListBinding
import com.ch.foodapp.model.Food

class FoodItemViewHolder {
}

class FoodLinearViewHolder(
    private val binding: FoodItemListBinding,
    private val onClickListener: (Food) -> Unit
) : RecyclerView.ViewHolder(binding.root), ViewHolderBinder<Food> {
    override fun bind(item: Food) {
        binding.ivImage.load(item.imgUrl) {
            crossfade(true)
        }
        binding.tvName.text = item.name
        binding.tvPrice.text = item.price
        binding.root.setOnClickListener {
            onClickListener.invoke(item)
        }
    }
}

class FoodGridViewHolder(
    private val binding: FoodItemGridBinding,
    private val onClickListener: (Food) -> Unit
) : RecyclerView.ViewHolder(binding.root), ViewHolderBinder<Food> {
    override fun bind(item: Food) {
        binding.ivImage.load(item.imgUrl) {
            crossfade(true)
        }
        binding.tvName.text = item.name
        binding.tvPrice.text = item.price
        binding.root.setOnClickListener {
            onClickListener.invoke(item)
        }
    }
}