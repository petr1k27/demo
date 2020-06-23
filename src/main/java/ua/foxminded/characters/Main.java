package ua.foxminded.characters;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CharsCounter charsCounter = new UniqueCharsCounter();
        charsCounter = new CachedCharsCounter(charsCounter);
        String text = scanner.nextLine();
        System.out.println(charsCounter.countCharacters(text));
    }
}
