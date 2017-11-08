package com.example.ganeshtikone.kotlincomponets

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast

class RecyclerViewActivity : AppCompatActivity(),OnRecyclerViewListener {

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

        val recyclerViewMonthAdapter = RecyclerViewMonthAdapter(this, this)
        recyclerViewMonth.adapter = recyclerViewMonthAdapter
    }

    /**
     * Callback function from OnRecyclerViewListener
     */
    override fun onRecycleItemClick(position: Int, month: String) {
        toast("Tapped at position - ${position} , Month - ${month}") // String concatenation example
    }

    /**
     * Extension function to show toast
     *
     */
    fun RecyclerViewActivity.toast(message:String){
        Toast.makeText(this@RecyclerViewActivity, // Equivalent to Java : RecyclerViewActivity.this
                message,
                Toast.LENGTH_SHORT).show()
    }

}
