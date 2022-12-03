package com.viel.mystory.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.viel.mystory.R
import com.viel.mystory.databinding.BookItemBinding
import com.viel.mystory.model.Book

class BookAdapter(
    private val books:List<Book>,
    private val callback:OnItemClick
) : RecyclerView.Adapter<BookAdapter.Viewholder>(){
    class Viewholder(private val binding:BookItemBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(book: Book){
            binding.imgItemBook.setImageResource(book.img)
            binding.tvItemNameBook.text = book.name
            binding.tvItemAuthorBook.text = book.author
            if (book.isLiked){
                binding.imgIsLike.setImageResource(R.drawable.ic_liked)
            }else{
                binding.imgIsLike.setImageResource(R.drawable.ic_not_like)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        return Viewholder(
            BookItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        books[position].let {
            holder.bind(it)
        }
        holder.itemView.setOnClickListener {
            callback.onClickItem(position)
        }
    }

    override fun getItemCount(): Int = books.size


}
