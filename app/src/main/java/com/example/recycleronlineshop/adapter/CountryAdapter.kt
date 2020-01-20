package com.example.recycleronlineshop.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleronlineshop.R
import com.example.recycleronlineshop.model.Country

class CountryViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var image = itemView.findViewById<ImageView>(R.id.country_image)
}

class CountryAdapter (var countryList:ArrayList<Country>):RecyclerView.Adapter<CountryViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.country,parent,false)
        return CountryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.image.setImageResource(countryList[position].image)
    }

}