package com.alexandermakunin;

import java.io.File;
import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\alexandermakunin\\ficheros");
        System.out.println("que contiene: " + Arrays.toString(file.list()));
    }
}
