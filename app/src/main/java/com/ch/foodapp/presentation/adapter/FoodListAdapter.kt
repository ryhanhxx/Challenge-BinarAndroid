package com.ch.foodapp.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.ch.foodapp.binder.ViewHolderBinder
import com.ch.foodapp.databinding.FoodItemGridBinding
import com.ch.foodapp.databinding.FoodItemListBinding
import com.ch.foodapp.model.Food

class FoodListAdapter(
    var adapterLayout: AdapterLayout,
    private val onItemClick: (Food) -> Unit
) : RecyclerView.Adapter<ViewHolder>() {

    private val differ = AsyncListDiffer(this, object : DiffUtil.ItemCallback<Food>() {
        override fun areItemsTheSame(oldItem: Food, newItem: Food): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Food, newItem: Food): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }
    })

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return when (viewType) {
            AdapterLayout.GRID.ordinal -> (FoodGridViewHolder(
                binding = FoodItemGridBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                ), onItemClick
            ))

            else -> {
                FoodLinearViewHolder(
                    binding = FoodItemListBinding.inflate(
                        LayoutInflater.from(parent.context), parent, false
                    ), onItemClick
                )
            }
        }
    }

    override fun getItemCount(): Int = differ.currentList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        (holder as ViewHolderBinder<Food>).bind(differ.currentList[position])
    }

    override fun getItemViewType(position: Int): Int {
        return adapterLayout.ordinal
    }

    fun setData(data: List<Food>) {
        differ.submitList(data)
    }

    fun refreshList() {
        notifyItemRangeChanged(0, differ.currentList.size)
    }
}

/*
class FoodListViewHolder(
    private val binding: FoodItemListBinding,
    private val onItemClick: (Food) -> Unit
) : ViewHolder(binding.root) {
    fun bind(item: Food) {
        binding.root.setOnClickListener {
            onItemClick.invoke(item)
        }
        binding.ivImage.load(item.imgUrl)
        binding.tvName.text = item.name
        binding.tvPrice.text = item.price
    }
}*/
