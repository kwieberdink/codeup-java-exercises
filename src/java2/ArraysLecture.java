package java2;

import rpg.Monster;
import java.util.Arrays;

public class ArraysLecture {
    public static void main(String[] args) {
        // Declaring the size of the array
        // Once you declare the size of the array, then you are unable to add additional objects to the array
        int sizeOfArray = 5;
        // can input variables into the size of the array, or input an integer straight into the array below.
        // Array Variable Declaration
        int[] numbers = new int[sizeOfArray];
        numbers[0] = 42;
        numbers[1] = 567;
        numbers[2] = 457;
        numbers[3] = -560;
        numbers[4] = 1267;

        Arrays.sort(numbers);

//        numbers[5] = 200; // Adding another element that is outside the range of the array will cause an ArrayIndexOutOfBoundsException error.

        // Array Initializer Syntax
        int[] moreNumbers = {45, 56, 67, 78};
        System.out.println(moreNumbers[2]);
        System.out.println(numbers[2]);

        // Enhanced for loop:
        // for (data-type-of-element variableName :
                    // what we're looping over
        for (int number : numbers) {
            System.out.println(number);
        }
        // "Loop over the numbers array
        // On each loop, pull out an int element and call it 'number'"
        for (int number : numbers) {
            number *= number;
            System.out.println(number);
        }

        // For loop
        for (int i = 0; i < moreNumbers.length; i++) {
            System.out.printf("The number at index %d is %d%n", i, moreNumbers[i]);
        }

        String[] fruits = {"lemon","tangerine","mango","banana","avocado"};
        System.out.println(fruits[1]);

        // When doing printf format, you have to use the proper conversion-character.
            // %d : decimal integer [byte, short, int, long]
            // %f : floating-point number [float, double]
            // %c : character Capital C will uppercase the letter
            // %s : String Capital S will uppercase all the letters in the string
            // %h : hashcode A hashcode is like an address. This is useful for printing a reference
            // %n : newline Platform specific newline character-use %n instead of \n for greater compatibility
        for (String fruit : fruits) {
            System.out.printf("I enjoy eating fruit, especially %s%n", fruit);
        }

        for (int i = 0; i < fruits.length; i++) {
            System.out.printf("I like to eat %s%n", fruits[i]);
        }

        Monster orc = new Monster("Orc", 13, 15, 9);
        Monster ogre = new Monster("Ogre", 11, 59, 13);
        Monster blueDragon = new Monster("Blue Dragon", 19, 225, 23);

        Monster[] monsters = {orc, ogre, blueDragon};

        for(Monster monster : monsters) {
            System.out.printf("%s has %d hit points%n", monster.getName(), monster.getHitPoints());
        }



    }
}
