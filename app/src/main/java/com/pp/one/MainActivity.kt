package com.pp.one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pp.putils.PUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("plq", "add: " + PUtils.add(1, 5));
    }
}