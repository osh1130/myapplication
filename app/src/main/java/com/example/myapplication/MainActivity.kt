package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.renderscript.ScriptGroup
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.ui.SecondActivity
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var text = "hello world!"
    var num = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //if(savedInstanceState != null)

        savedInstanceState?.let {
             val newNum = savedInstanceState.getInt("num",0)
            num = newNum
         }
        //关联activity的layout
        setContentView(R.layout.activity_main)
        //R.id.tv_title
        //android.R.id.content
        setListener()
        //空安全 kotlin
        Log.e("vivi","main onCreate")

    }

    private fun setListener() {
        //    ActivityMainBinding.
        val btn = findViewById<Button>(R.id.btn_go)
        val tvTitle = findViewById<TextView>(R.id.tv_title)
        //下面那个
        tvTitle.text = num.toString()
        btn.setOnClickListener {
            //val intent = Intent("android.intent.action.SECOND")
            //startActivity(intent)
            //val intent = Intent(this@MainActivity,SecondActivity::class.java)
            //startActivity(intent)
            num ++
            //驼峰代替下划线
            tvTitle.text = num.toString()
        }



    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.e("vivi","main onSaveInstanceState")
        //bundle是key value形式，把东西放进来，再把bundle放入intent里
        outState.putInt("num",num)
    }


    override fun onRestart() {
        super.onRestart()
        Log.e("vivi","main onRestart")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.e("vivi","main onRestoreInstanceState")
        //val newNum = savedInstanceState.getInt("num",0)
        //num = newNum
    }

    override fun onStart() {
        super.onStart()
        Log.e("vivi","main onStart")
    }

    override fun onResume() {
        //用户和设备交互
        super.onResume()
        //代码写这里
        Log.e("vivi","main onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("vivi","main onPause")
    }

    override fun onStop() {
        super.onStop()
        //用户不可见
        Log.e("vivi","main onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("vivi","main onDestroy")
    }
}