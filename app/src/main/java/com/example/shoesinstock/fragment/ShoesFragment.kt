package com.example.shoesinstock.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.shoesinstock.R
import com.example.shoesinstock.adapter.ShoesAdapter
import com.example.shoesinstock.model.Shoes
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_shoes.view.*

class ShoesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var shoesArray=ArrayList<Shoes>()
        shoesArray.add(Shoes("Lily","High Heel","001",R.drawable.shoe1,"$150"))
        shoesArray.add(Shoes("Tailingjil","High Heel","002",R.drawable.shoe2,"$200"))
        shoesArray.add(Shoes("Morazora","High Heel","003",R.drawable.shoe3,"$350"))
        shoesArray.add(Shoes("Shaka","Summer Chunky","004",R.drawable.shoe4,"$800"))
        shoesArray.add(Shoes("LV","High Heel","005",R.drawable.shoe5,"$950"))
        shoesArray.add(Shoes("Kiley","Flower White","006",R.drawable.shoe6,"$1000"))
        shoesArray.add(Shoes("Heels","High Heel","007",R.drawable.shoe7,"$1800"))
        var shoesAdapter=ShoesAdapter(shoesArray)
        var root=inflater.inflate(R.layout.fragment_shoes, container, false)
        root.recyclerView.layoutManager= GridLayoutManager(context,2)
        root.recyclerView.adapter=shoesAdapter
        // Inflate the layout for this fragment
        return root
    }

}
