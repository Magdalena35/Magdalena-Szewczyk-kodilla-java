package com.kodilla.exception.io;

public class FileReader {
    public void readFile() {
ClassLoader classLoader = getClass().getClassLoader();
File file = new File(classLoader.getResource(name: "file/names.text").getFile());
System.out.println(file.getPath());
    }
}
