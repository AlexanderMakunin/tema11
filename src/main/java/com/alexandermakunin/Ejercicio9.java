package com.alexandermakunin;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio9 {
    public static void main(String[] args) throws IOException {
        String[] alumnos = new String[]{"ruso","terrorista","calvo"};
        //insertarAlumnos(alumnos);
        eliminarAlumno("terrorista");
    }
    public static void insertarAlumnos(String[] alumnos) throws IOException {
        File file = new File("src\\main\\java\\com\\alexandermakunin\\ficheros\\alumnos.txt");
        if (file.createNewFile()) {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String alumno : alumnos) {
                bufferedWriter.write(alumno);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
    public static void eliminarAlumno(String alumnoBuscado) throws IOException {
        File file = new File("src\\main\\java\\com\\alexandermakunin\\ficheros\\alumnos.txt");
        List<String> alumnos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (!linea.equalsIgnoreCase(alumnoBuscado)) {
                    alumnos.add(linea);
                }
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String alumno : alumnos) {
                writer.write(alumno);
                writer.newLine();
            }
        }
    }
}
