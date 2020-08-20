package com.example.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val user = listOf(
            AndroidVersion(R.drawable.donut,"Donut"),
            AndroidVersion(R.drawable.eclair,"Eclair"),
            AndroidVersion(R.drawable.froyo,"Froyo"),
            AndroidVersion(R.drawable.gingerbread,"Gingerbread"),
            AndroidVersion(R.drawable.honeycomb,"Honeycomb"),
            AndroidVersion(R.drawable.icecream,"Ice cream"),
            AndroidVersion(R.drawable.jellybean,"Jellybean"),
            AndroidVersion(R.drawable.kitkat,"Kitkat"),
            AndroidVersion(R.drawable.lollipop,"Lollipop"),
            AndroidVersion(R.drawable.marshmallow,"Marshmallow"),
            AndroidVersion(R.drawable.nougat,"Nougat"),
            AndroidVersion(R.drawable.oreo,"Oreo"),
            AndroidVersion(R.drawable.pie,"Pie"),
            AndroidVersion(R.drawable.q,"Q"),
            AndroidVersion(R.drawable.r,"R")
        )

        rv_main.layoutManager = LinearLayoutManager(this)
        rv_main.adapter = AndroidVersionAdapter(user)
    }
}