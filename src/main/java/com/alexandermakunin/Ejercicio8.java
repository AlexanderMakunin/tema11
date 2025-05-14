package com.alexandermakunin;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio8 {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        try (FileReader fileReader = new FileReader(file)) {
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
        }
    }
}
