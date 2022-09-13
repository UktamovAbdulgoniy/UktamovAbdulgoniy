package com.example.movieapp.database

import com.example.movieapp.model.Movie

interface DataBaseService {
    fun addMovie(movie: Movie)
    fun deleteMovie(movie: Movie)
    fun getAllMovies():List<Movie>
    fun editContact(movie: Movie)
    fun getMovieById(id:Int):Movie

}