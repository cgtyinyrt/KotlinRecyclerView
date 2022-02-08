package com.cagatayinyurt.kotlinrecyclerview.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cagatayinyurt.kotlinrecyclerview.databinding.ActivityDetailsBinding
import com.cagatayinyurt.kotlinrecyclerview.model.Landmark

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark

        binding.tvName.text = selectedLandmark.name
        binding.tvCountry.text = selectedLandmark.country
        binding.imageView.setImageResource(selectedLandmark.image)
    }
}