package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello world!");

        // Array Practice
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        // Print each value in the array
        for (int i = 0; i < integerArray.length; i++) {
            System.out.println(integerArray[i]);
        }

        // Print only the odd numbers
        System.out.println("Odd numbers only:");
        for (int j = 0; j < integerArray.length; j++) {
            if (integerArray[j] % 2 == 1)
                System.out.println(integerArray[j]);
        }

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] newPhraseArray = phrase.split(" ");
        System.out.println(Arrays.toString(newPhraseArray));

        // Split the string into separate sentences
        String[] newSentenceArray = phrase.split("\\.");
        System.out.println(Arrays.toString(newSentenceArray));


        // ArrayList Practice #1. Call sumEven method.
        ArrayList<Integer> numberArrayList = new ArrayList<>();
        numberArrayList.add(1);
        numberArrayList.add(2);
        numberArrayList.add(3);
        numberArrayList.add(7);
        numberArrayList.add(18);
        numberArrayList.add(33);
        numberArrayList.add(54);
        numberArrayList.add(83);
        numberArrayList.add(3);
        numberArrayList.add(25);

        int sum = sumEven(numberArrayList);
        System.out.println("\nThe total of even numbers is: " + sum);

        // ArrayList Practice #2. Call printFiveLettersWords method.
        ArrayList<String> words = new ArrayList<>();
        words.add("Howdy");
        words.add("Java");
        words.add("Coffee");
        words.add("Hello");
        words.add("Cowabunga");
        words.add("Yum");

        System.out.println("\nThe words with 5 letters:");
        printLettersWords(words, 5);


        // ArrayList Practice #4 BONUS. Create a list of words from Array Practice
        ArrayList<String> wordsList = new ArrayList<>();
        for (String word : newPhraseArray) {
            wordsList.add(word.replace(".", ""));
        }

        // ArrayList Practice #3. Ask the user to enter the word length

        System.out.println("Please enter the word length: ");
        int userWordLength = input.nextInt();
        System.out.println(wordsList);
        System.out.println("\nThe words with " + userWordLength + " letters:");
        printLettersWords(wordsList, userWordLength);


        // HashMap Practice
        HashMap<Integer, String> studentRoster = new HashMap<>();

        String newStudent;


        do {

            System.out.println("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newStudentID = input.nextInt();

                studentRoster.put(newStudentID, newStudent);

                input.nextLine();
            }
        } while (!newStudent.equals(""));


        System.out.println("Student roster:");

        for (Map.Entry<Integer, String> student : studentRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }
        System.out.println("Number of students in roster: " + studentRoster.size());

        input.close();

    }


    // ArrayList Practice #1. Create a method to sum all even numbers.
    public static int sumEven(ArrayList<Integer> arr) {
        int totalEven = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                totalEven += integer;
            }
        }
        return totalEven;
    }

    // ArrayList Practice #2. Create a static method to print out each word in a list that has exactly 5 letters.
    public static void printLettersWords(ArrayList<String> words, int numberOfLetters) {
        for (String word : words) {
            if (word.length() == numberOfLetters) {
                System.out.println(word);
            }
        }

    }


}