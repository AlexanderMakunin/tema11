package com.alexandermakunin;

import java.util.HashMap;
import java.util.Map;

public class Morse {
    private static Map<Character,String> letras = new HashMap<>();
    public static void main(String[] args) {
        rellenar(letras);
        String resultado = encode("hola que tal");
        System.out.println(resultado);
        System.out.println(decode(resultado));
    }
    private static String encode(String text) {
        StringBuilder sb = new StringBuilder();
        int textLenght = text.length();
        char letra;
        String morse;
        for (int i = 0; i < textLenght;i++) {
            letra = text.toLowerCase().charAt(i);
            if (Character.isAlphabetic(letra)) {
                morse = letras.get(letra);
                sb.append(morse);
            } else {
                if (letra == ' ') {
                    sb.append(" / ");
                } else {
                    sb.append(letra);
                }
            }
        }
        return sb.toString();
    }

    private static String decode(String text) {
        StringBuilder sb = new StringBuilder();
        String[] textoMorse = text.split(" ");
        int textLenght = textoMorse.length;
        String letra;
        String morse;
        for (int i = 0; i < textLenght; i++) {
            letra = textoMorse[i] + " ";
            if (letra.equals("/ ")) {
                sb.append(" ");
            }
            for (Map.Entry<Character,String> map : letras.entrySet()) {
                morse = map.getValue();
                if (letra.equals(morse)) {
                    sb.append(map.getKey());
                }
            }
        }
        return sb.toString();
    }

    private static void rellenar(Map<Character,String> letras) {
        String[] morse = new String[]{"._ ","_... ","_._. ","_.. ",". ",".._. ","__. ",".... ",".. ",".___ ","_._ ","._.. ","__ ","_. ","___ ",".__. ","__._ ","._. ","... ","_ ",".._ ","..._ ",".__ ","_.._ ","_.__ ","__.. "
        };
        int count = 0;
        for (int i = 97; i < 122; i++) {
            letras.put((char) i,morse[count++]);
        }
    }
}
