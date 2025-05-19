package com.alexandermakunin;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio10 {
    public static void main(String[] args) {
        try {
            concat(new File("src\\main\\java\\com\\alexandermakunin\\ficheros\\holaMundo.txt"),new File("src\\main\\java\\com\\alexandermakunin\\ficheros\\SoyUnFichero.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void concat(File file1, File file2) throws IOException {
        List<String> texto = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                texto.add(linea);
            }
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file2))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                texto.add(linea);
            }
        }
        File file = new File("src\\main\\java\\com\\alexandermakunin\\ficheros\\texto.txt");
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
