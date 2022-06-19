package com.febryan.intentactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.febryan.intentactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    val tag = "SiklusActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(tag, "OnCreate")

        binding.btnMove.setOnClickListener {
            val intent = Intent(this@MainActivity, MoveActivity::class.java)
            startActivity(intent)
        }

        binding.btnMoveData.setOnClickListener {
            val intent = Intent(this@MainActivity, MoveDataActivity::class.java)
            intent.putExtra("NAMA", "Febryan")
            intent.putExtra("UMUR", 21)
            intent.putExtra("TINGGI", 171.7)
            startActivity(intent)
        }

        binding.btnMoveObject.setOnClickListener {
            val siswa = Siswa("Febryan", 21,'L',false,171.7)
            val intent = Intent(this@MainActivity, MoveObjectActivity::class.java)
            // Kirim Data
            intent.putExtra("SIS", siswa)
            startActivity(intent)
        }

        binding.btnMoveToApplication.setOnClickListener {
            val telp = "082191170349"
            val i = Intent(Intent.ACTION_DIAL)
            i.data = Uri.parse("tel:$telp")
            startActivity(i)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "onDestroy")
    }
}