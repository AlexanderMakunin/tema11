package com.alexandermakunin;

import java.io.*;

public class Ejercicio13 {
    private static final String path = "src\\main\\java\\com\\alexandermakunin\\ficheros\\primo.txt";
    public static void main(String[] args) {

    }
    public static void revisarDni(File file) throws IOException {
        if (file.exists()) {
            try (FileReader fileReader = new FileReader(file)) {
                int count = -1;
                for (int i = 0; i != -1;) {
                    i = fileReader.read();
                    count++;
                }
            }
        } else {
            file.createNewFile();

        }
    }
}
