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
        btn1.isClickable = true
        btn2.text = ""
        btn2.isClickable = true
        btn3.text = ""
        btn3.isClickable = true
        btn4.text = ""
        btn4.isClickable = true
        btn5.text = ""
        btn5.isClickable = true
        btn6.text = ""
        btn6.isClickable = true
        btn7.text = ""
        btn7.isClickable = true
        btn8.text = ""
        btn8.isClickable = true
        btn9.text = ""
        btn9.isClickable = true
        playersTurn = "Player $player1's turn"
        textView.setText(playersTurn)

        //button one
        btn1.text = ""
        btn1.setOnClickListener {
            if (btn1.isClickable) {
                btn1.setText(setButton())
                textView.setText(playersTurn)
                btn1.isClickable = false
            }
        }
        btn2.text = ""
        btn2.setOnClickListener {
            if (btn2.isClickable) {
                btn2.setText(setButton())
                textView.setText(playersTurn)
                btn2.isClickable = false
            }
        }
        btn3.text = ""
        btn3.setOnClickListener {
            if (btn3.isClickable) {
                btn3.setText(setButton())
                textView.setText(playersTurn)
                btn3.isClickable = false
            }
        }
        btn4.text = ""
        btn4.setOnClickListener {
            if (btn4.isClickable) {
                btn4.setText(setButton())
                textView.setText(playersTurn)
                btn4.isClickable = false
            }
        }
        btn5.text = ""
        btn5.setOnClickListener {
            if (btn5.isClickable) {
                btn5.setText(setButton())
                textView.setText(playersTurn)
                btn5.isClickable = false
            }
        }
        btn6.text = ""
        btn6.setOnClickListener {
            if (btn6.isClickable) {
                btn6.setText(setButton())
                textView.setText(playersTurn)
                btn6.isClickable = false
            }
        }
        btn7.text = ""
        btn7.setOnClickListener {
            if (btn7.isClickable) {
                btn7.setText(setButton())
                textView.setText(playersTurn)
                btn7.isClickable = false
            }
        }
        btn8.text = ""
        btn8.setOnClickListener {
            if (btn8.isClickable) {
                btn8.setText(setButton())
                textView.setText(playersTurn)
                btn8.isClickable = false
            }
        }
        btn9.text = ""
        btn9.setOnClickListener {
            if (btn9.isClickable) {
                btn9.setText(setButton())
                textView.setText(playersTurn)
                btn9.isClickable = false
            }
        }
        newGame.setOnClickListener {
            btn1.text = ""
            btn1.isClickable = true
            btn2.text = ""
            btn2.isClickable = true
            btn3.text = ""
            btn3.isClickable = true
            btn4.text = ""
            btn4.isClickable = true
            btn5.text = ""
            btn5.isClickable = true
            btn6.text = ""
            btn6.isClickable = true
            btn7.text = ""
            btn7.isClickable = true
            btn8.text = ""
            btn8.isClickable = true
            btn9.text = ""
            btn9.isClickable = true
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
    fun checkWinner(): Boolean {
        var winner = false

        //check 1,2,3
        //check 1,4,7
        //check 1,5,9
        //check 2,5,8
        //check 7,5,3
        //check 4,5,6
        //check 7,8,9

        return winner
    }

}