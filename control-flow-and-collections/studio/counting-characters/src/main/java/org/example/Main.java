package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String quoteHiddenFigures = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = quoteHiddenFigures.toCharArray();

        HashMap<Character, Integer> characterCount = new HashMap<>();

        int count = 1;

        for (int i = 0; i < charactersInString.length; i++) {
            if (characterCount.containsKey(charactersInString[i])) {
                count = characterCount.get(charactersInString[i]);
                count++;
            } else {
                count = 1;
                ;
            }
            characterCount.put(charactersInString[i], count);
        }

        System.out.println(characterCount);
        for (Map.Entry<Character, Integer> character : characterCount.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }

    }
}