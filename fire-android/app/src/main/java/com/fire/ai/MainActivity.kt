package com.fire.ai

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(40, 60, 40, 40)

        val title = TextView(this)
        title.text = "🔥 FIRE AI"
        title.textSize = 32f

        val status = TextView(this)
        status.text = "\nFIRE Android Control Core\n\nEnable Accessibility to allow FIRE to perform permitted phone-control actions."

        val button = Button(this)
        button.text = "ENABLE FIRE CONTROL"

        button.setOnClickListener {
            startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS))
        }

        layout.addView(title)
        layout.addView(status)
        layout.addView(button)

        setContentView(layout)
    }
}
