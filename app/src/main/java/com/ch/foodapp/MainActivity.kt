package com.ch.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ch.foodapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var adapter: Adapter
    lateinit var list: ArrayList<Property>
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvListmakanan.setHasFixedSize(true)
        list = ArrayList()
        list.add(Property(R.drawable.img_ayambakar, "Ayam Bakar", "Rp. 50.000"))
        list.add(Property(R.drawable.img_ayamgeprek, "Ayam Geprek", "Rp. 40.000"))
        list.add(Property(R.drawable.img_ayamgoreng, "Ayam Goreng", "Rp. 40.000"))
        list.add(Property(R.drawable.img_sateususayam, "Sate Usus Ayam", "Rp. 5.000"))

        adapter = Adapter(list)
        binding.rvListmakanan.adapter = adapter
        binding.rvListmakanan.layoutManager = LinearLayoutManager(this)
    }
}