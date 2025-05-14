package com.alexandermakunin.Ejercicio15;

import java.io.File;

public class ResultadoComparacion {
    private final String nombreArchivo;
    private final valor valor;

    public ResultadoComparacion(String nombreArchivo, ResultadoComparacion.valor valor) {
        this.nombreArchivo = nombreArchivo;
        this.valor = valor;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public ResultadoComparacion.valor getValor() {
        return valor;
    }

    public enum valor {
        IGUALES,FALTA_EN_1,FALTA_EN_2,MAS_NUEVO_EN_1,MAS_NUEVO_EN_2
    }
}
