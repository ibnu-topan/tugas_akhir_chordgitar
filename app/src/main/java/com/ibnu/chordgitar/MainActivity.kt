package com.ibnu.chordgitar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.button)

        btnIntent.setOnClickListener (this)
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.button -> run {
                val intentBiasa = Intent (this@MainActivity, SecondActivity::class.java)
                startActivity(intentBiasa)
            }
        }
    }
}