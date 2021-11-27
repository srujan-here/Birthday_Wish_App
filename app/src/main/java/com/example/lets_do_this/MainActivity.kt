package com.example.lets_do_this

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun thistime(view: android.view.View) {
        val name=inname.editableText.toString()
      val intent=Intent(this,editingone::class.java)
        intent.putExtra("name",name)
        startActivity(intent)
    }
}