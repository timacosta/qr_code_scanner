package com.nostlabs.qr_code_scanner

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.provider.Settings
import android.util.Log
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.nostlabs.qr_code_scanner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    val permissions = arrayOf("android.permission.CAMERA", "android.permission.INTERNET")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnQRScanner.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            if(checkCameraPermission()) startActivity(intent)
            requestCameraPermission()
        }
    }

    fun checkCameraPermission(): Boolean {
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
            != PackageManager.PERMISSION_GRANTED) {
                return false;
        }
        return true;
    }

    fun requestCameraPermission() {
        ActivityCompat.requestPermissions(this, permissions,1)
    }



}