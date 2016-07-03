package com.epam.bigvava.view;

import com.epam.bigvava.entity.Note;
import com.epam.bigvava.entity.NoteBookProvider;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Larisa_Bigvava on 7/1/2016.
 */
public class NoteBookConsoleView {
    private static NoteBookProvider provider = new NoteBookProvider();
    private Scanner sc = new Scanner(System.in);

    public void start() {
        printMenu();
        String command = sc.nextLine();
        while (!command.equals("5")){
            switch (command){
                case "1":
                    addNote();
                    System.out.println("Enter new command");
                    break;
                case "2":
                    System.out.println("Enter a title");
                    String title = sc.nextLine();
                    Note[] notes = provider.getNoteBook().getNotes(title);
                    if (notes != null){
                        print(notes);
                    } else {
                        System.out.println("There is no such notes");
                    }
                    System.out.println("Enter new command");
                    break;
                case "3":
                    print(provider.getNoteBook().getNotes());
                    System.out.println("Enter new command");
                    break;
                case "4":
                    printMenu();
                    System.out.println("Enter new command");
                    break;
                default:
                    System.out.println("You entered wrong command");
                    System.out.println("Enter new command");
            }
            command = sc.nextLine();
        }
    }

    private void addNote(){
        Note note = new Note();
        System.out.println("Enter title");
        note.setTitle(sc.nextLine());
        System.out.println("Enter note");
        note.setText(sc.nextLine());
        provider.getNoteBook().addNote(note);
    }

    private void printMenu(){
        System.out.println("Choose a command:");
        System.out.println("1. enter new note");
        System.out.println("2. show notes by title");
        System.out.println("3. show notebook");
        System.out.println("4. print menu");
        System.out.println("5. exit");
    }


    private void print(Note... notes){
        for (int i = 0; i< notes.length; i++){
            System.out.println(notes[i].toString());
        }
    }
    private void print(ArrayList<Note> notes) {
        if (!notes.isEmpty()) {
            for (Note note : notes) {
                System.out.println(note.toString());
            }
        } else {
            System.out.println("Notebook is empty");
        }
    }
}