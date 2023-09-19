package com.ch.foodapp.data

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.ch.foodapp.databinding.FoodItemListBinding
import com.ch.foodapp.model.Food

class FoodListAdapter(private val onItemClick: (Food) -> Unit) :
    RecyclerView.Adapter<FoodListViewHolder>() {

    private val differ = AsyncListDiffer(this, object : DiffUtil.ItemCallback<Food>() {
        override fun areItemsTheSame(oldItem: Food, newItem: Food): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Food, newItem: Food): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }
    })

    fun setData(data: List<Food>) {
        differ.submitList(data)
        notifyItemRangeChanged(0, data.size)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodListViewHolder {
        return FoodListViewHolder(
            binding = FoodItemListBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            ),
            onItemClick = onItemClick
        )
    }

    override fun getItemCount(): Int = differ.currentList.size

    override fun onBindViewHolder(holder: FoodListViewHolder, position: Int) {
        holder.bind(differ.currentList[position])
    }
}

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
}