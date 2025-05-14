package com.alexandermakunin.ejercicio5y6y7;

import java.io.IOException;

public class Ejercicio5y6y7 {
    public static void main(String[] args) {
        // apartado 5
        GestionArchivos gestionArchivos = new GestionArchivos();
        try {
            gestionArchivos.crearArchivo("src\\main\\java\\com\\alexandermakunin\\ficheros","holaMundo.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        gestionArchivos.listarDirectorio("src\\main\\java\\com\\alexandermakunin\\ficheros");
        gestionArchivos.verInfo("src\\main\\java\\com\\alexandermakunin\\ficheros","holaMundo.txt");
        // apartado 6
        try {
            gestionArchivos.leerArchivo("src\\main\\java\\com\\alexandermakunin\\ficheros", "SoyUnFichero.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // apartado 7
        try {
            gestionArchivos.leerBinario("src\\main\\java\\com\\alexandermakunin\\ficheros", "holaMundo.bin");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
