import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
        // Exercise 1
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        for (int i = 0; i <= 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println("i is " + i);
//            }
//        }
//
//        for (int i = 100; i >= -10; i-=5) {
//            System.out.println("i is " + i);
//        }

        // no work
        for (int i = 2; i <= 100; i*=i) {
            System.out.println(i*i);
        }

        // Exercise 2
//        for (int i = 1; i <= 100; i++) {
//            if ( ((i % 5)==0) && ((i % 3)==0)) {
//                System.out.println("FizzBuzz ");
//            } else if (i % 5==0) {
//                System.out.println("Buzz ");
//            } else if((i % 3)==0) {
//                System.out.println("Fizz ");
//            } else {
//                System.out.println(i);
//            }
//        }

//        // Exercise 3
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int integer = scanner.nextInt();
//
//
//
//        // Exercise 4
//        System.out.println("Enter your Grade:");
//        int userGradeInput = Integer.parseInt(scanner.next());
//        if (userGradeInput >= 88 && userGradeInput <= 100) {
//            System.out.println("Grade: A");
//        } else if (userGradeInput >= 80 && userGradeInput <= 87) {
//            System.out.println("Grade: B");
//        } else if (userGradeInput >= 67 && userGradeInput <= 79) {
//            System.out.println("Grade: C");
//        } else if (userGradeInput >= 60 && userGradeInput <= 66) {
//            System.out.println("Grade: D");
//        } else {
//            System.out.println("Grade: F");
//        }

    }

}
