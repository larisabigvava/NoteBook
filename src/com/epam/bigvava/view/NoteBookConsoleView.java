package com.epam.bigvava.view;

import com.epam.bigvava.entity.Note;
import com.epam.bigvava.entity.NoteBookProvider;

import java.util.ArrayList;

/**
 * Created by Larisa_Bigvava on 7/1/2016.
 */
public class NoteBookConsoleView {


    public void start() {
        printMenu();
    }

    private void print(Note... notes){
        for (int i = 0; i< notes.length; i++){
            System.out.println(notes[i].toString());
        }
    }
    private void print(ArrayList<Note> notes){
        for (Note note : notes){
            System.out.println(note.toString());
        }
    }

    private void printMenu(){
        System.out.println("1. enter new note");
        System.out.println("2. show notes by title");
        System.out.println("3. show notebook");
        System.out.println("4. print menu");
        System.out.println("5. exit");
    }
}
