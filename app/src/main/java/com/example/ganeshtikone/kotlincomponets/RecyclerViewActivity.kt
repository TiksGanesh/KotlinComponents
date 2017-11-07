package com.example.ganeshtikone.kotlincomponets

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        setUpRecyclerView()
    }

    /**
     * Setup RecyclerView
     */
    private fun setUpRecyclerView() {
        val recyclerViewMonth:RecyclerView = findViewById(R.id.recyclerViewMonth);
        recyclerViewMonth.layoutManager = LinearLayoutManager(this)
        recyclerViewMonth.setHasFixedSize(true)

        val recyclerViewMonthAdapter = RecyclerViewMonthAdapter(this)
        recyclerViewMonth.adapter = recyclerViewMonthAdapter
    }
}
