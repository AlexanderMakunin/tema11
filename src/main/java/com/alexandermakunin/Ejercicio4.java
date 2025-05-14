package com.alexandermakunin;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio4 {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\alexandermakunin\\ficheros\\SoyUnFichero.txt");
        System.out.println("archivo elegido: " + file.getName());
        System.out.println("ruta abosulta: " + file.getAbsolutePath());
        System.out.println("esta oculto: " + file.isHidden());
        System.out.println("se puede leer: " + file.canWrite());
        System.out.println("se puede escribir: " + file.canRead());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        Date ahora = new Date();
        String formattedDate = simpleDateFormat.format(file.lastModified());
        System.out.println("modificacion reciente: " + formattedDate);
        file.setLastModified(ahora.getTime()+22222222);
        formattedDate = simpleDateFormat.format(file.lastModified());
        System.out.println("modificacion reciente: " + formattedDate);
        System.out.println("tamaño en bytes: " + file.length());
        System.out.println("tamaño en KB: " + (float) file.length() / 1024);
        System.out.println("tamaño en MB: " + (float) file.length() / (1024 * 1024));
    }
}
