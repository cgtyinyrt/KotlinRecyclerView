package com.cagatayinyurt.kotlinrecyclerview.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cagatayinyurt.kotlinrecyclerview.databinding.RecyclerRowBinding
import com.cagatayinyurt.kotlinrecyclerview.model.Landmark
import com.cagatayinyurt.kotlinrecyclerview.ui.DetailsActivity

class LandmarkAdapter(
    private val landmarkList: ArrayList<Landmark>
) : RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {

    inner class LandmarkHolder(
        val binding: RecyclerRowBinding
    ) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        val binding = RecyclerRowBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return LandmarkHolder(binding)
    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
        holder.binding.rvText.text = landmarkList[position].name

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailsActivity::class.java)
            intent.putExtra("landmark", landmarkList[position])
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return landmarkList.size
    }
}