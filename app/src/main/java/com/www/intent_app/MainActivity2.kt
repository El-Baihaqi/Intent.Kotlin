package com.www.intent_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity(),
    View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnBackActivity2: Button =
            findViewById(R.id.aku)
        btnBackActivity2.setOnClickListener(this)
    }
         override fun onClick(v: View?) {
            when (v?.id) {
                R.id.aku -> {
                    val moove = Intent(this@MainActivity2, MainActivity::class.java)
                    startActivity(moove)
                }
            }
        }}
