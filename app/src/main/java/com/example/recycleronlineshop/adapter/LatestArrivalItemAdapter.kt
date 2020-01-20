package com.example.recycleronlineshop.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleronlineshop.R
import com.example.recycleronlineshop.model.LatestArrivalItem
import kotlinx.android.synthetic.main.latest_arrival_items.view.*

class LatestArrivalItemViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var itemImage = itemView.findViewById<ImageView>(R.id.latest_arrival_item_image)
    var itemName = itemView.findViewById<TextView>(R.id.latest_arrival_item_name)
    var itemRating = itemView.findViewById<RatingBar>(R.id.ratingBar)
    var itemBrand = itemView.findViewById<TextView>(R.id.latest_arrival_item_brand)
    var itemPrice = itemView.findViewById<TextView>(R.id.latest_arrival_item_price)
}

class LatestArrivalItemAdapter (var latestArrivalItemList: ArrayList<LatestArrivalItem>):RecyclerView.Adapter<LatestArrivalItemViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestArrivalItemViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.latest_arrival_items,parent, false)
        return LatestArrivalItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return latestArrivalItemList.size
    }

    override fun onBindViewHolder(holder: LatestArrivalItemViewHolder, position: Int) {
        holder.itemImage.setImageResource(latestArrivalItemList[position].image)
        holder.itemName.text = latestArrivalItemList[position].name
        holder.itemRating.rating = latestArrivalItemList[position].rating.toFloat()
        holder.itemBrand.text = latestArrivalItemList[position].brand
        holder.itemPrice.text = latestArrivalItemList[position].price
    }

}