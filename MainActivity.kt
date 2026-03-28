package com.example.a1imad

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import android.util.Log

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val tag = "TimeActivity"
        val inputField = findViewById<EditText>(R.id.hourInput)
        val submitButton = findViewById<Button>(R.id.submitButton)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        Log.d(tag, "=================================")
        Log.d(tag, "   Social Sparks Suggestions   ")
        Log.d(tag, "=================================")

        submitButton.setOnClickListener {
            val input = inputField.text.toString().toIntOrNull()

            if (input == null || input !in 0..23) {
                resultText.text = "Please enter a valid hour (5-23)"
                Log.d(tag, "Invalid input.")
            } else {
                val suggestion = when (input) {
                    in 5..8   -> "Send a 'Good Morning' text to a family member"
                    in 9..11  -> "Reach out to a colleague with a quick 'Thank you'"
                    in 12..14 -> "Share a funny meme or interesting link with a friend"
                    in 15..17 -> "Send a quick 'thinking of you' message"
                    in 18..19 -> "Call a friend or relative for a 5-minute catch-up"
                    in 20..22 -> "Leave a thoughtful comment on a friend's post"
                    else      -> "No message for this time of day."
                }
                resultText.text = suggestion
                Log.d(tag, suggestion)
            }
        }

        resetButton.setOnClickListener {
            inputField.text.clear()
            resultText.text = ""
            Log.d(tag, "--- Resetting ---")
        }
    }
}