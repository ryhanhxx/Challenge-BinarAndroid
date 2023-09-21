package com.ch.foodapp.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.ch.foodapp.data.FoodDataSource
import com.ch.foodapp.data.FoodDataSourceImpl
import com.ch.foodapp.presentation.adapter.FoodListAdapter
import com.ch.foodapp.databinding.FragmentHomeBinding
import com.ch.foodapp.model.Food
import com.ch.foodapp.presentation.adapter.AdapterLayout

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    private val datasource: FoodDataSource by lazy {
        FoodDataSourceImpl()
    }

    private val adapter: FoodListAdapter by lazy {
        FoodListAdapter(AdapterLayout.LINEAR) { food: Food ->
            navigateToDetailFragment(food)
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
        setupSwitch()
    }

    private fun setupRecyclerview() {
        val span = if (adapter.adapterLayout == AdapterLayout.LINEAR) 1 else 2
        binding.rvFoods.apply {
            layoutManager = GridLayoutManager(requireContext(), span)
            adapter = this@HomeFragment.adapter
        }
        adapter.setData(datasource.getFoodData())
    }

    private fun setupSwitch() {
        val btnSwitch = binding.ivBtnchangeview
        val layoutManager = binding.rvFoods.layoutManager as GridLayoutManager

        btnSwitch.setOnClickListener {
            val newSpanCount = if (layoutManager.spanCount == 1) 2 else 1
            layoutManager.spanCount = newSpanCount
            adapter.adapterLayout =
                if (newSpanCount == 2) AdapterLayout.GRID else AdapterLayout.LINEAR
            adapter.refreshList()
        }
    }

    private fun navigateToDetailFragment(food: Food? = null) {
        val action = HomeFragmentDirections.navigateToDetail(food)
        findNavController().navigate(action)
    }
}