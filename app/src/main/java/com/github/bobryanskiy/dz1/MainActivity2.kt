package com.github.bobryanskiy.dz1

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        findViewById<Button>(R.id.button2).setOnClickListener {
            val intent = Intent()
            intent.putExtra("name", findViewById<EditText>(R.id.editTextText).text.toString())
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}