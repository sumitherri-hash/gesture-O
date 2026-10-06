package com.phoenix.bridge

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.Settings

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Open Android Accessibility settings
        startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS))
    }
}
