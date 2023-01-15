package com.dmdev.oop.lesson22;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class  WriteRunner {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "writer.poem") ;
//        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, true))) {
        Files.write (path, List.of ("Hello world", "Java"));
//        try (BufferedWriter fileWriter = Files.newBufferedWriter(path)) {
//            fileWriter.append("Hello World!");
//            fileWriter.newLine();
//            fileWriter.append("Java");
//        }
    }
}
