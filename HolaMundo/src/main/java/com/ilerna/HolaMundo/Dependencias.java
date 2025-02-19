package com.ilerna.HolaMundo;

public class Dependencias {
    public static class LibNum {
        // Método para determinar si un número es par
        public static boolean esPar(int num) {
            return num % 2 == 0;
        }
        // Método para determinar si un número es primo
        public static boolean esPrimo(int num) {
            if (num < 2) {
                return false;
            }
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }

    public static class LibreraStr {
        public static boolean esPalindromo(String palabra) {
            String palabraInvertida = "";
            for (int i = palabra.length() - 1; i >= 0; i--) {
                palabraInvertida += palabra.charAt(i);
            }
            return palabra.equals(palabraInvertida);
        }
    }
}
