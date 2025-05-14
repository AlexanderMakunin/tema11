package com.alexandermakunin;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio11 {
    public static void main(String[] args) {

    }

    public static void concatLines(File file1, File file2) throws IOException {
        List<String> texto = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file1));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2))) {
            String linea;
            String linea2;
            while (reader.readLine() != null || reader2.readLine() != null) {
                linea = reader.readLine();
                linea2 = reader2.readLine();
                texto.add(linea + " " + linea2);
            }
        }
        File file = new File("src\\main\\java\\com\\alexandermakunin\\ficheros\\texto2.txt");
        if (file.createNewFile()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (String linea : texto) {
                    writer.write(linea);
                    writer.newLine();
                }
            }
        }
    }
}
