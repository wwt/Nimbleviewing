package com.wwt.nimbleviewing

data class Album(val userId: Int, val id: Int, val title: String)

data class AlbumArt(val albumId: Int, val id: Int, val url: String, val thumbnailUrl: String)