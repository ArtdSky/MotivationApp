package com.example.motivationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.motivationapp.adapter.ItemAdapter
import com.example.motivationapp.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataset = DataSource().loadAffirmation()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.adapter = ItemAdapter(this, dataset)
    }
}