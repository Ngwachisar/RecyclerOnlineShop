package com.example.recycleronlineshop.adapter

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleronlineshop.R
import com.example.recycleronlineshop.model.PopularProduct
import kotlinx.android.synthetic.main.popular_product.view.*

class PopularProductViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var name = itemView.findViewById<TextView>(R.id.product_name)
    var image = itemView.findViewById<ImageView>(R.id.product_image)
    var type = itemView.findViewById<TextView>(R.id.prodcut_type)
    var currentPrice = itemView.findViewById<TextView>(R.id.current_price)
    var previousPrice = itemView.findViewById<TextView>(R.id.previous_price)
    var rating = itemView.findViewById<RatingBar>(R.id.rating_bar)
}

class PopularProductAdapter (var popularProductList:ArrayList<PopularProduct>):RecyclerView.Adapter<PopularProductViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularProductViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.popular_product,parent,false)
        return PopularProductViewHolder(view)
    }

    override fun getItemCount(): Int {
        return popularProductList.size
    }

    override fun onBindViewHolder(holder: PopularProductViewHolder, position: Int) {
        holder.name.text = popularProductList[position].name
        holder.image.setImageResource(popularProductList[position].image)
        holder.type.text = popularProductList[position].type
        holder.currentPrice.text = popularProductList[position].currentPrice
        holder.previousPrice.text = popularProductList[position].previousPrice
        holder.rating.rating = popularProductList[position].rating.toFloat()
    }

}