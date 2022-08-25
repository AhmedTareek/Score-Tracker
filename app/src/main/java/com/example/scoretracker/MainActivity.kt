package com.example.scoretracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val teamAScore = findViewById<TextView>(R.id.aTeamScore)
        val teamBScore = findViewById<TextView>(R.id.bTeamScore)
        val a2Points = findViewById<Button>(R.id.a2Points)
        val b2Points = findViewById<Button>(R.id.b2Points)
        val a3Points = findViewById<Button>(R.id.a3Points)
        val b3Points = findViewById<Button>(R.id.b3Points)
        val aFreeThrow = findViewById<Button>(R.id.aFreeThrow)
        val bFreeThrow = findViewById<Button>(R.id.bFreeThrow)
        val reset =  findViewById<Button>(R.id.reset)
        aFreeThrow.setOnClickListener {
            editScore(teamAScore,1)
        }
        bFreeThrow.setOnClickListener {
            editScore(teamBScore,1)
        }
        reset.setOnClickListener {
            editScore(teamAScore,0,true)
            editScore(teamBScore,0,true)
        }
        a3Points.setOnClickListener {
            editScore(teamAScore,3)
        }
        b3Points.setOnClickListener {
            editScore(teamBScore,3)
        }
        a2Points.setOnClickListener{
            editScore(teamAScore,2)
        }
        b2Points.setOnClickListener {
            editScore(teamBScore,2)
        }


    }
    private fun editScore(textView: TextView, value: Int, reset: Boolean = false){

        if(reset){
            textView.text = "0"
            return
        }
        var score = textView.text.toString().toInt()
        score+=value
        textView.text = score.toString()
    }

}