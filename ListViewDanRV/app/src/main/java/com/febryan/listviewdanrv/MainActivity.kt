package com.febryan.listviewdanrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val kucing = arrayOf("Persia", "Anggora", "Himalaya", "Peeknos", "Rumahan", "Garong")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, kucing)
        list_view.adapter = adapter
        list_view.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Anda memilih kucing : ${kucing[position]}", Toast.LENGTH_SHORT).show()
        }

    }

}