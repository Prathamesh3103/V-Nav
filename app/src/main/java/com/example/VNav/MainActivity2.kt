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
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity2 : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var searchView: SearchView
    private var mList = ArrayList<LanguageData>()
    private lateinit var adapter: LanguageAdapter


    @SuppressLint("MissingInflatedId", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button = findViewById<ImageView>(R.id.imageView)
        recyclerView = findViewById(R.id.recyclerView)
        searchView = findViewById(R.id.searchView)
        val recyclerView2 = findViewById<RecyclerView>(R.id.recyclerView2)
        val searchView2 = findViewById<SearchView>(R.id.searchView2)
        var source = ""
        var dest = ""

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        addDataToList()
        adapter = LanguageAdapter(mList)
        recyclerView.adapter = adapter

        recyclerView2.setHasFixedSize(true)
        recyclerView2.layoutManager = LinearLayoutManager(this)
        addDataToList()
        adapter = LanguageAdapter(mList)
        recyclerView2.adapter = adapter



        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                source = query?:""
                source.toLowerCase()
                recyclerView.isVisible = false
                searchView.clearFocus()
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                recyclerView.isVisible = true
                return true
            }


        })




        searchView2.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                dest = query?:""
                dest.toLowerCase()
                recyclerView2.isVisible = false
                searchView2.clearFocus()
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                recyclerView2.isVisible = true
                return true
            }

        })



        button.setOnClickListener{
            if (source=="" || dest==""){
                Toast.makeText(this, "Please enter source and destination", Toast.LENGTH_SHORT).show()
            }

            else if(dest=="gate 2") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                val close = popUpView.findViewById<ImageView>(R.id.close)
                imagee.setImageResource(R.drawable.scream)


                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }

            else if(dest=="a block") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.ablock)
                val close = popUpView.findViewById<ImageView>(R.id.close)

                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }

            else if(dest=="b block") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.bblock)
                val close = popUpView.findViewById<ImageView>(R.id.close)

                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }

            else if(dest=="c block") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.vlounge)
                val close = popUpView.findViewById<ImageView>(R.id.close)

                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }

            else if(dest=="d block") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.d105)
                val close = popUpView.findViewById<ImageView>(R.id.close)

                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }


            else if(dest=="e block") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.eblock)
                val close = popUpView.findViewById<ImageView>(R.id.close)

                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }


            else if(dest=="f block") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.fblock)
                val close = popUpView.findViewById<ImageView>(R.id.close)

                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }


            else if(dest=="g block") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.gblock)
                val close = popUpView.findViewById<ImageView>(R.id.close)

                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }

            else if(dest=="exam cell") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.bblock)
                val close = popUpView.findViewById<ImageView>(R.id.close)
                next.setOnClickListener{
                    imagee.setImageResource(R.drawable.examcell)
                }

                back.setOnClickListener{
                    imagee.setImageResource(R.drawable.bblock)
                }
                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }

            else if(dest=="biomedical department") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                var direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.bblock)
                val close = popUpView.findViewById<ImageView>(R.id.close)
                direction.text = "Move forward 50 mtrs from A block and go towards B block and the department is on left side after entering the block"
                next.setOnClickListener{
                    imagee.setImageResource(R.drawable.bio)
                    direction.text = null
                }

                back.setOnClickListener{
                    imagee.setImageResource(R.drawable.bblock)
                }

                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }


            else if(dest=="biomedical staffroom") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.bblock)
                val close = popUpView.findViewById<ImageView>(R.id.close)
                next.setOnClickListener{
                    imagee.setImageResource(R.drawable.bio)
                }

                back.setOnClickListener{
                    imagee.setImageResource(R.drawable.bblock)
                }

                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }

            else if(dest=="b105") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.bblock)
                val close = popUpView.findViewById<ImageView>(R.id.close)
                next.setOnClickListener{
                    imagee.setImageResource(R.drawable.b105)
                }

                back.setOnClickListener{
                    imagee.setImageResource(R.drawable.bblock)
                }

                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }

            else if(dest=="etrx department") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.fblock)
                val close = popUpView.findViewById<ImageView>(R.id.close)
                next.setOnClickListener{
                    imagee.setImageResource(R.drawable.etrxdep)
                }

                back.setOnClickListener{
                    imagee.setImageResource(R.drawable.fblock)
                }

                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }

            else if(dest=="v lounge") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.vlounge)
                val close = popUpView.findViewById<ImageView>(R.id.close)

                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }

            else if(dest=="cc01") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.gblock)
                val close = popUpView.findViewById<ImageView>(R.id.close)
                next.setOnClickListener{
                    imagee.setImageResource(R.drawable.cc)
                }

                back.setOnClickListener{
                    imagee.setImageResource(R.drawable.gblock)
                }

                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }

            else if(dest=="cc02") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.gblock)
                val close = popUpView.findViewById<ImageView>(R.id.close)
                next.setOnClickListener{
                    imagee.setImageResource(R.drawable.cc)
                }

                back.setOnClickListener{
                    imagee.setImageResource(R.drawable.gblock)
                }

                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }

            else if(dest=="cc03") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.gblock)
                val close = popUpView.findViewById<ImageView>(R.id.close)
                next.setOnClickListener{
                    imagee.setImageResource(R.drawable.cc)
                }

                back.setOnClickListener{
                    imagee.setImageResource(R.drawable.gblock)
                }

                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }


            else if(dest=="f101") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.fblock)
                val close = popUpView.findViewById<ImageView>(R.id.close)
                next.setOnClickListener{
                    imagee.setImageResource(R.drawable.f101)
                }

                back.setOnClickListener{
                    imagee.setImageResource(R.drawable.fblock)
                }

                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }

            else if(dest=="f102") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.fblock)
                val close = popUpView.findViewById<ImageView>(R.id.close)
                next.setOnClickListener{
                    imagee.setImageResource(R.drawable.f102)
                }

                back.setOnClickListener{
                    imagee.setImageResource(R.drawable.fblock)
                }

                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }


            else if(dest=="f105") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.fblock)
                val close = popUpView.findViewById<ImageView>(R.id.close)
                next.setOnClickListener{
                    imagee.setImageResource(R.drawable.f105)
                }

                back.setOnClickListener{
                    imagee.setImageResource(R.drawable.fblock)
                }

                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }


            else if(dest=="fe staffroom") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.scream)
                val close = popUpView.findViewById<ImageView>(R.id.close)
                next.setOnClickListener{
                    imagee.setImageResource(R.drawable.fefaculty)
                }

                back.setOnClickListener{
                    imagee.setImageResource(R.drawable.scream)
                }

                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }


            else if(dest=="fe department") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.scream)
                val close = popUpView.findViewById<ImageView>(R.id.close)
                next.setOnClickListener{
                    imagee.setImageResource(R.drawable.cc)
                }

                back.setOnClickListener{
                    imagee.setImageResource(R.drawable.scream)
                }

                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }


            else if(dest=="d105") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.scream)
                val close = popUpView.findViewById<ImageView>(R.id.close)
                next.setOnClickListener{
                    imagee.setImageResource(R.drawable.d105)
                }

                back.setOnClickListener{
                    imagee.setImageResource(R.drawable.scream)
                }

                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }


            else if(dest=="inft staffroom") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.eblock)
                val close = popUpView.findViewById<ImageView>(R.id.close)
                next.setOnClickListener{
                    imagee.setImageResource(R.drawable.stationaryandinftfaculty)
                }

                back.setOnClickListener{
                    imagee.setImageResource(R.drawable.eblock)
                }

                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }


            else if(dest=="inft department") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.eblock)
                val close = popUpView.findViewById<ImageView>(R.id.close)
                next.setOnClickListener{
                    imagee.setImageResource(R.drawable.inftdep)
                }

                back.setOnClickListener{
                    imagee.setImageResource(R.drawable.eblock)
                }



                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }


            else if(dest=="e101") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.eblock)
                val close = popUpView.findViewById<ImageView>(R.id.close)
                next.setOnClickListener{
                    imagee.setImageResource(R.drawable.e101)
                }

                back.setOnClickListener{
                    imagee.setImageResource(R.drawable.eblock)
                }

                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }


            else if(dest=="stationary") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.eblock)
                val close = popUpView.findViewById<ImageView>(R.id.close)
                next.setOnClickListener{
                    imagee.setImageResource(R.drawable.stationaryandinftfaculty)
                }

                back.setOnClickListener{
                    imagee.setImageResource(R.drawable.eblock)
                }
                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }


            else if(dest=="washroom for disabled") {


                val inflator = LayoutInflater.from(this)
                val popUpView = inflator.inflate(R.layout.imag, null, false)
                val imagee = popUpView.findViewById<ImageView>(R.id.img1)
                val direction = popUpView.findViewById<TextView>(R.id.textView3)
                val next = popUpView.findViewById<ImageView>(R.id.imageView11)
                val back = popUpView.findViewById<ImageView>(R.id.imageView12)
                imagee.setImageResource(R.drawable.gblock)
                val close = popUpView.findViewById<ImageView>(R.id.close)
                next.setOnClickListener{
                    imagee.setImageResource(R.drawable.disabled)
                }

                back.setOnClickListener{
                    imagee.setImageResource(R.drawable.gblock)
                }

                val builder = PopupWindow(
                    popUpView,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT, true
                )
                builder.setBackgroundDrawable(getDrawable(R.drawable.background1))
                builder.showAtLocation(this.findViewById(R.id.mainActivity2), Gravity.CENTER, 0, 0)

                close.setOnClickListener {
                    builder.dismiss()
                }
            }



            else{
                Toast.makeText(this, "Sorry Try again later", Toast.LENGTH_SHORT).show()
            }
        }



    }

    private fun filterList(query: String?) {

        if (query != null) {
            val filteredList = ArrayList<LanguageData>()
            for (i in mList) {
                if (i.title.lowercase(Locale.ROOT).contains(query)) {
                    filteredList.add(i)
                }
            }

            if (filteredList.isEmpty()) {
                Toast.makeText(this, "No Data found", Toast.LENGTH_SHORT).show()
            } else {
                adapter.setFilteredList(filteredList)
            }
        }
    }

    private fun addDataToList() {
        mList.add(LanguageData("Gate 1"))
        mList.add(LanguageData("Gate 2"))
        mList.add(LanguageData("A block"))
        mList.add(LanguageData("B block"))
        mList.add(LanguageData("C block" ))
        mList.add(LanguageData("D block"))
        mList.add(LanguageData("E block"))
        mList.add(LanguageData("F block"))
        mList.add(LanguageData("G block"))
        mList.add(LanguageData("Exam Cell"))
        mList.add(LanguageData("Biomedical Department"))
        mList.add(LanguageData("Biomedical Staffroom"))
        mList.add(LanguageData("B105"))
        mList.add(LanguageData("ETRX Department"))
        mList.add(LanguageData("V Lounge"))
        mList.add(LanguageData("CC01"))
        mList.add(LanguageData("CC02"))
        mList.add(LanguageData("CC03"))
        mList.add(LanguageData("F101"))
        mList.add(LanguageData("F102"))
        mList.add(LanguageData("F105"))
        mList.add(LanguageData("FE Staffroom"))
        mList.add(LanguageData("FE Department"))
        mList.add(LanguageData("D105"))
        mList.add(LanguageData("INFT Department"))
        mList.add(LanguageData("INFT Staffroom"))
        mList.add(LanguageData("Stationary"))
        mList.add(LanguageData("E101"))
        mList.add(LanguageData("Washroom for disabled"))
    }
}