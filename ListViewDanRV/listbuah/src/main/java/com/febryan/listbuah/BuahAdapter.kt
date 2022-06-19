package com.febryan.listbuah

import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BuahAdapter(val namaBuah : Array<String>, val gambarBuah : Array<Int>, val suaraBuah : Array<Int>) :
    RecyclerView.Adapter<BuahAdapter.MyViewHolder>(){

    // 1. Variable untuk arahkan ke widget di layout
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvBuah = view.findViewById<TextView>(R.id.item_tv_buah)
        val imgBuah = view.findViewById<ImageView>(R.id.item_image)
    }

    // 2. Return ke layoutnya
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items_row_buah, parent,false)
        return MyViewHolder(view)
    }

    // 3. Posisikan data ke Widgetnya
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvBuah.text = namaBuah[position]
        holder.imgBuah.setImageResource(gambarBuah[position])
        holder.itemView.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(holder.itemView.context, suaraBuah[position])
            mediaPlayer.start()
        }
    }

    // 4. Tampilkan data sebanyak datanya
    override fun getItemCount(): Int {
        return namaBuah.size
    }

}