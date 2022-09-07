package com.onmo.jetcomposer.samplegithubpub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.onmo.jetcomposer.samplegithubpub.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}