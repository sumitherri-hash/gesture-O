package com.phoenix.bridge

import android.accessibilityservice.AccessibilityService
import android.content.Intent
import android.view.accessibility.AccessibilityEvent

class PhoenixAccessibilityService : AccessibilityService() {

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        // PHOENIX will receive system UI events here.
    }

    override fun onInterrupt() {
        // Service interrupted.
    }

    fun goHome() {
        performGlobalAction(GLOBAL_ACTION_HOME)
    }

    fun goBack() {
        performGlobalAction(GLOBAL_ACTION_BACK)
    }

    fun openYouTube() {
        val intent = packageManager.getLaunchIntentForPackage(
            "com.google.android.youtube"
        )

        intent?.let {
            it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(it)
        }
    }
}
