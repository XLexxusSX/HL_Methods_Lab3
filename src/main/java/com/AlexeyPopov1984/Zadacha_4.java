package com.AlexeyPopov1984;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Zadacha_4 {

    public static void wordCount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vvedite stroku s tekstom:");
        String text = scanner.nextLine();

        if (text.trim().isEmpty()) {
            System.out.println("Tekst ne vveden.");
            return;
        }

        text = text.toLowerCase();

        String[] words = text.split(" ");
        Map<String, Integer> wordPovtor = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                wordPovtor.put(word, wordPovtor.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Chastota slov:");
        for (Map.Entry<String, Integer> entry : wordPovtor.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}