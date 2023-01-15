package com.dmdev.oop.lesson22.task;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Task4 {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("C:\\Work\\Java\\Java. Core\\Java.OOP\\oop-lesson-7\\recources\\Task3.java");
        String stringValue = Files.readString(path);

        String result = stringValue.replace("public", "private");

        Path resultPath = Path.of("recources", "Test2.txt");
        Files.writeString(resultPath, result);
    }
}
