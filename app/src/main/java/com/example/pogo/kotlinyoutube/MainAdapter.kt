package com.example.pogo.kotlinyoutube

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.video_row.view.*

/**
 * Created by pogo on 1/16/18.
 */

class MainAdapter(val homeFeed: HomeFeed): RecyclerView.Adapter<CustomeViewHolder>(){


    override fun getItemCount(): Int {
        return homeFeed.videos.count()

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CustomeViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.video_row, parent, false )
        return CustomeViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomeViewHolder?, position: Int) {
        val video = homeFeed.videos.get(position)
        holder?.view?.textView_video_title?.text = video.name
        holder?.view?.textView_channel_name?.text  = video.channel.name + " • " + "20K Views\n4 days ago"
        val thumbnailImageView = holder?.view?.imageView_video_thumbnail
        Picasso.with(holder?.view?.context).load(video.imageUrl).into(thumbnailImageView)
        val channelProfileImageView = holder?.view?.imageView_channel_thumbnail
        Picasso.with(holder?.view?.context).load(video.channel.profileImageUrl).into(channelProfileImageView)

    }
}

class CustomeViewHolder(val view: View): RecyclerView.ViewHolder(view){



}