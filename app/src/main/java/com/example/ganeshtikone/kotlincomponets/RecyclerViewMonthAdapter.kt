package com.example.ganeshtikone.kotlincomponets

import android.content.Context
import android.support.v7.widget.AppCompatTextView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by ganeshtikone on 7/11/17.
 * Adapter Class for RecyclerView
 */
class RecyclerViewMonthAdapter(context: Context) : RecyclerView.Adapter<RecyclerViewMonthAdapter.MonthViewHolder>() {

    private val mContext = context

    // Create String array of month
    val monthArray = arrayOf("January", "February", "March",
            "April", "May", "June", "July",
            "August", "September", "October",
            "November", "December")


    override fun onBindViewHolder(holder: MonthViewHolder?, position: Int) {
        holder?.adapterTextViewMonth?.text = monthArray[position]
    }

    override fun getItemCount(): Int {
        return monthArray.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MonthViewHolder {
        val itemView = LayoutInflater.from(mContext).inflate(R.layout.adapter_layout_month,parent,false)
        return MonthViewHolder(itemView)
    }

    /**
     * ViewHolder Class for RecyclerView
     */
    class MonthViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val adapterTextViewMonth:AppCompatTextView = itemView.findViewById(R.id.adapterTextViewMonth)
    }




}