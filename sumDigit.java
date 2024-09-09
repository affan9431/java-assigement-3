/***
 * Question: Write a Java program that continuously takes a number as input and replaces it with the sum of
 * its digits until the number is reduced to a single digit.
 * Owner Name: Affan Sayeed
 * Date: 9-9-2024
 */

import java.util.Scanner;

class sumDigit {

    // Calculate the sum of the digits of a given number
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    // Continuously reduce the number to a single digit by summing its digits
    public static void reduceToSingleDigit(int number) {
        System.out.println(Constants.INITIAL_NUMBER + number);

        while (number >= 10) {
            number = sumOfDigits(number);
            System.out.println(Constants.INTERMEDIATE_RESULT + number);
        }

        System.out.println(Constants.SINGLE_DIGIT_NUMBER + number);
    }

    // Process the user's input to continuously prompt for valid numbers
    public static void processNumber() {
        Scanner userInput = new Scanner(System.in);
        System.out.println(Constants.ENTER_POSITIVE_NUMBER);
        if (!userInput.hasNextInt()) {
            System.out.println(Constants.INTEGER_WARNING);
        }

        int number = userInput.nextInt();

        if (number <= 0) {
            System.out.println(Constants.ENTER_POSITIVE_NUMBER);
        } else {
            reduceToSingleDigit(number);
        }
    }

    public static void main(String[] args) {
        processNumber();
    }
}
