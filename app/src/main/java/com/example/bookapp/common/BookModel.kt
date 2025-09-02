package com.example.bookapp.common

data class BookModel(
    val bookName : String = "",
    val bookAuthor : String = "",
    val bookUrl : String = "",
    val bookDescription : String ="",
    val category : String = "",
    val image : String = ""
)