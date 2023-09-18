package com.ch.foodapp.presentation

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import coil.load
import com.ch.foodapp.databinding.FragmentDetailBinding
import com.ch.foodapp.model.Food


class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding

    private val food: Food? by lazy {
        DetailFragmentArgs.fromBundle(arguments as Bundle).food
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showFoodData()
        setOnClickLocation()
    }

    private fun setOnClickLocation() {
        binding.tvTextLocation.setOnClickListener {
            navigateToMaps()
        }
    }

    private fun navigateToMaps() {
        /*val location = Intent(this.requireContext())*/
    }

    private fun showFoodData() {
        if (food != null) {/*
            binding.ivImagedetail.load(food?.imgUrl)*/
            binding.tvFoodname.text = food?.name
            binding.tvFoodprice.text = food?.price
        } else {
            Toast.makeText(requireContext(), "Food Not Found", Toast.LENGTH_SHORT).show()
        }
    }
}