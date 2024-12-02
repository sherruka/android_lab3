package com.example.android_lab3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rView = findViewById(R.id.recyclerView)
        rView.layoutManager = LinearLayoutManager(this)

        val names = CharacterDataLoader.loadNames(this)
        val ages = CharacterDataLoader.loadAges(this)
        val descriptions = CharacterDataLoader.loadDescriptions(this)
        val imageIds = CharacterDataLoader.loadImageIds(this)

        val characterList = names.indices.map { i ->
            Character(names[i], ages[i], imageIds[i], descriptions[i])
        }

        rView.adapter = CharacterAdapter(this, characterList)
    }
}
