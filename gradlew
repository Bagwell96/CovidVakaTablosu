package com.mertkavrayici.kotlincatchthekenny

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var score=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        object:CountDownTimer(20000,1000){
            override fun onFinish() {
                timeText.text="Time : 0"
                val alert=AlertDialog.Builder(this@MainActivity,)
                alert.setTitle("Game Over!")
                alert.setMessage("Restart  the Game")
                alert.setPositiveButton("Yes"){dialog, which ->

                }
                alert.setNegativeButton("No"){dialog, which ->
                    Toast.makeText(this@MainActivity,"Game Over".Toast.Le)
                }
            }

            override fun onTick(millisUntilFinished: Long) {
                timeText.text="Time:"+millisUntilFinished/1000
            }


        }.start()

    }

    fun increaseScore(view: View){

    score++
        scoreText.text="Score : "+score


    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                