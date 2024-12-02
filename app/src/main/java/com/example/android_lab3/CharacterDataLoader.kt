package com.example.android_lab3

import android.content.Context
import android.util.Log

object CharacterDataLoader {
    fun loadNames(context: Context): Array<String> =
        context.resources.getStringArray(R.array.character_names)

    fun loadAges(context: Context): Array<String> =
        context.resources.getStringArray(R.array.character_ages)

    fun loadDescriptions(context: Context): Array<String> =
        context.resources.getStringArray(R.array.character_descriptions)

    fun loadImageIds(context: Context): IntArray {
        val imageNames = context.resources.getStringArray(R.array.character_images)
        return imageNames.map { imageName ->
            context.resources.getIdentifier(
                imageName.replace("res/drawable/", "").replace(".png", ""),
                "drawable",
                context.packageName
            ).also {
                Log.d("CharacterDataLoader", "Loaded image resource: $imageName -> $it")
            }
        }.toIntArray()
    }
}
