import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class WordList {

    private ArrayList<Word> words;

    public WordList() {
        this.words = new ArrayList<>();
    }

    public void addWord(Word word) {
        words.add(word);
    }

    public Word getRandomWord() {
        int randomIndex = (int) (Math.random() * words.size());
        return words.get(randomIndex);
    }

    public boolean isEmpty() {
        return words.isEmpty();
    }

    public void writeWordsToFile() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"))) {
            for (Word word : words) {
                writer.write(word.getEnglish() + "," + word.getCzech() + "\n");
            }
        }
    }
    public void readWordsFromFile() {
        try (Scanner scanner = new Scanner(new File("file.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                Word word = new Word(parts[0], parts[1]);

                words.add(word);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }


}

