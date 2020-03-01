package pl.edu.agh.hangman.lettercheck;
import java.util.Scanner;

public class LetterCheck {

    private String word;
    private static int count = 0;
    private StringBuilder asterisk;


    public LetterCheck(String word) {
        this.word = word;
        this.asterisk = createAsterics(word);
    }


    public boolean check (Character letter) {
        boolean existInWord = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                existInWord = true;
                asterisk.setCharAt(i, letter);
            }
        }
    return existInWord;
    }

    private StringBuilder createAsterics(String word){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length() ; i++) {
            result.append("_ ");
        }
        return result;
    }

    public void hangmanImage() {
        if (count == 1) {
            
        }
    }
}
