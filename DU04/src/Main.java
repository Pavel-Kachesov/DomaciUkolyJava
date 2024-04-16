import java.util.Scanner;

public class Main {

    private static WordList wordList = new WordList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Vyberte akci:");
            System.out.println("1. Vložit slovíčko");
            System.out.println("2. Otestovat se");
            System.out.println("0. Ukončit");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    insertWord();
                    break;
                case "2":
                    testUser();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Chyba.");
            }
        }
    }

    private static void insertWord() {
        System.out.println("Zadejte anglické slovíčko:");
        String english = scanner.nextLine();
        System.out.println("Zadejte překlad:");
        String czech = scanner.nextLine();
        wordList.addWord(new Word(english, czech));
        System.out.println("Slovo vloženo.");
    }

    private static void testUser() {
        if (wordList.isEmpty()) {
            System.out.println("Databáze slovíček je prázdná.");
            return;
        }

        int score = 0;
        for (int i = 0; i < 3; i++) {
            Word word = wordList.getRandomWord();
            System.out.println("Anglické slovo: " + word.getEnglish());
            System.out.print("Zadejte český překlad: ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(word.getCzech())) {
                score++;
                System.out.println("Správně!");
            } else {
                System.out.println("Špatně. Správný překlad je: " + word.getCzech());
            }
        }

        System.out.println("Vaše skóre: " + score + "/3");
    }
}


