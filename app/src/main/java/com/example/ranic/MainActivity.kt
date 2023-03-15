package com.example.ranic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Terong = findViewById<ImageButton>(R.id.Terong)
        val Wortel = findViewById<ImageButton>(R.id.Wortel)
        val Selada = findViewById<ImageButton>(R.id.Selada)
        val Bawang = findViewById<ImageButton>(R.id.bawang)
        val Cabai  = findViewById<ImageButton>(R.id.Cabai)
        val Tomat  = findViewById<ImageButton>(R.id.Tomat)
        Terong.setOnClickListener{
            val intent = Intent(this, TerongActivity::class.java)
            startActivity(intent)
        }
        Wortel.setOnClickListener{
            val intent = Intent(this, WortelActivity::class.java)
            startActivity(intent)
        }
        Selada.setOnClickListener {
            val intent = Intent(this, SeladaActivity::class.java)
            startActivity(intent)
        }
        Bawang.setOnClickListener {
            val intent = Intent(this, BawangActivity::class.java)
            startActivity(intent)
        }
      Cabai.setOnClickListener {
          val intent=Intent(this, CabaiActivity::class.java)
          startActivity(intent)
      }
        Tomat.setOnClickListener {
            val intent=Intent(this, TomatActivity::class.java)
            startActivity(intent)
        }
       }
        }
