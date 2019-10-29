package com.ctnphrae.week2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ซ่อน Title bar
        supportActionBar?.hide()

        //การดักจับ event onclick button
        btn_phrae.setOnClickListener(View.OnClickListener {

            img_province.setImageDrawable(getDrawable(R.drawable.phrae_img))
            tv_header.setText("จังหวัด "+getString(R.string.btn_phrae))
            tv_content.setText(getString(R.string.content_ph))
            Toast.makeText(this,"ยินดีต้อนรับสู่จังหวัด"+getString(R.string.btn_phrae),Toast.LENGTH_LONG).show()


        })

        //การดักจับ event onclick button
        btn_cm.setOnClickListener(View.OnClickListener {

            img_province.setImageDrawable(getDrawable(R.drawable.chiangmai_img))
            tv_header.setText("จังหวัด "+getString(R.string.btn_chaingmai))
            tv_content.setText(getString(R.string.content_cm))
            Toast.makeText(this,"ยินดีต้อนรับสู่จังหวัด"+getString(R.string.btn_chaingmai),Toast.LENGTH_LONG).show()
        })

        //การดักจับ event onclick button
        btn_cr.setOnClickListener(View.OnClickListener {

            img_province.setImageDrawable(getDrawable(R.drawable.chaingrai_img))
            tv_header.setText("จังหวัด "+getString(R.string.btn_chaingrai))
            tv_content.setText(getString(R.string.content_cr))
            Toast.makeText(this,"ยินดีต้อนรับสู่จังหวัด"+getString(R.string.btn_chaingrai),Toast.LENGTH_LONG).show()

        })

    }
}
