package com.febryan.multimedia

import android.app.ProgressDialog
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.MediaController
import com.febryan.multimedia.databinding.ActivityVideoStreamingBinding

class VideoStreamingActivity : AppCompatActivity() {

    lateinit var binding: ActivityVideoStreamingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoStreamingBinding.inflate(layoutInflater)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setContentView(binding.root)

        supportActionBar?.hide()

        val urlYt = "https://du.sf-converter.com/go?payload=1*eJzdVNlu6zYQ%2FRUjQIgWqByJ2gMQF7IsK45jO4q8xHkxZImW6IiSrM1L0X8vqaTLLfpyi%2FbhFhAOByQ4mjNneH6%2BqfKmDPGyTG%2Fub5K6Lqr7u7vT6dS%2F5E3d7HA%2FzOndKajD5EuLymA92DSHApbjm58%2Bb46jb74YNBHJv%2F5jWcqCIFSZYLRHVWnzcwbVIhcS9aj14zyPU9ySCOdd0i4q0uCyC8L3L%2FhckBIjSVNVTZVFXQGYoLDRms3xklqaZhVC%2FgyVda1ZU0AKJJlKX1LMPoRS31ABiVAuWI768La6FP5ktHnfVINoOXQP%2B5cnbfu%2BjeJHf7D0BkvXfzqkIstRBzGSFBF88EeffEGJjw2rpKpSdMEVoAl6zQClSJZuoQ1NQDP0t%2FzYKdtn0RVnOAK0QkHD9sqoAbRFlAFBMihCCkN2xlMXKWMBSEbq8JRFu6Ji5SiqKLKSihApebiyhVkamdFIis4OdNLDjE6obmwLYemBtihbJAFKKEadErdwRAsFZBUKlax9spdioryq23dor0UqxM%2BxC2JSdn8OU5whXRZVWZFBXu9ZO0HUlEhRpb6smCClNZJUQ5QkTTdMVYSqJgK%2Bx9WRJUk3wL5lIijgHeMiSEmLu7x7piKCiihKsi7zdrFQh4oGQrR2BqBmpxqUJAghyJA3HSbjNJkMjeHW9BjnoAxYZz4GgV3GhAEpOEQcmF68x51avLG%2F68R3i5AhbwlbeEvYklUMGGOGnC9bOFO2MKYMGUdQkRhZ86PoPRqnF2scL5VH91iOzmNsTq5vFzd4bLf7XV6ZJBu1MyfX1HIv0KeI2JY9fgg9cWVWhr3cqIbumNdHb%2Bs%2B4MnU3h4XTbtbVvWoXVwvrliB9Dd2NOEFUg68IsprpF3RLaf7OR484rT%2BNBssBS%2FWle3t2Tq9eOP4LR3t3dla2ommMyyt4TyZp3M8G1gkPugBHaWL8lIbb21di%2FbYs929t%2FLbpjk6ON0snmbS3Mvc8WlyXfjqaifrtW8s8FnbjvLTrTxkH3vh3RP9zl%2B4rIOAR%2Bx1yXwmJVnpUO1Q61DnqIndxMIOP6ZX6VDv0ODIBv9%2FYBedLt9qF4YODdVkqv3FLyAr4Gu%2F0AzD%2BDf9QvtHfvEh%2Bn%2FtGP5atrzKDxY1vEzFLB5CR3SFbO41viX6vjt31CNxrvELDu3xINacLZ4Fg9fTVNlosxJKA6vNH5Y7snBc57nF1o4uVy8xG6Hv1DFqUqeY2YXflEHds9LetKmTYL8ne5L1hN609xDsyK43C6qySdMg6f1Ag2NOeweSBOV7kPzIcnwoWln1zf0fZvHLr3Vw19s%3D*1655631475*42164c2d5ff8482a"

        // Tampilkan Pengontrol Video
        val controller = MediaController(this)
        controller.setAnchorView(binding.vodeoStreaming)
        binding.vodeoStreaming.setMediaController(controller)

        val loading = ProgressDialog(this)
        loading.setMessage("Loading")
        loading.show()

        binding.vodeoStreaming.setVideoURI(Uri.parse(urlYt))
        binding.vodeoStreaming.requestFocus()

        binding.vodeoStreaming.setOnCompletionListener {
            it.start()
            loading.dismiss()
        }

    }
}