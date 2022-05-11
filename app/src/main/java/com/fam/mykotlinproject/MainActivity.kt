package com.fam.mykotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initview()
    }
    fun initview(){
        var button= findViewById<Button>(R.id.button_1)
        button.setOnClickListener{click()}
    }
    fun click(){
        val intent = Intent(this,DetailActivity::class.java)
        startActivity(intent)
    }
}