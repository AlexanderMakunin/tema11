package com.alexandermakunin.Ejercicio15;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DiffFolder {
    private File folder1;
    private File folder2;

    public void setFolders(File folder1, File folder2) {
        if (!folder1.exists() || !folder1.isDirectory() || !folder2.exists() || !folder2.isDirectory()) {
            throw new GestionArchivosNotFolderException("no existen o no son directorios");
        } else {
            this.folder1 = folder1;
            this.folder2 = folder2;
        }
    }
    public File getFolder1() {
        return folder1;
    }
    public File getFolder2() {
        return folder2;
    }

    public Iterator<ResultadoComparacion> compare() {
        Iterator<ResultadoComparacion> resultados = null;
        List<File> files1 = new ArrayList<>();
        List<File> files2 = new ArrayList<>();
        Collections.addAll(files1, folder1.listFiles());
        Collections.addAll(files2, folder2.listFiles());
        for (int i = 0; i < files1.size(); i++) {
            String nombre1 = files1.get(i).getName();
            String nombre2 = files2.get(i).getName();
            long fecha1 = files1.get(i).lastModified();
            long fecha2 = files2.get(i).lastModified();
            long tamanyo1 = files1.get(i).length();
            long tamanyo2 = files2.get(i).length();
            if (nombre1.equals(nombre2)) {
                new ResultadoComparacion(nombre1, ResultadoComparacion.valor.IGUALES);
            }
        }
        return resultados;
    }
}
