package com.viel.mystory.model


data class Book(
    val id:Int = -1,
    val img:Int,
    val name:String,
    val author:String,
    val type:Array<String>,
    val isSaved:Boolean,
    val isLiked:Boolean,
    val populer:Int,
    val isSeen:Int
) {
    override fun equals(other: Any?): Boolean {
        val temp = other as Book
        return this.id == temp.id
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}
