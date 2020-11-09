package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String word1 = "Debit card31";
        String word2 = "Bad credit13";

        Anagram anagram = new Anagram();
        anagram.isAnagram(word1, word2);

    }

    public void isAnagram(String word1, String word2) {


        char [] firstWord = word1.toLowerCase().toCharArray();
        char [] secondWord = word2.toLowerCase().toCharArray();

        Arrays.sort(firstWord);
        Arrays.sort(secondWord);

        boolean anagram = Arrays.equals(firstWord, secondWord);

        if (anagram) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }


    }
}
