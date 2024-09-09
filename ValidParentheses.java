/***
 * Question: Write a Java program that generates all valid combinations of the string pairs of
 * parentheses. Each combination should be unique and well-formed.
 * Owner Name: Affan Sayeed
 * Date: 9-9-2024
 */

import java.util.Scanner;

class ValidParentheses {

    // Swap elements at index i and j in the array
    public static void swap(char[] array, int start, int end) {
        char temporary = array[start];
        array[start] = array[end];
        array[end] = temporary;
    }

    // Generate all permutations of the given character array
    public static void generateCombinations(char[] inputChar, int start, int length) {
        printCombination(inputChar, start);

        for (int i = start; i < length; i++) {
            swap(inputChar, i, start);
            generateCombinations(inputChar, start + 1, length);
            swap(inputChar, i, start);
        }
    }

    // Print the current permutation up to the specified end index
    public static void printCombination(char[] chars, int end) {
        for (int i = 0; i < end; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String input;
        System.out.println(Constants.ENTER_STRING);
        input = userInput.next();
        char[] inputChar = input.toCharArray();
        generateCombinations(inputChar, 0, inputChar.length);
    }
}
