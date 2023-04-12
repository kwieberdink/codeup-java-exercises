package java1;

import java.util.Scanner;

public class StringsLecture {

    public static void main(String[] args) {
//        String message = "Hello";
//        System.out.println(message.equalsIgnoreCase("Hello"));
//        System.out.println(message.startsWith("He"));
//        System.out.println(message.endsWith("llo"));

//        String password = "password";
        // One difference between JS and Java is that when calling
        // length, it needs to be a method
//        System.out.println(password.length() > 7);

        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to conitnue? [y/N]");
        String userChoice = input.nextLine();
        String message2 = "This is my message";
        // Showing indexOf: returns the character at a specified index of the string
        int position = message2.indexOf("my");
        System.out.println(position);
        // Showing Replace: Returns a copy of the string with declared replacement
//        System.out.println(message2.replace("my", "your"));
        // Showing toLowerCase: Returns a copy of the string with all lower case
//        System.out.println(message2.toLowerCase());
        // Showing toUpperCase: Returns a copy of the string with all upper case
//        System.out.println(message2.toUpperCase());
        // Showing Trim: Returns a copy of the string without leading and trailing whitespaces
        System.out.println(userChoice.trim().equalsIgnoreCase("Y"));
        // Showing charAt: Returns the character at the specified index of the string
        System.out.println(message2.charAt(2));




    }

}
