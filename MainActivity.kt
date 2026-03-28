package com.example.a1imad

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import android.util.Log






class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()



        fun main() {
            var running = true
            val TAG = "TimeActivity"

            while (running) {
                print("Enter the hour (0-23) or -1 to reset: ")
                val input = readLine()?.toIntOrNull()

                if (input == null) {
                    Log.d (TAG, "Invalid input. Please enter a number.")
                } else if (input == -1) {
                    Log.d(TAG, "--- Resetting ---")
                } else {
                    val time = input

                    if (time in 5..8) {
                        Log.d(TAG, "Send a 'Good Morning' text to a family member")
                    } else if (time in 9..11) {
                        Log.d(TAG, "Reach out to a colleague with a quick 'Thank you'")
                    } else if (time in 12..14) {
                        Log.d(TAG, "Share a funny meme or interesting link with a friend")
                    } else if (time in 15..17) {
                        Log.d(TAG, "Send a quick 'thinking of you' message")
                    } else if (time in 18..19) {
                        Log.d(TAG, "Call a friend or relative for a 5-minute catch-up")
                    } else if (time in 20..22) {
                        Log.d(TAG, "Leave a thoughtful comment on a friend's post")
                    } else {
                        Log.d(TAG, "No message for this time of day.")
                    }

                    print("Press R to reset or Q to quit or any key to continue: ")
                    val action = readLine()?.trim()?.uppercase()

                    when (action) {
                        "R" -> Log.d(TAG, "--- Resetting ---")
                        "Q" -> {
                            Log.d(TAG, "Goodbye!")
                            running = false
                        }
                    }
                }
            }
        }



    }
}
