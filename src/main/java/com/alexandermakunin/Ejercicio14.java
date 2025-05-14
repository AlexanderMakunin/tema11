package com.alexandermakunin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio14 {
    public static void main(String[] args) {

    }
    public static boolean compararFile(File file1, File file2) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file1));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2))) {
            String linea;
            String linea2;
            while (reader.readLine() != null || reader2.readLine() != null) {
                linea = reader.readLine();
                linea2 = reader2.readLine();
                if (!linea.equals(linea2)) {
                    return false;
                }
            }
            return true;
        }
    }
}
