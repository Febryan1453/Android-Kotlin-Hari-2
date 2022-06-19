package com.febryan.intentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.febryan.intentactivity.databinding.ActivityMoveDataBinding

class MoveDataActivity : AppCompatActivity() {

    lateinit var binding: ActivityMoveDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoveDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nama = intent.getStringExtra("NAMA")
        val umur = intent.getIntExtra("UMUR", 0)
        val tinggi = intent.getDoubleExtra("TINGGI",0.0)

        binding.tvNama.text = nama
        binding.tvUmur.text = umur.toString()
        binding.tvTinggi.text = tinggi.toString()

    }
}