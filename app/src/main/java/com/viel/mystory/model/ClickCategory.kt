package com.viel.mystory.model

import android.widget.TextView
import com.viel.mystory.R

object ClickCategory {
    fun clickCategory(text1:TextView,text2:TextView,text3:TextView,
                      text4:TextView,text5:TextView,string: String,img:Int,arr:ArrayList<Category>)
    {
        if (!arr.contains(Category(string,img))){
            when (string) {
                "History" -> arr.add(Category("History", R.drawable.tag_history))
                "Technology" -> arr.add(Category("Technology", R.drawable.tag_technology))
                "Romance" -> arr.add(Category("Romance", R.drawable.tag_romance))
                "Adventure" -> arr.add(Category("Adventure", R.drawable.tag_adventure))
                "Story" -> arr.add(Category("Story", R.drawable.tag_story))
            }
            when(arr.size){
                1 -> setText1(text1,arr)
                2 -> setText2(text2,arr)
                3 -> setText3(text3,arr)
                4 -> setText4(text4,arr)
                5 -> setText5(text5,arr)
            }
        }
    }

    private fun setText5(text5: TextView, arr: ArrayList<Category>) {
        text5.text = arr[4].nameCategory
        text5.setBackgroundResource(arr[4].imgCategory)

    }

    private fun setText4(text4: TextView, arr: ArrayList<Category>) {
        text4.text = arr[3].nameCategory
        text4.setBackgroundResource(arr[3].imgCategory)

    }

    private fun setText3(text3: TextView, arr: ArrayList<Category>) {
        text3.text = arr[2].nameCategory
        text3.setBackgroundResource(arr[2].imgCategory)

    }

    private fun setText2(text2: TextView, arr: ArrayList<Category>) {
        text2.text = arr[1].nameCategory
        text2.setBackgroundResource(arr[1].imgCategory)

    }

    private fun setText1(text1: TextView, arr: ArrayList<Category>) {
        text1.text = arr[0].nameCategory
        text1.setBackgroundResource(arr[0].imgCategory)
    }
}