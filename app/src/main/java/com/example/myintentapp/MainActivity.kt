package com.example.myintentapp


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity



class MainActivity : ComponentActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithDataActivity: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithDataActivity.setOnClickListener(this)

        val btnDialPhone: Button = findViewById(R.id.btn_dial_number)
        btnDialPhone.setOnClickListener(this)

        val btnBioDataActivity: Button = findViewById(R.id.btn_biodata_activity)
        btnBioDataActivity.setOnClickListener(this)

        val imageViewBioData: ImageView = findViewById(R.id.imageView)

        imageViewBioData.setImageResource(R.drawable.test)
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
                R.id.btn_dial_number -> {
                    val phoneNumber = "0895808399100"
                    val dialPhoneIntent = Intent (Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                    startActivity(dialPhoneIntent)
                }
                R.id.btn_biodata_activity ->{
                    val biodataIntent = Intent(this@MainActivity,MoveWithBiodataActivity::class.java)


                    biodataIntent.putExtra(MoveWithBiodataActivity.EXTRA_NAME,"Bintang Satria Mulya Budi")
                    biodataIntent.putExtra(MoveWithBiodataActivity.EXTRA_AGE,16)
                    biodataIntent.putExtra(MoveWithBiodataActivity.EXTRA_SCH,"SMK Telkom Malang")
                    biodataIntent.putExtra(MoveWithBiodataActivity.EXTRA_ADDRE,"Jalan Danau Ranau Sawojajar 2 Mlang")
                    startActivity(biodataIntent)


                }
            }
        }
    }


}
