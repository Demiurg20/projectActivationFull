package com.example.projectactivation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CheckActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check)
    }

    fun onClickGoToBack(view : View) {
        val intent = Intent(this, FirstPage::class.java)
        startActivity(intent)
    }
}