package com.alexandermakunin;

import java.io.File;

public class Ejercicio3 {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\alexandermakunin\\ficheros");
        System.out.println("Nombre: " + file.getName());
        System.out.println("Ruta absoluta: " + file.getAbsolutePath());
        System.out.println("Se puede leer: " + file.canRead());
        System.out.println("Se puede escribir: " + file.canWrite());
    }
}
