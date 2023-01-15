package com.dmdev.oop.lesson22.task;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * «адан файл с текстом, найти и вывести на консоль все слова, начинающиес€ с буквы гласной.
 */
public class Task1 {
    private static final String VOWELS = "уеыаоэ€ию";
    public static void main(String[] args) throws IOException {
        Path path = Path.of("recources", "test.txt");
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                char first = word.charAt(0);
                if (VOWELS.indexOf(first) != -1) {
                    System.out.println(word);
                }
            }
        }
    }
}
