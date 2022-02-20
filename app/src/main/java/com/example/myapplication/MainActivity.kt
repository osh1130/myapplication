package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.widget.Button
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //关联activity的layout
        setContentView(R.layout.activity_main)
        //R.id.tv_title
        //android.R.id.content
        setListener()
    }

    private fun setListener() {
    //    ActivityMainBinding.
        val btn = findViewById<Button>(R.id.btn_go)
        //下面那个
        btn.setOnClickListener {

        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        //用户和设备交互
        super.onResume()
        //代码写这里
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}