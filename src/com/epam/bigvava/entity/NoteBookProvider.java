package com.epam.bigvava.entity;

/**
 * Created by Larisa_Bigvava on 7/1/2016.
 */
public class NoteBookProvider {
    private static NoteBook notebook = new NoteBook();

    public static NoteBook getNoteBook(){
        return notebook;
    }

}
