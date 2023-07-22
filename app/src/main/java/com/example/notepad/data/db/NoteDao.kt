package com.example.notepad.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.notepad.data.model.NoteModel

@Dao
interface NoteDao {
    @Insert
    suspend fun addNote(note: NoteModel)
    @Update
    suspend fun updateNote(note: NoteModel)
    @Delete
    suspend fun deleteNote(note: NoteModel)
    @Query("SELECT * FROM NoteTable ORDER BY id DESC")
    fun getAllNotes(): LiveData<List<NoteModel>>

}