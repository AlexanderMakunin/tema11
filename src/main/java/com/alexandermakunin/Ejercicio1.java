package com.alexandermakunin;

import java.io.File;

public class Ejercicio1 {
    public static void main(String[] args) {
        File rutaDirectorio = new File("src\\main\\java\\com\\alexandermakunin\\ficheros");
        System.out.println("Es un directorio: " + rutaDirectorio.isDirectory());
    }
}
