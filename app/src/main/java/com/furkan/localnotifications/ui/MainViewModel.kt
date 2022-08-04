package com.furkan.localnotifications.ui

import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val notificationBuilder: NotificationCompat.Builder,
    private val notificationManager: NotificationManagerCompat
) : ViewModel() {

    fun showSimpleNotification(id: Int) {
        notificationManager.notify(id, notificationBuilder.build())
    }

    fun updateSimpleNotification(newTitle : String,id: Int) {
        notificationManager.notify(id, notificationBuilder
            .setContentTitle(newTitle)
            .build()
        )
    }

    fun cancelSimpleNotification(id: Int) {
        notificationManager.cancel(id)
    }

}