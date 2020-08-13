package com.ixidev.simplenotepad.db

import androidx.room.*
import com.ixidev.simplenotepad.entity.Note


@Dao
interface NotesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNote(note: Note): Long


    @Delete
    fun deleteNote(vararg note: Note)


    @Update
    fun updateNote(note: Note)


    @get:Query("SELECT * FROM notes")
    val notes: List<Note>


    @Query("SELECT * FROM notes WHERE id = :noteId")
    fun getNoteById(noteId: Int): Note


    @Query("DELETE FROM notes WHERE id = :noteId")
    fun deleteNoteById(noteId: Int)
}