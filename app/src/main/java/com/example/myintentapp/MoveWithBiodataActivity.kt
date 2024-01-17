package com.example.myintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MoveWithBiodataActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_biodata)

        val tvBiodata: TextView = findViewById(R.id.tv_biodata_received);
         val btnBack: Button= findViewById(R.id.btn_back1)
        btnBack.setOnClickListener(this)

        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)
        val address = intent.getStringExtra(EXTRA_ADDRE)
        val sch = intent.getStringExtra(EXTRA_SCH)


        val text = "Name : $name \nYour Age : $age \nAddress : $address \nSchool : $sch"
        tvBiodata.text = text

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_back1 -> {
                // Handle the "Back" button click
                finish() // Finish the current activity to navigate back
            }
        }
    }
        companion object{
            const val EXTRA_AGE = "extra_age"
            const val EXTRA_NAME = "extra_name"
            const val EXTRA_ADDRE = "extra_alamat"
            const val EXTRA_SCH = "extra sch"
        }
    }


