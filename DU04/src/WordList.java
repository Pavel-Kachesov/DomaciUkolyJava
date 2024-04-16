import java.util.ArrayList;

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
}
