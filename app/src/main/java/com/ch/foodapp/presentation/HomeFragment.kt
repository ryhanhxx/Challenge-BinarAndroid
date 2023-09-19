package com.ch.foodapp.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.ch.foodapp.data.FoodDataSourceImpl
import com.ch.foodapp.data.FoodListAdapter
import com.ch.foodapp.databinding.FragmentHomeBinding
import com.ch.foodapp.model.Food

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    private val adapter: FoodListAdapter by lazy {
        FoodListAdapter {
            navigateToDetailFragment(it)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerview()
        setOnClickChangeView()
    }

    private fun setOnClickChangeView() {
    }

    private fun setupRecyclerview() {
        binding.rvFoods.adapter = adapter
        binding.rvFoods.layoutManager = LinearLayoutManager(requireContext())
        adapter.setData(FoodDataSourceImpl().getFoodData())
    }

    private fun navigateToDetailFragment(food: Food? = null) {
        val action = HomeFragmentDirections.navigateToDetail(food)
        findNavController().navigate(action)
    }
}