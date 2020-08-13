package com.ixidev.simplenotepad.callbacks

import com.ixidev.simplenotepad.entity.Note



interface NoteEventListener {

    fun onNoteClick(note: Note)

    fun onNoteLongClick(note: Note)
}