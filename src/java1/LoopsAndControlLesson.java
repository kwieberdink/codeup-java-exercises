package java1;

import java.util.Scanner;

public class LoopsAndControlLesson {

    public static void main(String[] args) {

        // ================== boolean expressions
        // >, >=, <, <=, ==, !=
        double discountPercentage = 2.3;
//        System.out.println(discountPercentage != 2.0);

        // ================== logical operators
        // &&, ||, &, |, !
//        System.out.println(discountPercentage > 3 && discountPercentage == 2.3);

        // ================== string comparison
//        String name = "Kaeden";
//        System.out.println(name == "Kaeden");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Continue? [y/n]");
//        String userInput = scanner.next();
//
//        boolean confirmation = userInput.equalsIgnoreCase("y");
//        System.out.println(confirmation);

        // ================== control structures
        // if, else if, else

//        if (/*condition*/) {
//            // conditional code
//        }
//        if (discountPercentage > 3) {
//            // conditional code
//            System.out.println("Discount percentage is, in fact, definitely greater than 2.");
//        }

        // switch

//        int caseSwitch = 1;
//        switch (caseSwitch) {
//            case 1:
//                System.out.println("Case 1");
//                break; // falls through with no break
//            case 2:
//                System.out.println("Case 2");
//                break;
//            default:
//                System.out.println("Default case");
//                break;
//        }

        // while loop

//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++; //shorthand is in java
//        }

        // do while loop

//        do {
//            System.out.println("i is " + i);
//            i++; //shorthand is in java
//        } while (i < 10) ;

        // for loop

//        for(int i = 0; i < 10; i++) {
//            System.out.println("i is " + i);
//        }

        // break and continue
        for(int i = 0; i < 10; i++) {
            System.out.println("i is " + i);
            if (i == 5) {
                break;
            }
        }

    }

}
