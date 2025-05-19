package com.alexandermakunin;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            throw  new RuntimeException("Pon la ruta del archivo");
        }
        String archivo = args[0];
        File file = new File(archivo);
        try (FileReader fileReader = new FileReader(file)) {
            char[] texto = new char[1024];
            int cantidad;
            while ((cantidad = fileReader.read(texto)) >= 0) {
                for (int i = 0; i < cantidad; i++) {
                    System.out.print(texto[i]);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}