package com.example.android_lab3

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CharacterViewHolder(v: View) : RecyclerView.ViewHolder(v) {
    val nameTextView: TextView = v.findViewById(R.id.textViewName)
    val ageTextView: TextView = v.findViewById(R.id.textViewAge)
    val avatarImageView: ImageView = v.findViewById(R.id.imageViewCover)
    val infoButton: Button = v.findViewById(R.id.buttonInfo)
}
