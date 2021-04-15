package com.example.myapplication_sync

import android.app.Application
import android.webkit.CookieManager

class MainApplication: Application() {
    companion object {
        val cookieManager by lazy { CookieManager.getInstance() }
        const val url = "https://www.mytest.com"
    }
}