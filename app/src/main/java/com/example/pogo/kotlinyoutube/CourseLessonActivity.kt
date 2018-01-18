package com.example.pogo.kotlinyoutube

import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_course_lesson.*

/**
 * Created by pogo on 1/17/18.
 */

class CourseLessonActivity: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_lesson)

        val courseLink = intent.getStringExtra(CourseDetailActivity.CourseLessonViewHolder.COURSE_LESSON_LINK_KEY)
        view_course_lesson_webview.settings.javaScriptEnabled = true
        view_course_lesson_webview.settings.loadWithOverviewMode = true
        view_course_lesson_webview.settings.useWideViewPort = true
        println(courseLink)
        view_course_lesson_webview.loadUrl(courseLink)
    }


}