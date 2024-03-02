package com.example.projectactivation

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class FirstPage : AppCompatActivity() {
    @SuppressLint("InflateParams")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)

        val btnShow=findViewById<Button>(R.id.ShowDialog)
        btnShow.setOnClickListener{
            val DialogBinding=layoutInflater.inflate(R.layout.activity_dialog_fragment,null)
            val myDialog=Dialog(this)
            myDialog.setContentView(DialogBinding)
            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialog.show()
            val btnNext=DialogBinding.findViewById<Button>(R.id.NextDialog)
            btnNext.setOnClickListener {
                myDialog.dismiss()
            }
        }



    }

    fun onClickGoToCheck(view : View) {
        val intent = Intent(this, CheckActivity::class.java)
        startActivity(intent)
    }

}