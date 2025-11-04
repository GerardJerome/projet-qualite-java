package com.example.utils;

/**
 * Classe utilitaire pour des opérations mathématiques simples.
 */
public class MathUtils {

    /**
     * Retourne le plus grand des deux nombres.
     * Si les deux sont égaux, retourne l’un des deux.
     */
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    /**
     * Calcule la factorielle d’un nombre entier positif.
     * 0! = 1
     * Lève IllegalArgumentException si n < 0
     */
    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative number not allowed");
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Calcule la moyenne des éléments d’un tableau d’entiers.
     * Retourne 0 si le tableau est vide ou null.
     */
    public static double average(int[] numbers) {
        if (numbers == null || numbers.length == 0) return 0;
        double sum = 0;
        for (int n : numbers) sum += n;
        return sum / numbers.length;
    }

    /**
     * Retourne true si le nombre est pair.
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
