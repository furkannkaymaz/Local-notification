package com.furkan.localnotifications.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.furkan.localnotifications.R
import com.furkan.localnotifications.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<MainViewModel>()
    var id = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnUpdateNotificaiton.setOnClickListener {
            viewModel.updateSimpleNotification("New Title", id)
        }
        binding.btnSendNotificaiton.setOnClickListener {
            viewModel.showSimpleNotification(id)
        }
        binding.btnDeleteNotificaiton.setOnClickListener {

            viewModel.cancelSimpleNotification(id)

        }

    }
}

