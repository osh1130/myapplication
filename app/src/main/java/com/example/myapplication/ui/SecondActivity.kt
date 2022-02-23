package com.example.myapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.e("vivi","second onCreate")
    }
    override fun onStart() {
        super.onStart()
        Log.e("vivi","second onStart")
    }

    override fun onResume() {
        //用户和设备交互
        super.onResume()
        //代码写这里
        Log.e("vivi","second onResume")
    }

    override fun onPause() {
        super.onPause()
        //暂停
        Log.e("vivi","second onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("vivi","second onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("vivi","second onDestroy")
    }
}