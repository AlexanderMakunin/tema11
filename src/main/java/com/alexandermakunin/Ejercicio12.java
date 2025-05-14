package com.alexandermakunin;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio12 {
    public static void main(String[] args) {

    }
    public static void revisarDni(File file) throws IOException {
        List<String> Dni = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.length() != 8) {
                    for (int i = 0; i < linea.length(); i++) {
                        linea = 0 + linea;
                    }
                }
                char letra = (char) (Integer.parseInt(linea) / 23);
                Dni.add(linea + letra);
            }
        }
        File file2 = new File("src\\main\\java\\com\\alexandermakunin\\ficheros\\" + file + "_conletras");
        if (file.createNewFile()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {
                for (String linea : Dni) {
                    writer.write(linea);
                    writer.newLine();
                }
            }
        }
    }
}
