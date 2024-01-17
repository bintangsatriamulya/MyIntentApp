package com.example.myintentapp


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity



class MainActivity : ComponentActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithDataActivity: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithDataActivity.setOnClickListener(this)
    }


    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {
                R.id.btn_move_activity -> {
                    val  moveIntent = Intent(this@MainActivity,MoveActivity::class.java)
                    startActivity(moveIntent)

                }
                R.id.btn_move_activity_data -> {
                    val  moveViewDataIntent = Intent(this@MainActivity,MoveWithDataActivity::class.java)

                    moveViewDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME,"Hallo Mokleters")

                    moveViewDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE,5)
                    startActivity(moveViewDataIntent)


                }
            }
        }
    }


}
