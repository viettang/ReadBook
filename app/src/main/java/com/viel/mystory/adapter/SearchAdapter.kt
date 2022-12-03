package com.viel.mystory.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Filter
import android.widget.ImageView
import android.widget.TextView
import com.viel.mystory.R
import com.viel.mystory.databinding.SearchBookBinding
import com.viel.mystory.model.Book

class SearchAdapter(context: Context, resource: Int, objects: MutableList<Book>) :
    ArrayAdapter<Book>(context, resource, objects) {

    private lateinit var listBook:List<Book>
    private lateinit var binding:SearchBookBinding

    init {
        listBook = ArrayList<Book>(objects)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        binding = SearchBookBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        val view = if (convertView == null){
            binding.root
        } else {
            convertView
        }
        val book = getItem(position)
        binding.imgSearchFilter.setImageResource(book!!.img)
        binding.tvSeachAuthor.text = book.author
        binding.tvNameFilter.text = book.name
        return view
    }

    override fun getFilter(): Filter {
        return object : Filter(){
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val mlistSuggeat = ArrayList<Book>()
                if (constraint == null || constraint.isEmpty()){
                    mlistSuggeat.addAll(listBook)
                }else{
                    val filter = constraint.toString().lowercase().trim()
                    listBook.forEach {
                        if (it.name.lowercase().contains(filter))
                            mlistSuggeat.add(it)
                    }
                }
                val filterResult = FilterResults()
                filterResult.values = mlistSuggeat
                filterResult.count = mlistSuggeat.size
                return filterResult
            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                clear()
                addAll(results?.values as List<Book>)
                notifyDataSetInvalidated()
            }

            override fun convertResultToString(resultValue: Any?): CharSequence {
                return (resultValue as Book).name
            }
        }
    }
}

