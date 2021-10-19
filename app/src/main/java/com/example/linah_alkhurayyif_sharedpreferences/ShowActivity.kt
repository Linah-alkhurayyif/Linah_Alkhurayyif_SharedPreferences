package com.example.linah_alkhurayyif_sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_show.*

class ShowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)
        val name = intent.getStringExtra("name")
        val Message = intent.getStringExtra("Message")
        result_tv.text ="Name: ${name.toString()} \n Message: ${Message.toString()}"
    }
}