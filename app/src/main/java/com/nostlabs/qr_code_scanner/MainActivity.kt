package com.nostlabs.qr_code_scanner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.nostlabs.qr_code_scanner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnQRScanner.setOnClickListener {
            Toast.makeText(this,"Pressed button", Toast.LENGTH_SHORT).show()
        }




    }
}