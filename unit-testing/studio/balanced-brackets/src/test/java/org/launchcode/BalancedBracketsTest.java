package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() {
        String message = "a single set of balanced brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), message);
    }


    //TODO: If there are 2 complete sets of brackets that will look like this [[]]
    @Test
    public void returnsOnlyOneBracket() {
        String message = "Checking if double brackets passes";
        String testData = "[[]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void bracketsAtTheEnd() {
        String message = "Checking to see if brackets at the end passes";
        String testData = "Texas is the coolest state[]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void twoSetsofBracketsInASentence() {
        String message = "Testing to see if two sets of brackets in a sentence will pass";
        String testData = "[Texas is [no offense] cooler than Washington DC]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void testIfOneBracketIsFalse() {
        String message = "Testing to see if one bracket will be false";
        String testData = "North Carolina is sometimes cooler than Texas]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void testIfBracketIsMissing() {
        String message = "Testing to see if no brackets at all causes false";
        String testData = "North Carolina is sometimes cooler than Texas";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void testIfTwoOpenBracketsPass() {
        String message = "Testing to see if two open brackets pass";
        String testData = "[[I can't wait for summer";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);

    }

    @Test
    public void testIfReverseBrackets() {
        String message = "Testing to see if inverted brackets will pass";
        String testData = "]I can't wait for summer[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }
    @Test
    public void testIfBracketsAtBeginning() {
        String message = "Testing to see if brackets at the beginning pass";
        String testData = "[]We graduate in a little over a month and will make millions";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
    @Test
    public void testIfBracketsInTheMiddle() {
        String message = "Testing to see if brackets in the middle will pass";
        String testData = "We graduate in a little over[] a month and will make millions";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
    @Test
    public void testIfFourSetsOfBracketsWork() {
        String message = "Testing to see if 4 sets of brackets work";
        String testData = "[We graduate in a [little over[]] a month and [will] make Billions]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
    @Test
    public void testIfTwoInvertedBracketsWork() {
        String message = "Testing to see if two inverted Brackets work";
        String testData = "We graduate in a little over][ a month][ and will make millions";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }
    @Test
    public void testIfThreeAndTwoBracketsWork() {
        String message = "Testing to see if 3 and 2 brackets pass";
        String testData = "[[[We graduate in a little over a]] month and will make millions";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }
}