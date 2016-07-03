package com.epam.bigvava.entity;

import java.util.ArrayList;

public interface NoteContainer {
    Note[] getNotes(String title);
    ArrayList<Note> getNotes();
    void addNote(Note note);
}
