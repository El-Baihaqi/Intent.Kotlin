package com.www.intent_app


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity(), View.OnClickListener {
    companion object {
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_ADDRESS = "extra_address"
        const val EXTRA_GENDER = "extra_gender" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main3)
        val dataReceived: TextView = findViewById(R.id.dataterima)
        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)
        val address = intent.getStringExtra(EXTRA_ADDRESS) //
        val gender = intent.getStringExtra(EXTRA_GENDER)
        val text = "Name : $name " + "\n"+
                  "Your Age :" + " $age "+"\n" +
                 "Address: $address," +"\n"+
                "Gender: $gender\""
        dataReceived.text = text

        val btn =findViewById<Button>(R.id.aku)
        btn.setOnClickListener(this)



    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.aku->{
                val moove = Intent(this@MainActivity3,MainActivity::class.java)
                startActivity(moove)}
        }
    }
}
