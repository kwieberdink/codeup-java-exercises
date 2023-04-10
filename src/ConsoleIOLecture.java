import java.util.Scanner;
public class ConsoleIOLecture {

    public static void main(String[] args) {
        String cohort = "Bigfoot";
        // %s is a placeholder,
        String timeOfDay = "afternoon";
        int week = 9;
        System.out.printf("Good %s, %s!%n", timeOfDay, cohort);
        System.out.printf("This is the %dth week of %s cohort.%n", week, cohort);
        float myFloat = 123.456F; // Float type required an F after the integer input
        System.out.printf("The number is %-11.2f%n", myFloat);
        System.out.println("Will this be a new line?");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String userInput = scanner.next();
//        System.out.println("The user entered: " + userInput);
        System.out.printf("Your string was: %s", userInput);


    }

}
