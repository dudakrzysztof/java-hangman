package pl.edu.agh.hangman.ioOperation;

import java.util.Scanner;

public class UserInput {

    public Character getCharacterFromUser(){
        Scanner sc = new Scanner(System.in);

        char inputCharacter = sc.next().charAt(0);
        return inputCharacter;
    }
}
