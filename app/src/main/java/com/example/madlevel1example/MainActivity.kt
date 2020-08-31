package com.example.madlevel1example

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.madlevel1example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // Sets the activity layout resource file.

        // Using the id given in the layout file you can access the component.
        // Set an action when the user clicks on the confirm button.
        binding.btnConfirm.setOnClickListener {
            checkAnswer()
        }
    }

    /**
     * Check if the submitted answer is correct.
     */
    private fun checkAnswer() {
        val answer = binding.etAnswer.text.toString()

        if (answer == getString(R.string.giraffe)) {
            Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()
        }
    }


}