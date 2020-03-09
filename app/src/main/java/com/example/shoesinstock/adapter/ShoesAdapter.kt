package com.example.shoesinstock.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.example.shoesinstock.R
import com.example.shoesinstock.model.Shoes
import kotlinx.android.synthetic.main.shoes_item.view.*

class ShoesAdapter(var shoesList: ArrayList<Shoes>) :   //Obj array list ko argu a nay nae htae
    RecyclerView.Adapter<ShoesAdapter.ShoesViewHolder>() {

    inner class ShoesViewHolder(itemView: View) ://view nae call ya mal
        RecyclerView.ViewHolder(itemView) {
        fun bindPerson(shoes: Shoes) {
            itemView.name.text = shoes.name
            itemView.type.text = shoes.type
            itemView.code.text = shoes.code
            itemView.price.text = shoes.price
            itemView.photo.setImageResource(shoes.photo)
        }
    }

    //..............rec put mal layout...rec puttin work
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoesViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.shoes_item, parent, false)
        return ShoesViewHolder(view)
    }

    //............rec mr output ml count a yay a twat
    override fun getItemCount(): Int {
        return shoesList.size
    }

    override fun onBindViewHolder(holder: ShoesViewHolder, position: Int) {
        holder.bindPerson(shoesList[position])//array tae insert
    }


}