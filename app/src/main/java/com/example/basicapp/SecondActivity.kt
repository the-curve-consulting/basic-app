package com.example.basicapp

import android.app.SearchManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        button2.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_WEB_SEARCH
            intent.putExtra(SearchManager.QUERY, editText.text.toString())
            startActivity(intent)
        }
    }
}
