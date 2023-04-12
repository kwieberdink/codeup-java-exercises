package java1;

import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
//        System.out.println("Addition: " + addition(1,2));
//        System.out.println("Subtraction: " + subtraction(4,2));
//        System.out.println("Multiplication: " + multiplication(4,4));
//        System.out.println("Division: " + division(16,4));
//        System.out.println("Modulus: " + modulus(5,3));
//
//        int userInput = getInteger(1,10);
//        long factorial = getFactorial(userInput);
//        System.out.printf("Factorial => %d%n", factorial);

        int diceSides = getDiceSides();
        System.out.println(rollDice(diceSides));

    }
    // Exercise 1:
    public static int addition (int num1, int num2) {
        return num1 + num2;
    }
    public static int subtraction (int num1, int num2) {
        return num1 - num2;
    }
    public static int division (int num1, int num2) {
        return num1 / num2;
    }
    public static int modulus (int num1, int num2) {
        return num1 % num2;
    }
    public static int multiplication (int num1, int num2) {
        return num1 * num2;
    }
    public static int multiplicationRecursion (int num1, int num2) {
        int total = num1;
        if (num2 == 0) {
            return 0;
        }
        return total + multiplication(num1, num2 - 1);
    }

    // Exercise 2:
    public static int getInteger(int min, int max) {
        System.out.println("Enter a number between " + min + " and " + max + " : ");
        Scanner input = new Scanner(System.in);
        int userNum = input.nextInt();
        if (userNum >= min && userNum <= max) {
            return userNum;
        }
        return getInteger(min,max);
    }

    // Exercise 3:
    public static long getFactorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result*=i;
        }
        return result;
    }

    // Bonus 1:
    public static int getDiceSides() {
        int userChoice = getInteger(4, 20);
        return userChoice;
    }
    public static int randomNumber (int min, int max) {
        int result = (int)Math.floor(Math.random() * (max - min + 1) + min);
        return result;
    }
    public static String rollDice(int sides) {
        System.out.println("Do you want to roll the dice? [y/N]");
        Scanner input = new Scanner(System.in);
        String userChoice = input.nextLine();
        if (userChoice.equalsIgnoreCase("y")) {
            int result1 = randomNumber(1, sides);
            int result2 = randomNumber(1,sides);
            return "The first dice rolled a " + result1 + ". The second dice rolled a " + result2;
        }
        return "Fine. Go away.";
    }

    // Bonus 2:

}
