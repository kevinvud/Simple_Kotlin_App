package com.example.pogo.kotlinyoutube

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.video_row.view.*

/**
 * Created by pogo on 1/16/18.
 */

class MainAdapter: RecyclerView.Adapter<CustomeViewHolder>(){

    val videoTitles = listOf<String>("First", "Second", "3rd")

    override fun getItemCount(): Int {
        return videoTitles.size

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CustomeViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.video_row, parent, false )
        return CustomeViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomeViewHolder?, position: Int) {
        val videoTitles = videoTitles.get(position)
        holder?.view?.textView_video_title?.text = videoTitles
    }



}

class CustomeViewHolder(val view: View): RecyclerView.ViewHolder(view){



}