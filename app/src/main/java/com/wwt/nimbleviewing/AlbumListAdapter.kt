package com.wwt.nimbleviewing

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AlbumListAdapter : RecyclerView.Adapter<AlbumViewHolder>() {
    private val data: MutableList<Album> = mutableListOf()

    fun submitList(albums: List<Album>) = Unit

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder =
        AlbumViewHolder(
            parent.inflater().inflate(R.layout.list_item_album, parent, true)
        )

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) =
        holder.bind(data[position])

    private fun ViewGroup.inflater(): LayoutInflater = LayoutInflater.from(context)
}

class AlbumViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(album: Album) = Unit
}

