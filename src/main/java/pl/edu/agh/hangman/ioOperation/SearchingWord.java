package pl.edu.agh.hangman.ioOperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SearchingWord {

    List<String> enableWords = new ArrayList<String>();

    public SearchingWord(String enableWordsFilePath) {
        getEnableWordsFromFile(enableWordsFilePath);
    }

    private void getEnableWordsFromFile(String filePath) {

        try {
            File file = new File(filePath);

            BufferedReader br = new BufferedReader(new FileReader(file));

            String txtLine;

            while ((txtLine = br.readLine()) != null)
                enableWords.add((txtLine));
        }
        catch (Exception e) {
            System.out.println("Wystapil blad wczytywania pliku " + filePath + "\n\n" + e.getMessage());
        }
    }

    private String drawWord(){
        Random random = new Random();
        int wordIndex = random.nextInt(enableWords.size());
        return  enableWords.get(wordIndex);
    }
}
