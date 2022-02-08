package com.cagatayinyurt.kotlinrecyclerview.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.cagatayinyurt.kotlinrecyclerview.R
import com.cagatayinyurt.kotlinrecyclerview.adapter.LandmarkAdapter
import com.cagatayinyurt.kotlinrecyclerview.databinding.ActivityMainBinding
import com.cagatayinyurt.kotlinrecyclerview.model.Landmark

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        // Data
        val pisa = Landmark(
            "Pisa",
            "Italy",
            R.drawable.pisa)
        val colosseum = Landmark(
            "Colosseum",
            "Italy",
            R.drawable.colosseum)
        val eiffelTower = Landmark(
            "Eiffel Tower",
            "France",
            R.drawable.eiffel)
        val londonBridge = Landmark(
            "London Bridge",
            "United Kingdom",
            R.drawable.londonbridge)

        landmarkList.add(pisa)
        landmarkList.add(colosseum)
        landmarkList.add(eiffelTower)
        landmarkList.add(londonBridge)

        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }
}