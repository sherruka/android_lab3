package com.example.android_lab3

import android.content.Context
import androidx.appcompat.app.AlertDialog

object CharacterClickListener {
    fun onCharacterClick(context: Context, description: String) {
        AlertDialog.Builder(context)
            .setTitle("Описание")
            .setMessage(description)
            .setPositiveButton("Закрыть") { dialog, _ -> dialog.dismiss() }
            .show()
    }
}
