package pl.edu.agh.hangman.ioOperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordFromFile implements HangmanWord {

    List<String> enableWords = new ArrayList<String>();

    public WordFromFile( ) {
        getEnableWordsFromFile( );
    }

    private void getEnableWordsFromFile() {

        try {
            File file = new File( getClass().getClassLoader().getResource("slowa.txt").getFile());

            BufferedReader br = new BufferedReader(new FileReader(file));

            String txtLine;

            while ((txtLine = br.readLine()) != null)
                enableWords.add((txtLine));
        }
        catch (Exception e) {
            System.out.println("Wystapil blad wczytywania pliku " + e.getMessage());
        }
    }

    @Override
    public String drawWord(){
        Random random = new Random();
        int wordIndex = random.nextInt(enableWords.size());

        String drawWord= enableWords.get(wordIndex).toUpperCase();

        String result = "";

        for (int i = 0; i < drawWord.length() ; i++) {
            result += drawWord.charAt(i);
        }

        return  result;
    }
}
