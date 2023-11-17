package com.example.tictactoe

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private val player1 = "X"
    private val player2 = "O"
    private var playersTurn = "Player $player1's turn"
    private var winnerIs = "Winner $player1!!!!"
    private var btnString1 = "1"
    private var btnString2 = "2"
    private var btnString3 = "3"
    private var btnString4 = "4"
    private var btnString5 = "5"
    private var btnString6 = "6"
    private var btnString7 = "7"
    private var btnString8 = "8"
    private var btnString9 = "9"

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
        clearGame(
            btn1,
            btn2,
            btn3,
            btn4,
            btn5,
            btn6,
            btn7,
            btn8,
            btn9,
            textView
        )

        //button one
        btn1.text = ""
        btn1.setOnClickListener {
            if (btn1.isClickable) {
                btn1.text = setButton()
                textView.text = playersTurn
                btnString1 = btn1.text.toString()
                if (checkWinner()) {
                    lockBoard(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)
                    textView.text = winnerIs
                }
                btn1.isClickable = false
            }
        }
        btn2.text = ""
        btn2.setOnClickListener {
            if (btn2.isClickable) {
                btn2.text = setButton()
                textView.text = playersTurn
                btnString2 = btn2.text.toString()
                if (checkWinner()) {
                    lockBoard(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)
                    textView.text = winnerIs
                }
                btn2.isClickable = false
            }
        }
        btn3.text = ""
        btn3.setOnClickListener {
            if (btn3.isClickable) {
                btn3.text = setButton()
                textView.text = playersTurn
                btnString3 = btn3.text.toString()
                if (checkWinner()) {
                    lockBoard(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)
                    textView.text = winnerIs
                }
                btn3.isClickable = false
            }
        }
        btn4.text = ""
        btn4.setOnClickListener {
            if (btn4.isClickable) {
                btn4.text = setButton()
                textView.text = playersTurn
                btnString4 = btn4.text.toString()
                if (checkWinner()) {
                    lockBoard(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)
                    textView.text = winnerIs
                }
                btn4.isClickable = false
            }
        }
        btn5.text = ""
        btn5.setOnClickListener {
            if (btn5.isClickable) {
                btn5.text = setButton()
                textView.text = playersTurn
                btnString5 = btn5.text.toString()
                if (checkWinner()) {
                    lockBoard(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)
                    textView.text = winnerIs
                }
                btn5.isClickable = false
            }
        }
        btn6.text = ""
        btn6.setOnClickListener {
            if (btn6.isClickable) {
                btn6.text = setButton()
                textView.text = playersTurn
                btnString6 = btn6.text.toString()
                if (checkWinner()) {
                    lockBoard(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)
                    textView.text = winnerIs
                }
                btn6.isClickable = false
            }
        }
        btn7.text = ""
        btn7.setOnClickListener {
            if (btn7.isClickable) {
                btn7.text = setButton()
                textView.text = playersTurn
                btnString7 = btn7.text.toString()
                if (checkWinner()) {
                    lockBoard(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)
                    textView.text = winnerIs
                }
                btn7.isClickable = false
            }
        }
        btn8.text = ""
        btn8.setOnClickListener {
            if (btn8.isClickable) {
                btn8.text = setButton()
                textView.text = playersTurn
                btnString8 = btn8.text.toString()
                if (checkWinner()) {
                    lockBoard(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)
                    textView.text = winnerIs
                }
                btn8.isClickable = false
            }
        }
        btn9.text = ""
        btn9.setOnClickListener {
            if (btn9.isClickable) {
                btn9.text = setButton()
                textView.text = playersTurn
                btnString9 = btn9.text.toString()
                if (checkWinner()) {
                    lockBoard(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)
                    textView.text = winnerIs
                }
                btn9.isClickable = false
            }
        }
        newGame.setOnClickListener {
            clearGame(
                btn1,
                btn2,
                btn3,
                btn4,
                btn5,
                btn6,
                btn7,
                btn8,
                btn9,
                textView
            )
        }

    }
    fun clearGame (btn1 : Button, btn2: Button, btn3 : Button, btn4: Button, btn5: Button,
                 btn6: Button, btn7: Button, btn8: Button, btn9: Button,
                 textView: TextView) {
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
        btnString1 = "1"
        btnString2 = "2"
        btnString3 = "3"
        btnString4 = "4"
        btnString5 = "5"
        btnString6 = "6"
        btnString7 = "7"
        btnString8 = "8"
        btnString9 = "9"
    }

    fun lockBoard(btn1 : Button, btn2: Button, btn3 : Button, btn4: Button, btn5: Button,
                  btn6: Button, btn7: Button, btn8: Button, btn9: Button) {
        btn1.isClickable = false
        btn2.isClickable = false
        btn3.isClickable = false
        btn4.isClickable = false
        btn5.isClickable = false
        btn6.isClickable = false
        btn7.isClickable = false
        btn8.isClickable = false
        btn8.isClickable = false
        btn9.isClickable = false
    }

    fun setButton(): String {
        if (playersTurn == "Player X's turn") {
            playersTurn = "Player $player2's turn"
            winnerIs = "Winner $player1!!!!"
            return player1
        }
        else {
            playersTurn = "Player $player1's turn"
            winnerIs = "Winner $player2!!!!"
            return player2
        }
    }
    fun checkWinner(): Boolean {

        //check 1,2,3
        if ((btnString1 == btnString2) && (btnString1 == btnString3)) {
            return true
        }
        //check 1,4,7
        if ((btnString1 == btnString4) && (btnString1 == btnString7)) {
            return true
        }
        //check 1,5,9
        if ((btnString1 == btnString5) && (btnString1 == btnString9)) {
            return true
        }
        //check 2,5,8
        if ((btnString2 == btnString5) && (btnString2 == btnString8)) {
            return true
        }
        //check 7,5,3
        if ((btnString7 == btnString5) && (btnString7 == btnString3)) {
            return true
        }
        //check 4,5,6
        if ((btnString4 == btnString5) && (btnString4 == btnString6)) {
            return true
        }
        //check 7,8,9
        if ((btnString7 == btnString8) && (btnString7 == btnString9)) {
            return true
        }

        return false
    }

}