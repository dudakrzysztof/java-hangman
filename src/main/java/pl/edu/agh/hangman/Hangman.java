package pl.edu.agh.hangman;

import pl.edu.agh.hangman.ioOperation.UserInput;

import pl.edu.agh.hangman.ioOperation.WordFromFile;
import pl.edu.agh.hangman.lettercheck.LetterCheck;

public class Hangman {

    public static final String[] HANGMANPICS = new String[]{
            "  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "========"
    };



    public static void main(String[] args) {
        WordFromFile wordFromFile = new WordFromFile();
        String word = wordFromFile.drawWord();
        System.out.println(word);

        UserInput userInput = new UserInput();
        Character uservalue = userInput.getCharacterFromUser();
        LetterCheck letterCheck = new LetterCheck(word);
        int counter = 0;
        while (true){
            if(counter==HANGMANPICS.length-1){
                System.out.println("Przegrales");
                break;
            }

            if(word.equals(letterCheck.getAsterisk())){
                System.out.println("wygrales");
                break;
            }



            if (letterCheck.check(uservalue) == false){
                counter++;
            }

            System.out.print(InsertWordToHangmanImage(letterCheck.getAsterisk(), HANGMANPICS[counter]));

            uservalue =userInput.getCharacterFromUser();
        }
    }
    private static String InsertWordToHangmanImage(String searchingWord, String hangmanImage){
        String[] textLines = hangmanImage.split("\n");
        textLines[2] += " " + searchingWord;

        String result = textLines[0] + "\n";

        for (int i = 1; i < textLines.length ; i++) {
            result += textLines[i] + "\n";
        }

        return result;
    }
}
