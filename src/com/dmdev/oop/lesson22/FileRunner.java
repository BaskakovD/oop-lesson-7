package com.dmdev.oop.lesson22;

import javax.sound.midi.SoundbankResource;
import java.io.File;
import java.io.IOException;
import java.lang.Object;


/**
 *              output stream
 * application---------------> file
 *
 *               input stream
 * application < ----------- file
 *
 */

public class FileRunner {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Work/Java/Java. Core/Java.OOP/oop-lesson-7/resources/test.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getUsableSpace());
        System.out.println(file.canExecute());
        File dir = new File("C:/Work/Java/Java. Core/Java.OOP/oop-lesson-7/resources/new");
        dir.mkdirs();
        System.out.println(dir.getName());


    }
}
