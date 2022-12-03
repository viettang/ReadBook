package com.viel.mystory.model

import android.widget.ImageView
import android.widget.TextView
import com.viel.mystory.R

object DeleteFilter {

    fun deleteFilter(text1: TextView, text2: TextView, text3: TextView,
                     text4: TextView, text5: TextView, string: TextView,
                     hisCategory:ImageView,techCategory:ImageView,
                     romCategory:ImageView,adCategory:ImageView,
                     stoCategory:ImageView,
                     arr:ArrayList<Category>){

        when(string.text){
            "Adventure" -> deleteAdventure(text1,text2,text3,text4,text5,string,adCategory,arr)
            "Technology" -> deleteTechnology(text1,text2,text3,text4,text5,string,techCategory,arr)
            "History" -> deleteHistory(text1,text2,text3,text4,text5,string,hisCategory,arr)
            "Romance" -> deleteRomance(text1,text2,text3,text4,text5,string,romCategory,arr)
            "Story" -> deleteStory(text1,text2,text3,text4,text5,string,stoCategory,arr)
        }
    }

    private fun bind(text1: TextView,
                     text2: TextView,
                     text3: TextView,
                     text4: TextView,
                     text5: TextView,
                     arr: ArrayList<Category>){
        if (arr.size == 0){
            text1.text = ""
            text1.setBackgroundResource(R.color.non_color)
        }else if (arr.size == 1){
            text2.text = ""
            text2.setBackgroundResource(R.color.non_color)
            text1.text = arr[0].nameCategory
            text1.setBackgroundResource(arr[0].imgCategory)
        }else if (arr.size == 2){
            text3.text = ""
            text3.setBackgroundResource(R.color.non_color)
            text1.text = arr[0].nameCategory
            text1.setBackgroundResource(arr[0].imgCategory)
            text2.text = arr[1].nameCategory
            text2.setBackgroundResource(arr[1].imgCategory)
        }else if (arr.size == 3){
            text4.text = ""
            text4.setBackgroundResource(R.color.non_color)
            text1.text = arr[0].nameCategory
            text1.setBackgroundResource(arr[0].imgCategory)
            text2.text = arr[1].nameCategory
            text2.setBackgroundResource(arr[1].imgCategory)
            text3.text = arr[2].nameCategory
            text3.setBackgroundResource(arr[2].imgCategory)
        }else if (arr.size == 4){
            text5.text = ""
            text5.setBackgroundResource(R.color.non_color)
            text1.text = arr[0].nameCategory
            text1.setBackgroundResource(arr[0].imgCategory)
            text2.text = arr[1].nameCategory
            text2.setBackgroundResource(arr[1].imgCategory)
            text3.text = arr[2].nameCategory
            text3.setBackgroundResource(arr[2].imgCategory)
            text4.text = arr[3].nameCategory
            text4.setBackgroundResource(arr[3].imgCategory)
        }
    }

    private fun deleteStory(
        text1: TextView,
        text2: TextView,
        text3: TextView,
        text4: TextView,
        text5: TextView,
        string: TextView,
        img: ImageView,
        arr: ArrayList<Category>
    ) {
        arr.remove(Category("Story",R.drawable.tag_story))
        img.setImageResource(R.drawable.story_circle)
        bind(text1,text2,text3,text4,text5,arr)
    }

    private fun deleteRomance(
        text1: TextView,
        text2: TextView,
        text3: TextView,
        text4: TextView,
        text5: TextView,
        string: TextView,
        img: ImageView,
        arr: ArrayList<Category>
    ) {
        arr.remove(Category("Romance",R.drawable.tag_romance))
        img.setImageResource(R.drawable.romance_circle)
        bind(text1,text2,text3,text4,text5,arr)
    }

    private fun deleteHistory(
        text1: TextView,
        text2: TextView,
        text3: TextView,
        text4: TextView,
        text5: TextView,
        string: TextView,
        img: ImageView,
        arr: ArrayList<Category>
    ) {
        arr.remove(Category("History",R.drawable.tag_history))
        img.setImageResource(R.drawable.history_circle)
        bind(text1,text2,text3,text4,text5,arr)
    }

    private fun deleteTechnology(
        text1: TextView,
        text2: TextView,
        text3: TextView,
        text4: TextView,
        text5: TextView,
        string: TextView,
        img: ImageView,
        arr: ArrayList<Category>
    ) {
        arr.remove(Category("Technology",R.drawable.tag_technology))
        img.setImageResource(R.drawable.technology_circle)
        bind(text1,text2,text3,text4,text5,arr)
    }

    private fun deleteAdventure(
        text1: TextView,
        text2: TextView,
        text3: TextView,
        text4: TextView,
        text5: TextView,
        string: TextView,
        img: ImageView,
        arr: ArrayList<Category>
    ) {
        arr.remove(Category("Adventure",R.drawable.tag_adventure))
        img.setImageResource(R.drawable.adventure_cicle)
        bind(text1,text2,text3,text4,text5,arr)
    }
}