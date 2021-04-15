package com.example.myapplication_sync

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.webkit.CookieManager
import com.example.myapplication_sync.MainApplication.Companion.cookieManager
import com.example.myapplication_sync.MainApplication.Companion.url

class MainService: Service() {

    override fun onCreate() {
        super.onCreate()
        val cookie = cookieManager.getCookie(url)
        printMe("MainService", "cookie is $cookie")
        stopSelf()
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}
