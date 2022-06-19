package com.febryan.intentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.febryan.intentactivity.databinding.ActivityMoveObjectBinding
import kotlinx.android.synthetic.main.activity_main.*

class MoveObjectActivity : AppCompatActivity() {

    lateinit var binding: ActivityMoveObjectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoveObjectBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Terima Data Pengirim
        val siswa = intent.getParcelableExtra<Siswa>("SIS")

        if (siswa != null){
            binding.tvNama.text = siswa.nama
            binding.tvUmur.text = siswa.umur.toString()
            binding.tvGender.text = siswa.gender.toString()
            binding.tvLulus.text = if(siswa.lulus) "Lulus" else "Belum Lulus"
            binding.tvTinggi.text = siswa.tinggi.toString()
        }

    }
}