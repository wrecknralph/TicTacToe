package com.example.tictactoe

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    val player1 = "X"
    val player2 = "O"
    var playersTurn = "Player $player1's turn"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.button1)
        val btn2 = findViewById<Button>(R.id.button2)
        val btn3 = findViewById<Button>(R.id.button3)
        val btn4 = findViewById<Button>(R.id.button4)
        val btn5 = findViewById<Button>(R.id.button5)
        val btn6 = findViewById<Button>(R.id.button6)
        val btn7 = findViewById<Button>(R.id.button7)
        val btn8 = findViewById<Button>(R.id.button8)
        val btn9 = findViewById<Button>(R.id.button9)
        val newGame = findViewById<Button>(R.id.buttonNewGame)
        val textView = findViewById<TextView>(R.id.textView1)

        //start needs to setup new game
        btn1.text = ""
        btn2.text = ""
        btn3.text = ""
        btn4.text = ""
        btn5.text = ""
        btn6.text = ""
        btn7.text = ""
        btn8.text = ""
        btn9.text = ""
        playersTurn = "Player $player1's turn"
        textView.setText(playersTurn)

        //button one
        btn1.text = ""
        btn1.setOnClickListener {
            if (btn1.text == "") {
                btn1.setText(setButton())
                textView.setText(playersTurn)
            }
        }
        btn2.text = ""
        btn2.setOnClickListener {
            if (btn2.text == "") {
                btn2.setText(setButton())
                textView.setText(playersTurn)
            }
        }
        btn3.text = ""
        btn3.setOnClickListener {
            if (btn3.text == "") {
                btn3.setText(setButton())
                textView.setText(playersTurn)
            }
        }
        btn4.text = ""
        btn4.setOnClickListener {
            if (btn4.text == "") {
                btn4.setText(setButton())
                textView.setText(playersTurn)
            }
        }
        btn5.text = ""
        btn5.setOnClickListener {
            if (btn5.text == "") {
                btn5.setText(setButton())
                textView.setText(playersTurn)
            }
        }
        btn6.text = ""
        btn6.setOnClickListener {
            if (btn6.text == "") {
                btn6.setText(setButton())
                textView.setText(playersTurn)
            }
        }
        btn7.text = ""
        btn7.setOnClickListener {
            if (btn7.text == "") {
                btn7.setText(setButton())
                textView.setText(playersTurn)
            }
        }
        btn8.text = ""
        btn8.setOnClickListener {
            if (btn8.text == "") {
                btn8.setText(setButton())
                textView.setText(playersTurn)
            }
        }
        btn9.text = ""
        btn9.setOnClickListener {
            if (btn9.text == "") {
                btn9.setText(setButton())
                textView.setText(playersTurn)
            }
        }
        newGame.setOnClickListener {
            btn1.text = ""
            btn2.text = ""
            btn3.text = ""
            btn4.text = ""
            btn5.text = ""
            btn6.text = ""
            btn7.text = ""
            btn8.text = ""
            btn9.text = ""
            playersTurn = "Player $player1's turn"
            textView.setText(playersTurn)
        }

    }

    fun setButton(): String {
        if (playersTurn == "Player X's turn") {
            playersTurn = "Player $player2's turn"
            return player1
        }
        else {
            playersTurn = "Player $player1's turn"
            return player2
        }
    }

}