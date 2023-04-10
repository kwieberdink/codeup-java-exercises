import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {
        // ### Mini exercise: Hello, name
        //Write a Java program that asks the user for their name, then outputs "Hello, name", using .println, then using .printf

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String userName = scanner.next();
        System.out.println("Howdy there, " + userName);
        System.out.println("What's your full name?");
        String nextLine = scanner.nextLine();
        String fullName = scanner.nextLine();
        System.out.println("Hi, " + fullName);

    }

}
