package com.www.intent_app

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithData: Button = findViewById(R.id.move_with_data)
        btnMoveWithData.setOnClickListener(this)

        val dialbtn: Button = findViewById(R.id.dialbtn)
        dialbtn.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_move_activity -> {
                val move = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(move)
            }

            R.id.move_with_data -> {
                val moveWithDataIntent = Intent(this@MainActivity,MainActivity3::class.java)
                moveWithDataIntent.putExtra(MainActivity3.EXTRA_NAME,
                    "Monya")

                moveWithDataIntent.putExtra(MainActivity3.EXTRA_AGE, 17)
                moveWithDataIntent.putExtra(MainActivity3.EXTRA_ADDRESS, "Turki")
                moveWithDataIntent.putExtra(MainActivity3.EXTRA_GENDER, "Woman")
                startActivity(moveWithDataIntent)
            }
            R.id.dialbtn-> {
                val PhoneNumber="0858585858"
                val dialIntent= Intent(Intent.ACTION_DIAL, Uri.parse("tel:$PhoneNumber"))
                startActivity(dialIntent)
            }


        }
    }
}


