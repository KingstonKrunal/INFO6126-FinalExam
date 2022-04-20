package com.example.krunalshah.krunalshahfinalexam

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text
import java.util.*


class HomeActivity : AppCompatActivity() {

    private lateinit var rollButton: Button
    private lateinit var image1: ImageView
    private lateinit var image2: ImageView
    private lateinit var text1: TextView
    private lateinit var text2: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        text1 = findViewById(R.id.textOne)
        text2 = findViewById(R.id.textTwo)
        image1 = findViewById(R.id.imageOne)
        image2 = findViewById(R.id.imageTwo)

        rollButton = findViewById(R.id.rollButton)
        rollButton.setOnClickListener {

            val min = 1
            val max = 6
            val random1: Int = Random().nextInt(max - min + 1) + min
            val random2: Int = Random().nextInt(max - min + 1) + min

            text1.setText(random1.toString())
            text2.setText(random2.toString())

            when (random1) {
                1->image1.setImageResource(R.drawable.dice1)
                2->image1.setImageResource(R.drawable.dice2)
                3->image1.setImageResource(R.drawable.dice3)
                4->image1.setImageResource(R.drawable.dice4)
                5->image1.setImageResource(R.drawable.dice5)
                6->image1.setImageResource(R.drawable.dice6)
            }

            when (random2) {
                1->image2.setImageResource(R.drawable.dice1)
                2->image2.setImageResource(R.drawable.dice2)
                3->image2.setImageResource(R.drawable.dice3)
                4->image2.setImageResource(R.drawable.dice4)
                5->image2.setImageResource(R.drawable.dice5)
                6->image2.setImageResource(R.drawable.dice6)
            }
        }
    }
}