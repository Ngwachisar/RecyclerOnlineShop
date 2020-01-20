package com.example.recycleronlineshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleronlineshop.adapter.CountryAdapter
import com.example.recycleronlineshop.adapter.LatestArrivalItemAdapter
import com.example.recycleronlineshop.adapter.PopularProductAdapter
import com.example.recycleronlineshop.model.Country
import com.example.recycleronlineshop.model.LatestArrivalItem
import com.example.recycleronlineshop.model.PopularProduct

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        latestArrivalItems()
        country()
        popularProduct()
    }

    fun latestArrivalItems(){
        var recyclerView1:RecyclerView = findViewById(R.id.recycler_latestarrivals)

        var latestArrivalItemList = ArrayList<LatestArrivalItem>()
        latestArrivalItemList.add(LatestArrivalItem(R.drawable.louis_vuitton, "Hyde Park\nN41015", 4,"LOUIS VUITTON", "999,99999 KS"))
        latestArrivalItemList.add(LatestArrivalItem(R.drawable.long_sleeve_t_shirt, "HORNS PINK LONG\nSLEEVE T SHIRT", 5, "Lady GAGA", "72000 KS"))
        latestArrivalItemList.add(LatestArrivalItem(R.drawable.apple_iphone_11_red, "HORNS PINK LONG\nSLEEVE T SHIRT",  4,"Apple", "1100000 KS"))


        var latestArrivalItemAdapter = LatestArrivalItemAdapter(latestArrivalItemList)
        recyclerView1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView1.adapter = latestArrivalItemAdapter
    }

    fun country(){
        var recyclerView2:RecyclerView = findViewById(R.id.recycler_country)

        var countryList = ArrayList<Country>()
        countryList.add(Country(R.drawable.japan, "Japan"))
        countryList.add(Country(R.drawable.korea, "Korea"))
        countryList.add(Country(R.drawable.china_greatewall, "China"))
        countryList.add(Country(R.drawable.international, "International"))


        var countryAdapter = CountryAdapter(countryList)
        recyclerView2.layoutManager = GridLayoutManager(this,2)
        recyclerView2.adapter = countryAdapter
    }

    fun popularProduct(){
        var recyclerView3:RecyclerView = findViewById(R.id.recycler_popularproduct)

        var popularProductList = ArrayList<PopularProduct>()
        popularProductList.add(PopularProduct("Iphone 8 Pluse",R.drawable.iphone_8_plus, "Apple", 4,"980000 KS", "1100000 KS"))
        popularProductList.add(PopularProduct("GhostBed 11 Inch Cooling\n" +
                "Gel Memory Foam.",R.drawable.coolest_bed, "Ghost Bed", 4,"325000 KS ", "495000KS"))
        popularProductList.add(PopularProduct("Nintendo Switch - Neon Blue\n" +
                "and Red Joy-Con",R.drawable.china_greatewall, "Nintendo",4, "359000 KS" , "0 KS"))
        popularProductList.add(PopularProduct("BELAROI Womens Comfy\n" +
                "Swing Tunic Short.",R.drawable.summer_dresses, "Belaroi", 4,"189900 KS" , "0 KS"))


        var popularProductAdapter = PopularProductAdapter(popularProductList)
        recyclerView3.layoutManager = LinearLayoutManager(this)
        recyclerView3.adapter = popularProductAdapter
    }
}
