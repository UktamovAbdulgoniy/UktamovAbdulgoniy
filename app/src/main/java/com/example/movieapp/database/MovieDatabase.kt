package com.example.movieapp.database

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.movieapp.model.Movie
import com.example.movieapp.util.Constants

class MovieDatabase(context: Context):SQLiteOpenHelper(context,Constants.DB_NAME,null,Constants.DB_VERSION),DataBaseService {
    override fun onCreate(db: SQLiteDatabase?) {
        val query ="CREATE TABLE ${Constants.TABLE_NAME}(${Constants.ID}INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,${Constants.NAME} TEXT NOT NULL,${Constants.AUTHORS} NOT NULL,${Constants.ABOUT} TEXT NOT NULL,${Constants.DATE} TEXT NOT NULL)"
        db?.execSQL(query)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP  TABLE IF EXISTS ${Constants.TABLE_NAME}")
        onCreate(db)
    }

    override fun addMovie(movie: Movie) {
        val database = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(Constants.NAME,movie.name)
        contentValues.put(Constants.AUTHORS,movie.authors)
        contentValues.put(Constants.ABOUT,movie.about)
        contentValues.put(Constants.DATE,movie.date)
    }

    override fun deleteMovie(movie: Movie) {
        TODO("Not yet implemented")
    }

    override fun getAllMovies(): List<Movie> {
        TODO("Not yet implemented")
    }

    override fun editContact(movie: Movie) {
        TODO("Not yet implemented")
    }

    override fun getMovieById(id: Int): Movie {
        TODO("Not yet implemented")
    }
}