package com.febryan.multimedia

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.MediaController
import com.febryan.multimedia.databinding.ActivityMainBinding
import com.febryan.multimedia.databinding.ActivityVideoBinding

class VideoActivity : AppCompatActivity() {

    lateinit var binding: ActivityVideoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoBinding.inflate(layoutInflater)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setContentView(binding.root)

        supportActionBar?.hide()

        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.android)

        // Tampilkan Pengontrol Video
        val controller = MediaController(this)
        controller.setAnchorView(binding.vodeoLocal)
        binding.vodeoLocal.setMediaController(controller)

        binding.vodeoLocal.setVideoURI(uri)
        binding.vodeoLocal.requestFocus()
        binding.vodeoLocal.start()

        binding.vodeoLocal.setOnCompletionListener {
            finish()
        }
    }
}