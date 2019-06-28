package com.chhay.tablelayout_tiptoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var i=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            button1.isEnabled=false
            i++
            val pa:String="button1"
            if (i%2==1) player1(pa)
            else player2(pa)
        }
        button2.setOnClickListener {
            button2.isEnabled=false
            i++
            val pa:String="button2"
            if (i%2==1) player1(pa)
            else player2(pa)
        }
        button3.setOnClickListener {
            button3.isEnabled=false
            i++
            val pa:String="button3"
            if (i%2==1) player1(pa)
            else player2(pa)
        }
        button4.setOnClickListener {
            button4.isEnabled=false
            i++
            val pa:String="button4"

            if (i%2==1) player1(pa)
            else player2(pa)
        }
        button5.setOnClickListener {
            button5.isEnabled=false
            i++
            val pa:String="button5"
            if (i%2==1) player1(pa)
            else player2(pa)
        }
        button6.setOnClickListener {
            button6.isEnabled=false
            i++
            val pa:String="button6"
            if (i%2==1) player1(pa)
            else player2(pa)
        }
        button7.setOnClickListener {
            button7.isEnabled=false
            i++
            val pa:String="button7"
            if (i%2==1) player1(pa)
            else player2(pa)
        }
        button8.setOnClickListener {
            button8.isEnabled=false
            i++
            val pa:String="button8"
            if (i%2==1) player1(pa)
            else player2(pa)
        }
        button9.setOnClickListener {
            button9.isEnabled=false
            i++
            val pa:String="button9"
            if (i%2==1) player1(pa)
            else player2(pa)
        }
    }
    private fun player1(clickedButton:String)
    {

        when(clickedButton)
        {
            "button1"->{button1.text="o"}
            "button2"->{button2.text="o"}
            "button3"->{button3.text="o"}
            "button4"->{button4.text="o"}
            "button5"->{button5.text="o"}
            "button6"->{button6.text="o"}
            "button7"->{button7.text="o"}
            "button8"->{button8.text="o"}
            "button9"->{button9.text="o"}
        }
        check()
    }
    private fun player2(clickedButton:String)
    {
        when(clickedButton)
        {
            "button1"->{button1.text="x"}
            "button2"->{button2.text="x"}
            "button3"->{button3.text="x"}
            "button4"->{button4.text="x"}
            "button5"->{button5.text="x"}
            "button6"->{button6.text="x"}
            "button7"->{button7.text="x"}
            "button8"->{button8.text="x"}
            "button9"->{button9.text="x"}
        }
        check()

    }

    private fun check()
    {

        if (button1.text=="x"&&button2.text=="x"&&button3.text=="x"||button1.text=="x"&&button4.text=="x"&&button7.text=="x"||button1.text=="x"&&button5.text=="x"&&button9.text=="x"||button5.text=="x"&&button2.text=="x"&&button8.text=="x"||button3.text=="x"&&button6.text=="x"&&button9.text=="x"||button4.text=="x"&&button5.text=="x"&&button6.text=="x"||button7.text=="x"&&button8.text=="x"&&button9.text=="x"||button7.text=="x"&&button5.text=="x"&&button3.text=="x")
        {
            Toast.makeText(this,"Player 2 Win",Toast.LENGTH_LONG).show()

            button1.isEnabled=false
            button2.isEnabled=false
            button3.isEnabled=false
            button4.isEnabled=false
            button5.isEnabled=false
            button6.isEnabled=false
            button7.isEnabled=false
            button8.isEnabled=false
            button9.isEnabled=false
        }
        else if (button1.text=="o"&&button2.text=="o"&&button3.text=="o"||button1.text=="o"&&button4.text=="o"&&button7.text=="o"||button1.text=="o"&&button5.text=="o"&&button9.text=="o"||button5.text=="o"&&button2.text=="o"&&button8.text=="o"||button3.text=="o"&&button6.text=="o"&&button9.text=="o"||button4.text=="o"&&button5.text=="o"&&button6.text=="o"||button7.text=="o"&&button8.text=="o"&&button9.text=="o"||button7.text=="o"&&button5.text=="o"&&button3.text=="o")
        {
            Toast.makeText(this,"Player 1 Win",Toast.LENGTH_LONG).show()

            button1.isEnabled=false
            button2.isEnabled=false
            button3.isEnabled=false
            button4.isEnabled=false
            button5.isEnabled=false
            button6.isEnabled=false
            button7.isEnabled=false
            button8.isEnabled=false
            button9.isEnabled=false
        }

    }



}


