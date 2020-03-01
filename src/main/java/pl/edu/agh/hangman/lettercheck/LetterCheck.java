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

    public String getAsterisk() {
        return asterisk.toString();
    }

    public boolean check (Character letter) {
        boolean existInWord = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                existInWord = true;
                asterisk.setCharAt(i, letter);
            }
        }
//        System.out.println(existInWord);
    return existInWord;
    }

    private StringBuilder createAsterics(String word){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length() ; i++) {
            result.append("_");
        }
        return result;
    }

//    public void hangmanImage() {
//        if (count == 1) {
//            System.out.println(            "  +---+\n" +
//                    "  |   |\n" +
//                    "      |\n" + "    " +asterisk +
//                    "      |\n" +
//                    "      |\n" +
//                    "      |\n" +
//                    "=========");
//        }
//        if (count == 2){
//            System.out.println( "  +---+\n" +
//                    "  |   |\n" +
//                    "  O   |\n" + "    " +asterisk +
//                    "      |\n" +
//                    "      |\n" +
//                    "      |\n" +
//                    "=========");
//        }
//        if (count == 3){
//            System.out.println("  +---+\n" +
//                    "  |   |\n" +
//                    "  O   |\n" + "    " +asterisk +
//                    "  |   |\n" +
//                    "      |\n" +
//                    "      |\n" +
//                    "=========");
//        }
//        if (count == 4){
//            System.out.println("  +---+\n" +
//                    "  |   |\n" +
//                    "  O   |\n" + "    " +asterisk +
//                    " /|   |\n" +
//                    "      |\n" +
//                    "      |\n" +
//                    "=========");
//        }
//        if (count == 5){
//            System.out.println("  +---+\n" +
//                    "  |   |\n" +
//                    "  O   |\n" + "    " +asterisk +
//                    " /|\\  |\n" +
//                    "      |\n" +
//                    "      |\n" +
//                    "=========");
//        }
//        if (count == 6){
//            System.out.println("  +---+\n" +
//                    "  |   |\n" +
//                    "  O   |\n" + "    " +asterisk +
//                    " /|\\  |\n" +
//                    " /    |\n" +
//                    "      |\n" +
//                    "=========");
//        }
//        if (count == 7){
//            System.out.println("  +---+\n" +
//                    "  |   |\n" +
//                    "  O   |\n" + "    " +asterisk +
//                    " /|\\  |\n" +
//                    " / \\  |\n" +
//                    "      |\n" +
//                    "========");
//        }
//    }
}
