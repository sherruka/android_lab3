package com.example.android_lab3

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CharacterAdapter(
    private val context: Context,       // Контекст приложения
    private val characters: List<Character> // Список персонажей
) : RecyclerView.Adapter<CharacterViewHolder>() {

    override fun getItemCount(): Int = characters.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return CharacterViewHolder(view)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val character = characters[position]
        holder.nameTextView.text = character.name
        holder.ageTextView.text = character.age
        holder.avatarImageView.setImageResource(character.avatarResId)

        holder.infoButton.setOnClickListener {
            CharacterClickListener.onCharacterClick(context, character.description)
        }
    }
}
