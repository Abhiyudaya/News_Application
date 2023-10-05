package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var myRecyclerview : RecyclerView
    lateinit var newsArrayList: ArrayList<News>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecyclerview=findViewById(R.id.recycleView)

        val newsImageArray= arrayOf(R.drawable.img0,R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5)

        val newsHeadingArray = arrayOf("Slovakia elections: Populist party wins vote but needs allies for coalition",
            "Dianne Feinstein, 90, Dies; Oldest Sitting Senator and Fixture of California Politics",
            "White House warns of ‘unprecedented’ Serbian troop buildup on Kosovo border",
            "Azerbaijan is hungry for land’: Armenians fear country will seek to grab more territory",
            "'Squad' Dem Jamaal Bowman offers bizarre response after pulling fire alarm: 'open the door'",
            "Ferran Torres on fire and Marc-Andre ter Stegen on top as Barcelona get lucky in Porto")

            //To set 'haav bhaav' of items inside RecyclerView , vertically scrolling , horizontally , uniform grid
        myRecyclerview.layoutManager = LinearLayoutManager(this)
        newsArrayList= arrayListOf<News>()

        for(index in newsImageArray.indices){
            val news = News(newsHeadingArray[index],newsImageArray[index])
            newsArrayList.add(news)
        }

        myRecyclerview.adapter=MyAdapter(newsArrayList,this)
    }
}