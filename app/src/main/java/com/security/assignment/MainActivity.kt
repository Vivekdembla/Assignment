package com.security.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.epoxy.EpoxyRecyclerView

class MainActivity : AppCompatActivity() {
    var data:ArrayList<String>?= ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecyclerView()
    }
    private fun setupRecyclerView(){
        val rvTask = findViewById<EpoxyRecyclerView>(R.id.rvTask)
        for (i in 0..50){
            data?.add("Item $i")
        }
        rvTask.withModels {
            data?.forEach {
                title {
                    id("title$it")
                    title(it)
                }
            }
        }
    }

}