package com.example.myhomeworks

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MoviesAdapter() : RecyclerView.Adapter<MovieViewHolder>() {

    var movies = ArrayList<MovieData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder = MovieViewHolder(parent)

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(movies.get(position))
    }

    override fun getItemCount(): Int = movies.size
}