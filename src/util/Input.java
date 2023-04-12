package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner (System.in);

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Input(Scanner scanner) {
        this.scanner = scanner;
    }

    public static void main(String[] args) {
        System.out.println("Input an integer:");
    }

}
