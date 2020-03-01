package pl.edu.agh.hangman.ioOperation;

import java.util.Scanner;

public class UserInput {

    public Character getCharacterFromUser(){
        Scanner sc = new Scanner(System.in);

        char inputCharacter = sc.next().charAt(0);
        return inputCharacter;
    }

    private String createAsterics(String word){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length()  ; i++) {
            result.append("_");
        }

        return result.toString();
    }

}
