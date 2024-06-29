package com.example.memeappwithconstraint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //tells android studio that this layout file belongs to this activity
        Log.d("loglog9","onCreate Created")

    }

    override fun onPause() {
        super.onPause()
        Log.d("loglog1","OnPause Created")
    }

    override fun onResume() {
        super.onResume()
        Log.d("loglog2","onResume Created")
    }

    override fun onStart() {

        super.onStart()
        Log.d("loglog3","onStart Created")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("loglog4","onRestart Created")
    }

    override fun onStop() {
        super.onStop()
        Log.d("loglog5","onStop Created")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("loglog6", "ONDestroy Created")
    }

}