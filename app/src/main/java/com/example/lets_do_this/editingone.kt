package com.example.lets_do_this

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_editingone.*

class editingone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editingone)
        val name=intent.getStringExtra("name")
        greeting.text="happy birthday $name"

    }
}