package com.example.android_lab3

// Data class Character для хранения информации о персонаже.
data class Character(
    val name: String,       // Имя персонажа
    val age: String,        // Возраст персонажа
    val avatarResId: Int,   // Идентификатор ресурса аватара
    val description: String // Краткое описание персонажа
)
