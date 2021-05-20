package jetbrains.academy;

import java.util.Arrays;
import java.util.Scanner;

public class StringTheory1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        String word = scanner.nextLine();
        System.out.println(searchEngine(word, words));
    }

    public static String searchEngine(String word, String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word))
                return String.valueOf(++i);
        }
        return "Not found";
    }
}
