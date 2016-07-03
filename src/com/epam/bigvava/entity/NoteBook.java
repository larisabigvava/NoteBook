package com.epam.bigvava.entity;


import java.util.ArrayList;

/**
 * Created by Larisa_Bigvava on 7/1/2016.
 */
class NoteBook implements NoteContainer{

    private ArrayList<Note> notes = new ArrayList<>();


    @Override
    public ArrayList<Note> getNotes(){
        return notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoteBook noteBook = (NoteBook) o;

        return notes != null ? notes.equals(noteBook.notes) : noteBook.notes == null;

    }

    @Override
    public int hashCode() {
        return notes != null ? notes.hashCode() : 0;
    }

    @Override
    public String toString() {
        String result = "Notebook: \n";
        for (Note note : notes){
            result+=note.toString() + "\n";
        }
        return result;
    }

    @Override
    public Note[] getNotes(String title){
        ArrayList<Note> notes = new ArrayList<>();
        for (Note note : this.notes){
            if (note.getTitle().equals(title)){
                notes.add(note);
            }
        }
        return notes.isEmpty() ? null : notes.toArray(new Note[notes.size()]);
    }

    @Override
    public void addNote(Note note){
        notes.add(note);
    }
}
