package com.example.notepad.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "NoteTable")
@Parcelize
data class NoteModel(
    private val title: String,
    private val discription: String,
    @PrimaryKey(autoGenerate = true) val id: Int? = null
):Parcelable
