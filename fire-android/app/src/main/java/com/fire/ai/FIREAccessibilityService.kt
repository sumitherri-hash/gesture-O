package com.fire.ai

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent

class FIREAccessibilityService : AccessibilityService() {

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        // FIRE will process phone UI events here.
    }

    override fun onInterrupt() {
        // Required by Android.
    }

    fun goHome() {
        performGlobalAction(GLOBAL_ACTION_HOME)
    }

    fun goBack() {
        performGlobalAction(GLOBAL_ACTION_BACK)
    }

    fun openRecents() {
        performGlobalAction(GLOBAL_ACTION_RECENTS)
    }
}
