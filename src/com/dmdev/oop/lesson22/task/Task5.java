package com.dmdev.oop.lesson22.task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

/**
 * Задан файл с java-кодом. Прочитать текст программы из фалла и
 * записать в другой файл в обратном порядке
 */
public class Task5 {

    public static void main(String[] args) {
        Path path = Path.of ("src", "Task4.java");
        Path result = Path.of("resources", "Task4.java");

        try (Stream<String> lines  = Files.lines(path);
            BufferedWriter bufferedWriter = Files.newBufferedWriter(result, APPEND, CREATE )) {
            lines. map (StringBuilder::new)
                    .map(StringBuilder::reverse)
                    .forEach(line -> {
                        try {
                            bufferedWriter.write (line.toString());
                            bufferedWriter.newLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
} 
