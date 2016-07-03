package com.epam.bigvava.entity;

import com.epam.bigvava.entity.Note;
import org.junit.Test;
import static junit.framework.Assert.*;


/**
 * Created by Seagull on 03.07.2016.
 */
public class NoteTest {

    @Test
    public void testEqualsObjects() throws Exception {
        Note note1 = new Note();
        Note note2 = new Note();
        note1.setTitle("title");
        note2.setTitle("title");
        note1.setText("text");
        note2.setText("text");
        assertTrue(note1.equals(note2));
    }

    @Test
    public void testEqualsOneObj() throws Exception {
        Note note1 = new Note();
        note1.setTitle("title");
        note1.setText("text");
        assertTrue(note1.equals(note1));
    }

    @Test
    public void testEqualsDifferentFields() throws Exception {
        Note note1 = new Note();
        Note note2 = new Note();
        note1.setTitle("first title");
        note2.setTitle("second title");
        note1.setText("text");
        note2.setText("text");
        assertFalse(note1.equals(note2));
    }

    @Test
    public void testEqualsNull() throws Exception {
        Note note1 = new Note();
        note1.setTitle("title");
        note1.setText("text");
        assertFalse(note1.equals(null));
    }

    @Test
    public void testEqualsDiffentClasses() throws Exception {
        Note note1 = new Note();
        note1.setTitle("title");
        note1.setText("text");
        String string = new String("text");
        assertFalse(note1.equals(string));
    }
}