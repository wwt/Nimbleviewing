package com.wwt.nimbleviewing

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.wwt.nimbleviewing.databinding.ActivityScrollingBinding

class ScrollingActivity : AppCompatActivity() {
    private val listAdapter: AlbumListAdapter by lazy { AlbumListAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        with(ActivityScrollingBinding.inflate(LayoutInflater.from(this), null, false)) {
            setContentView(root)
            setSupportActionBar(toolbar)
            toolbarLayout.title = this@ScrollingActivity.title

            album_list.adapter = listAdapter

            fab.setOnClickListener {
                Snackbar.make(
                    album_list,
                    "Display album titles and images from ${BuildConfig.BASE_URL}",
                    Snackbar.LENGTH_LONG
                ).show()
            }
        }
    }

}