package java1;

import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        System.out.println("Do you have a question for java1.Bob?");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        if (userInput.contains("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput.contains("?")) {
            System.out.println("Sure.");
        } else if (userInput.length() <= 3) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }


    }

}
