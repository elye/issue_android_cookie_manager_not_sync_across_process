package com.example.myapplication_sync

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication_sync.MainApplication.Companion.cookieManager
import com.example.myapplication_sync.MainApplication.Companion.url

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onWriteCookie(v: View) {
        printMe("MainActivity", "onWriteCookie")
        val cookieString = "mycookie=cookie001"
        cookieManager.setCookie(url, cookieString)
        cookieManager.flush()
    }

    fun onClearCookie(v: View) {
        printMe("MainActivity", "onClearClick")
        cookieManager.removeAllCookies(null)
        cookieManager.flush()
    }

    fun onMainButtonClick(view: View) {
        startService(Intent(this, MainService::class.java))
    }

    fun onOtherButtonClick(view: View) {
        startService(Intent(this, OtherService::class.java))
    }

    override fun onDestroy() {
        printMe("MainActivity", "onDestroy")
        super.onDestroy()
    }
}