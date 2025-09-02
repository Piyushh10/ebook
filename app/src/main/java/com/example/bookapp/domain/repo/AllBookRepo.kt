package com.example.bookapp.domain.repo

import com.example.bookapp.common.BookCategoryModel
import com.example.bookapp.common.BookModel
import com.example.bookapp.common.ResultState
import kotlinx.coroutines.flow.Flow

interface AllBookRepo {
    //we used flow to disperse data stream(multiple data)
    //Result state is used to show the result when we fetch all books
    //we have given it the type BookModel since we will get list of books
    fun getAllBooks(): Flow<ResultState<List<BookModel>>>


    //exactly same for this too
    fun getAllCategory() : Flow<ResultState<List<BookCategoryModel>>>


    fun getAllBooksByCategory(category : String): Flow<ResultState<List<BookModel>>>







}