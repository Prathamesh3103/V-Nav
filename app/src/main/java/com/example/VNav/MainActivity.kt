package com.example.VNav

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.PopupWindow
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val m1 = findViewById<CardView>(R.id.card1)
        val m2 = findViewById<CardView>(R.id.card2)
        val m3 = findViewById<CardView>(R.id.card3)
        val m4 = findViewById<CardView>(R.id.card4)
        val m5 = findViewById<CardView>(R.id.card5)
        val m6 = findViewById<CardView>(R.id.card6)
        val m7 = findViewById<CardView>(R.id.card7)
        val m8 = findViewById<CardView>(R.id.card8)
        val m9 = findViewById<CardView>(R.id.card9)
        m1.setOnClickListener{
            val inflator = LayoutInflater.from(this)
            val popUpView = inflator.inflate(R.layout.imag,null,false)
            val imagee = popUpView.findViewById<ImageView>(R.id.img1)
            val next = popUpView.findViewById<ImageView>(R.id.imageView11)
            val back = popUpView.findViewById<ImageView>(R.id.imageView12)
            next.isVisible = false
            back.isVisible = false
            val text = popUpView.findViewById<TextView>(R.id.textView3)
            imagee.setImageResource(R.drawable.map1)
            val close = popUpView.findViewById<ImageView>(R.id.close)

            val builder = PopupWindow(popUpView,
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT,true)
            builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
            builder.showAtLocation(this.findViewById(R.id.frameLayout1), Gravity.CENTER,0,0)
            text.setText(null)

            close.setOnClickListener{
                builder.dismiss()
            }


        }

        m2.setOnClickListener{
            val inflator = LayoutInflater.from(this)
            val popUpView = inflator.inflate(R.layout.imag,null,false)
            val imagee = popUpView.findViewById<ImageView>(R.id.img1)
            imagee.setImageResource(R.drawable.floor2)
            val close = popUpView.findViewById<ImageView>(R.id.close)
            val text = popUpView.findViewById<TextView>(R.id.textView3)
            val next = popUpView.findViewById<ImageView>(R.id.imageView11)
            val back = popUpView.findViewById<ImageView>(R.id.imageView12)
            next.isVisible = false
            back.isVisible = false
            val builder = PopupWindow(popUpView,
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT,true)
            builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
            builder.showAtLocation(this.findViewById(R.id.frameLayout1), Gravity.CENTER,0,0)
            text.setText(null)

            close.setOnClickListener{
                builder.dismiss()
            }


        }

        m3.setOnClickListener{
            val inflator = LayoutInflater.from(this)
            val popUpView = inflator.inflate(R.layout.imag,null,false)
            val imagee = popUpView.findViewById<ImageView>(R.id.img1)
            imagee.setImageResource(R.drawable.floor3)
            val close = popUpView.findViewById<ImageView>(R.id.close)
            val text = popUpView.findViewById<TextView>(R.id.textView3)
            val next = popUpView.findViewById<ImageView>(R.id.imageView11)
            val back = popUpView.findViewById<ImageView>(R.id.imageView12)
            next.isVisible = false
            back.isVisible = false

            val builder = PopupWindow(popUpView,
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT,true)
            builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
            builder.showAtLocation(this.findViewById(R.id.frameLayout1), Gravity.CENTER,0,0)
            text.setText(null)

            close.setOnClickListener{
                builder.dismiss()
            }


        }

        m4.setOnClickListener{
            val inflator = LayoutInflater.from(this)
            val popUpView = inflator.inflate(R.layout.imag,null,false)
            val imagee = popUpView.findViewById<ImageView>(R.id.img1)
            imagee.setImageResource(R.drawable.floor4)
            val close = popUpView.findViewById<ImageView>(R.id.close)
            val text = popUpView.findViewById<TextView>(R.id.textView3)
            val next = popUpView.findViewById<ImageView>(R.id.imageView11)
            val back = popUpView.findViewById<ImageView>(R.id.imageView12)
            next.isVisible = false
            back.isVisible = false

            val builder = PopupWindow(popUpView,
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT,true)
            builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
            builder.showAtLocation(this.findViewById(R.id.frameLayout1), Gravity.CENTER,0,0)
            text.setText(null)

            close.setOnClickListener{
                builder.dismiss()
            }


        }

        m5.setOnClickListener{
            val inflator = LayoutInflater.from(this)
            val popUpView = inflator.inflate(R.layout.imag,null,false)
            val imagee = popUpView.findViewById<ImageView>(R.id.img1)
            imagee.setImageResource(R.drawable.floor5)
            val close = popUpView.findViewById<ImageView>(R.id.close)
            val text = popUpView.findViewById<TextView>(R.id.textView3)
            val next = popUpView.findViewById<ImageView>(R.id.imageView11)
            val back = popUpView.findViewById<ImageView>(R.id.imageView12)
            next.isVisible = false
            back.isVisible = false

            val builder = PopupWindow(popUpView,
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT,true)
            builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
            builder.showAtLocation(this.findViewById(R.id.frameLayout1), Gravity.CENTER,0,0)
            text.setText(null)

            close.setOnClickListener{
                builder.dismiss()
            }


        }

        m6.setOnClickListener{
            val inflator = LayoutInflater.from(this)
            val popUpView = inflator.inflate(R.layout.imag,null,false)
            val imagee = popUpView.findViewById<ImageView>(R.id.img1)
            imagee.setImageResource(R.drawable.floor6)
            val close = popUpView.findViewById<ImageView>(R.id.close)
            val text = popUpView.findViewById<TextView>(R.id.textView3)
            val next = popUpView.findViewById<ImageView>(R.id.imageView11)
            val back = popUpView.findViewById<ImageView>(R.id.imageView12)
            next.isVisible = false
            back.isVisible = false

            val builder = PopupWindow(popUpView,
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT,true)
            builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
            builder.showAtLocation(this.findViewById(R.id.frameLayout1), Gravity.CENTER,0,0)
            text.setText(null)

            close.setOnClickListener{
                builder.dismiss()
            }


        }

        m7.setOnClickListener{
            val inflator = LayoutInflater.from(this)
            val popUpView = inflator.inflate(R.layout.imag,null,false)
            val imagee = popUpView.findViewById<ImageView>(R.id.img1)
            imagee.setImageResource(R.drawable.floor7)
            val close = popUpView.findViewById<ImageView>(R.id.close)
            val text = popUpView.findViewById<TextView>(R.id.textView3)
            val next = popUpView.findViewById<ImageView>(R.id.imageView11)
            val back = popUpView.findViewById<ImageView>(R.id.imageView12)
            next.isVisible = false
            back.isVisible = false

            val builder = PopupWindow(popUpView,
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT,true)
            builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
            builder.showAtLocation(this.findViewById(R.id.frameLayout1), Gravity.CENTER,0,0)
            text.setText(null)

            close.setOnClickListener{
                builder.dismiss()
            }


        }

        m8.setOnClickListener{
            val inflator = LayoutInflater.from(this)
            val popUpView = inflator.inflate(R.layout.imag,null,false)
            val imagee = popUpView.findViewById<ImageView>(R.id.img1)
            val next = popUpView.findViewById<ImageView>(R.id.imageView11)
            val back = popUpView.findViewById<ImageView>(R.id.imageView12)
            next.isVisible = false
            back.isVisible = false
            val text = popUpView.findViewById<TextView>(R.id.textView3)
            imagee.setImageResource(R.drawable.mfloor1)
            val close = popUpView.findViewById<ImageView>(R.id.close)

            val builder = PopupWindow(popUpView,
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT,true)
            builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
            builder.showAtLocation(this.findViewById(R.id.frameLayout1), Gravity.CENTER,0,0)
            text.setText(null)

            close.setOnClickListener{
                builder.dismiss()
            }


        }


        m9.setOnClickListener{
            val inflator = LayoutInflater.from(this)
            val popUpView = inflator.inflate(R.layout.imag,null,false)
            val imagee = popUpView.findViewById<ImageView>(R.id.img1)
            val next = popUpView.findViewById<ImageView>(R.id.imageView11)
            val back = popUpView.findViewById<ImageView>(R.id.imageView12)
            next.isVisible = false
            back.isVisible = false
            val text = popUpView.findViewById<TextView>(R.id.textView3)
            imagee.setImageResource(R.drawable.floor0)
            val close = popUpView.findViewById<ImageView>(R.id.close)

            val builder = PopupWindow(popUpView,
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT,true)
            builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
            builder.showAtLocation(this.findViewById(R.id.frameLayout1), Gravity.CENTER,0,0)
            text.setText(null)

            close.setOnClickListener{
                builder.dismiss()
            }


        }
    }
}