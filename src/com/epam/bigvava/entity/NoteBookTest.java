package com.epam.bigvava.entity;

import com.epam.bigvava.entity.NoteBookProvider;
import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * Created by Seagull on 03.07.2016.
 */
public class NoteBookTest {

    @Test
    public void testEqualsObjects() throws Exception {
        NoteBook noteBook1 = new NoteBook();
        NoteBook noteBook2 = new NoteBook();
        Note note = new Note();
        note.setTitle("title");
        note.setText("text");
        noteBook1.addNote(note);
        noteBook2.addNote(note);
        assertTrue(noteBook1.equals(noteBook2));
    }

    @Test
    public void testEqualsNull() throws Exception {
        NoteBook noteBook1 = new NoteBook();
        Note note = new Note();
        note.setTitle("title");
        note.setText("text");
        noteBook1.addNote(note);
        assertFalse(noteBook1.equals(null));
    }

    @Test
    public void testEqualsDifferentFields() throws Exception{
        NoteBook noteBook1 = new NoteBook();
        NoteBook noteBook2 = new NoteBook();
        Note note1 = new Note();
        Note note2 = new Note();
        note1.setTitle("title");
        note1.setText("text");
        noteBook1.addNote(note1);
        note2.setTitle("new title");
        note2.setText("new text");
        noteBook2.addNote(note2);
        assertFalse(noteBook1.equals(noteBook2));
    }

    @Test
    public void testEqualsOneObject()throws Exception {
        NoteBook noteBook1 = new NoteBook();
        Note note1 = new Note();
        note1.setTitle("title");
        note1.setText("text");
        noteBook1.addNote(note1);
        assertTrue(noteBook1.equals(noteBook1));
    }

}