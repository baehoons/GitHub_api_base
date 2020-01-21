package com.example.github_api.viewmodel

import android.app.Application
import android.content.Context
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.AndroidViewModel
import com.example.github_api.EnterActivity
import com.example.github_api.R
import kotlinx.android.synthetic.main.activity_main.*

class MainViewModel(application: Application):AndroidViewModel(application) {
    private val mApplication = application

    var context:Context = application
    private lateinit var mInput: TextView
    fun buttonClick() {
//        mApplication.sendBroadcast(Intent().apply {
//            putExtra("owner",mInput.text)
//        })
//        mInput = R.id.input
//        val intent = Intent(context, EnterActivity::class.java)
//        intent.putExtra("owner",input.text)
    }
}