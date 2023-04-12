package java1;

import java.util.Scanner;
public class ConsoleExercises {

    public static void main(String[] args) {
        // Exercise 1
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        // Exercise 2: 1
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.print("Enter a Integer: ");
        String userInputInteger = scanner.next();
        System.out.println("Your integer was: " + Integer.parseInt(userInputInteger));

        // Exercise 2: 2
        System.out.println("Enter three words: ");
        String wordOne = scanner.next();
        String wordTwo = scanner.next();
        String wordThree = scanner.next();
        System.out.printf("Your words were: %s, %s, and %s%n", wordOne, wordTwo, wordThree);

        // Exercise 2: 3
        System.out.println("Enter a sentence:");
        String userSentence = scanner.next();
        System.out.printf("User sentence: %s%n", userSentence);

        // Exercise 2: 4
        System.out.println("Enter a sentence:");
        String nextLine = scanner.nextLine();
        String userSentenceLine = scanner.nextLine();
        System.out.println("User sentence: " + userSentenceLine);

        // Exercise 3: 1
        System.out.println("Enter the length and width of the classroom");
        String userLength = scanner.nextLine();
        String userWidth = scanner.nextLine();
        System.out.printf("The length is %s meters and the width is %s meters.%n", Integer.parseInt(userLength), Integer.parseInt(userWidth));
        int userPerimeter = Integer.parseInt(userLength) * Integer.parseInt(userWidth);
        int userArea = (Integer.parseInt(userLength)*2) + (Integer.parseInt(userWidth)*2);
        System.out.printf("The area of the room is %s meters squared while the parimeter is %s meters", userArea, userPerimeter);;
    }

}
