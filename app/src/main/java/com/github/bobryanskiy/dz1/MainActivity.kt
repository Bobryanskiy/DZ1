package com.github.bobryanskiy.dz1

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var txt : TextView
    val secondActivityResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        result -> if (result.resultCode == Activity.RESULT_OK) {
            result.data?.getStringExtra("name")?.let{
                txt.text = "Привет, $it"
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt = findViewById(R.id.textView)
    }

    fun buttonOnClick(view : View) {
        secondActivityResult.launch(Intent(this, MainActivity2::class.java))
    }
}