package com.viel.mystory.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.viel.mystory.ContentActivity
import com.viel.mystory.R
import com.viel.mystory.adapter.BookAdapter
import com.viel.mystory.adapter.OnItemClick
import com.viel.mystory.adapter.SearchAdapter
import com.viel.mystory.databinding.FragmentHomeBinding
import com.viel.mystory.model.Book
import com.viel.mystory.model.Category
import com.viel.mystory.model.ClickCategory
import com.viel.mystory.model.DeleteFilter
import kotlin.collections.ArrayList

class HomeFragment: Fragment(),OnItemClick{

    private lateinit var binding:FragmentHomeBinding
    private lateinit var adapter: BookAdapter
    private val listBook = ArrayList<Book>()
    private val listCategory = ArrayList<Category>()
    private lateinit var adapterSearch:SearchAdapter
    private val listSearch = ArrayList<Book>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        initBook()
        adapter = BookAdapter(listBook,this)
        listSearch.addAll(listBook)
        adapterSearch = SearchAdapter(requireContext(),R.layout.search_book,listSearch)
        binding.rvListBookFilter.adapter = adapter
        binding.rvListBookFilter.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.HORIZONTAL,false)

        binding.actSearchBook.setAdapter(adapterSearch)
        binding.actSearchBook.setOnItemClickListener { parent, view, position, id ->
            val itemSelect =  parent.getItemAtPosition(position) as Book
            var itemId = itemSelect.name
            Toast.makeText(requireContext(),"position $itemId",Toast.LENGTH_SHORT).show()
        }

        binding.imvAdventure.setOnClickListener {
            onClickImvAdventure()
        }
        binding.imvHistory.setOnClickListener {
            onClickImvHistory()
        }

        binding.imvRomance.setOnClickListener {
            onClickImvRomance()
        }

        binding.imvStory.setOnClickListener {
            onClickImvStory()
        }

        binding.imvTechnology.setOnClickListener {
            onClickImvTechnology()
        }

        binding.tvFilter1.setOnClickListener {
            onDeleteFilter1()
        }

        binding.tvFilter2.setOnClickListener {
            onDeleteFilter2()
        }

        binding.tvFilter3.setOnClickListener {
            onDeleteFilter3()
        }

        binding.tvFilter4.setOnClickListener {
            onDeleteFilter4()
        }

        binding.tvFilter5.setOnClickListener {
            onDeleteFilter5()
        }


        return binding.root
    }

    private fun onDeleteFilter5() {
        DeleteFilter.deleteFilter(binding.tvFilter1,binding.tvFilter2,binding.tvFilter3,binding.tvFilter4,
            binding.tvFilter5,binding.tvFilter5,binding.imvHistory,binding.imvTechnology,binding.imvRomance,
            binding.imvAdventure,binding.imvStory,listCategory)
    }

    private fun onDeleteFilter4() {
        DeleteFilter.deleteFilter(binding.tvFilter1,binding.tvFilter2,binding.tvFilter3,binding.tvFilter4,
            binding.tvFilter5,binding.tvFilter4,binding.imvHistory,binding.imvTechnology,binding.imvRomance,
            binding.imvAdventure,binding.imvStory,listCategory)
    }

    private fun onDeleteFilter3() {
        DeleteFilter.deleteFilter(binding.tvFilter1,binding.tvFilter2,binding.tvFilter3,binding.tvFilter4,
            binding.tvFilter5,binding.tvFilter3,binding.imvHistory,binding.imvTechnology,binding.imvRomance,
            binding.imvAdventure,binding.imvStory,listCategory)
    }

    private fun onDeleteFilter2() {
        DeleteFilter.deleteFilter(binding.tvFilter1,binding.tvFilter2,binding.tvFilter3,binding.tvFilter4,
            binding.tvFilter5,binding.tvFilter2,binding.imvHistory,binding.imvTechnology,binding.imvRomance,
            binding.imvAdventure,binding.imvStory,listCategory)
    }

    private fun onDeleteFilter1() {
        DeleteFilter.deleteFilter(binding.tvFilter1,binding.tvFilter2,binding.tvFilter3,binding.tvFilter4,
            binding.tvFilter5,binding.tvFilter1,binding.imvHistory,binding.imvTechnology,binding.imvRomance,
            binding.imvAdventure,binding.imvStory,listCategory)
    }

    private fun onClickImvTechnology() {
        ClickCategory.clickCategory(binding.tvFilter1,binding.tvFilter2,binding.tvFilter3,
            binding.tvFilter4,binding.tvFilter5,"Technology",R.drawable.tag_technology,listCategory)
        binding.imvTechnology.setImageResource(R.drawable.technology_circle_black)
    }

    private fun onClickImvStory() {
        ClickCategory.clickCategory(binding.tvFilter1,binding.tvFilter2,binding.tvFilter3,
            binding.tvFilter4,binding.tvFilter5,"Story",R.drawable.tag_story,listCategory)
        binding.imvStory.setImageResource(R.drawable.story_circle_black)
    }

    private fun onClickImvRomance() {
        ClickCategory.clickCategory(binding.tvFilter1,binding.tvFilter2,binding.tvFilter3,
            binding.tvFilter4,binding.tvFilter5,"Romance",R.drawable.tag_romance,listCategory)
        binding.imvRomance.setImageResource(R.drawable.romance_circle_black)
    }

    private fun onClickImvHistory() {
        ClickCategory.clickCategory(binding.tvFilter1,binding.tvFilter2,binding.tvFilter3,
            binding.tvFilter4,binding.tvFilter5,"History",R.drawable.tag_history,listCategory)
        binding.imvHistory.setImageResource(R.drawable.history_circle_black)
    }

    private fun onClickImvAdventure() {
        ClickCategory.clickCategory(binding.tvFilter1,binding.tvFilter2,binding.tvFilter3,
            binding.tvFilter4,binding.tvFilter5,"Adventure",R.drawable.tag_adventure,listCategory)
        binding.imvAdventure.setImageResource(R.drawable.adventure_cicle_black)
    }

    private fun initBook() {
        listBook.add(Book(img = R.drawable.python, name = "Python", author = "vietpro", isLiked = true,
        isSaved = true, isSeen = 0, type = arrayOf("Technology"), populer = 1))
        listBook.add(Book(img = R.drawable.book1, name = "flower | sebastian stan", author = "goldenbuckybarnes", isLiked = false,
        isSaved = true, isSeen = 0, type = arrayOf("Adventure"), populer = 1))
        listBook.add(Book(img = R.drawable.book2, name = "golden hour", author = "ynamoreata", isLiked = false,
        isSaved = true, isSeen = 0, type = arrayOf("Adventure"), populer = 1))
        listBook.add(Book(img = R.drawable.between_abyss, name = "Between Abyss", author = "malayafics", isLiked = true,
        isSaved = true, isSeen = 0, type = arrayOf("Adventure"), populer = 1))
        listBook.add(Book(img = R.drawable.between_abyss, name = "Between Abyss", author = "malayafics", isLiked = true,
        isSaved = true, isSeen = 0, type = arrayOf("adventure"), populer = 1))
        listBook.add(Book(img = R.drawable.between_abyss, name = "Between Abyss", author = "malayafics", isLiked = true,
        isSaved = true, isSeen = 0, type = arrayOf("adventure"), populer = 1))
        listBook.add(Book(img = R.drawable.between_abyss, name = "Between Abyss", author = "malayafics", isLiked = true,
        isSaved = true, isSeen = 0, type = arrayOf("adventure"), populer = 1))
        listBook.add(Book(img = R.drawable.between_abyss, name = "Between Abyss", author = "malayafics", isLiked = true,
        isSaved = true, isSeen = 0, type = arrayOf("adventure"), populer = 1))
        listBook.add(Book(img = R.drawable.between_abyss, name = "Between Abyss", author = "malayafics", isLiked = true,
        isSaved = true, isSeen = 0, type = arrayOf("adventure"), populer = 1))

    }

    override fun onClickItem(position: Int) {
        val intent = Intent(context,ContentActivity::class.java)
        if (position == 0){
            startActivity(intent)
        }
    }
}