package com.example.tp1;

public class Tp1 {
    /**
     * Retourne true si la chaîne est un palindrome (même en ignorant la casse et les espaces).
     * Exemple : "A man a plan a canal Panama" -> true
     */
    public static boolean isPalindrome(String input) {
		if(input == null) {
			throw new IllegalArgumentException("Input is null");
		}
		StringBuilder builder = new StringBuilder(input);
		String inputReversed = builder.reverse().toString();


     return input.compareTo(inputReversed) == 0;
    }

    /**
     * Retourne le nombre de voyelles dans une chaîne.
     * Exemple : "bonjour" -> 3
     */
    public static int countVowels(String input) {
		if(input == null) {
			throw new IllegalArgumentException("Input is null");
		}
		String voyelle = "aeiouyAEIOUY";
		int compteur = 0;
		for(Character c : input.toCharArray()) {
			if(voyelle.contains(c.toString())){
				compteur++;
			}
		}
		return compteur;
    }

    /**
     * Retourne la chaîne inversée.
     * Exemple : "abc" -> "cba"
     */
    public static String reverse(String input) {
		StringBuilder builder = new StringBuilder(input);
		return builder.reverse().toString();
    }
}
