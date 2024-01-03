package org.launchcode;

import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String alicesAdvInWonderland = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?’";

        String wordToSearch;
        System.out.println("Enter a word to search: ");
        wordToSearch = input.next().toLowerCase();
        input.close();

        Boolean searchResult = alicesAdvInWonderland.contains(wordToSearch);
        System.out.println(searchResult);

        int wordIndex = alicesAdvInWonderland.indexOf(wordToSearch);
        int wordLength = wordToSearch.length();

        System.out.println("Your search word first appears at index " + wordIndex +
                ". Your word is " + wordLength + " characters long.");

        String modifiedSentence = alicesAdvInWonderland.replace(wordToSearch, "");
        System.out.println(modifiedSentence);
    }
}
