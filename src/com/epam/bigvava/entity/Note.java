package com.epam.bigvava.entity;

/**
 * Created by Larisa_Bigvava on 7/1/2016.
 */

public class Note {

    private String title;
    private String text;

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note note = (Note) o;

        if (!title.equals(note.title)) return false;
        return text.equals(note.text);

    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + text.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\n" + "Text: " + text;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }
}
