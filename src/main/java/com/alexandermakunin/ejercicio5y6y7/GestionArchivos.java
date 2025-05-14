package com.alexandermakunin.ejercicio5y6y7;

import java.io.*;

public class GestionArchivos {
    // apartado 5
    public GestionArchivos() {
    }

    public boolean crearArchivo(String directorio, String archivo) throws IOException {
        File file = new File(directorio + File.separator + archivo);
        if (file.createNewFile()) {
            return true;
        } else {
            return false;
        }
    }
    public void listarDirectorio(String directorio) {
        File directory = new File(directorio);
        StringBuilder sb = new StringBuilder();
        if (directory.isDirectory() && directory.exists()) {
            for (File file : directory.listFiles()) {
                sb.append(file.getName());
                if (file.isFile()) {
                    sb.append(" f ");
                } else {
                    sb.append(" d ");
                }
                sb.append(file.length()).append(" ");
                if (file.canRead()) {
                    sb.append("r");
                }
                if (file.canWrite()) {
                    sb.append("w");
                }
                System.out.println(sb);
                sb.delete(0,sb.length());
            }
        }
        System.out.println(directorio + " no es un directorio");
    }

    public void verInfo(String directorio, String archivo) {
        File file = new File(directorio + File.separator + archivo);
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(file.getName()).append(" ");
        sb.append("Ruta absoluta: ").append(file.getAbsolutePath()).append(" ");
        sb.append("Escribir: ").append(file.canWrite()).append(" ");
        sb.append("Leer: ").append(file.canRead()).append(" ");
        sb.append("Tamaño en MB: ").append( (float) file.length() / (1024 * 1024)).append(" ");
        sb.append("Directorio: ").append(file.isDirectory()).append(" ");
        sb.append("Archivo: ").append(file.isFile()).append(" ");
        System.out.println(sb);
    }

    //apartado 6
    public void leerArchivo(String directorio, String archivo) throws IOException {
        File file = new File(directorio + File.separator + archivo);
        FileReader fileReader = new FileReader(file);
        int num;
        StringBuilder sb = new StringBuilder();
        while (true) {
            num = fileReader.read();
            if (num == -1) {
                break;
            }
            sb.append( (char) num);
        }
        System.out.println(sb);
        fileReader.close();
    }
    // apartado 7
    public void leerBinario(String directorio, String archivo) throws IOException {
        File file = new File(directorio + File.separator + archivo);
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            int byteLeido;
            int contador = 0;

            while ((byteLeido = fileInputStream.read()) != -1) {
                System.out.printf("%02X ", byteLeido);
                contador++;
                if (contador % 16 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
