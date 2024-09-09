/***
 * Question: Write a Java program that finds whether a given number can be expressed as the sum of two or
 * more consecutive natural numbers. If possible, the program should print all possible
 * combinations of consecutive natural numbers that sum up to the given number.
 * Owner Name: Affan Sayeed
 * Date: 9-9-2024
 */

import java.util.Scanner;

 class ConsecutiveNumber {
     // Find and print all possible combinations of consecutive natural numbers that sum up to the given number
    public static void findConsecutiveSums(int number) {
        for (int start = 1; start <= number / 2; start++) {
            int sum = 0;
            StringBuilder combination = new StringBuilder();
            for (int i = start; i <= number; i++) {
                sum += i;
                combination.append(i).append(" + ");
                if (sum == number) {
                    // Remove the extra " + " at the end
                    combination.delete(combination.length() - 3, combination.length());
                    System.out.println(combination.toString());
                    break;
                } else if (sum > number) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print(Constants.ENTER_POSITIVE_NUMBER);
        if (!userInput.hasNextInt()) {
            System.out.println(Constants.INTEGER_WARNING);
        }

        int number = userInput.nextInt();
        userInput.close();

        if (number <= 0) {
            System.out.println(Constants.ENTER_POSITIVE_NUMBER);
        } else {
            System.out.println(Constants.CONSECUTIVE_SUM + number + ":");
            findConsecutiveSums(number);
        }
    }
}