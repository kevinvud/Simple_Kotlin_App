package com.example.pogo.kotlinyoutube

/**
 * Created by pogo on 1/16/18.
 */
class HomeFeed(val videos: List<Video>)

class Video(val id: Int, val name: String, val link: String, val imageUrl: String, val numberOfViews: Int, val channel: Channel)

class Channel(val name: String, val profileImageUrl: String)