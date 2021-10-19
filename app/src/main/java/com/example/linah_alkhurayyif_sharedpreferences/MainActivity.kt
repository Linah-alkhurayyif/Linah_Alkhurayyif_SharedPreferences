package com.example.linah_alkhurayyif_sharedpreferences

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var sharedPreferences: SharedPreferences
    lateinit var name:String
    lateinit var Message:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        savebtn.setOnClickListener {
            sharedPreferences = this.getSharedPreferences(
                getString(R.string.preference_file_key), Context.MODE_PRIVATE)
            name= sharedPreferences.getString("name",name_et.text.toString()).toString()
            Message= sharedPreferences.getString("Message",message_et.text.toString()).toString()
            Toast.makeText(this,"Name: ${name} \n Message: ${Message}",Toast.LENGTH_SHORT).show()
            Snackbar.make(mainLayout, "Name: ${name} \n Message: ${Message}", Snackbar.LENGTH_LONG).show()
        }
        sharingbtn.setOnClickListener {
            val intent = Intent(this, ShowActivity()::class.java)
        intent.putExtra("name",name_et.text.toString())
        intent.putExtra("Message",message_et.text.toString())
        startActivity(intent)
    }
    }
}