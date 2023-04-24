package java2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;


public class FileIOLecture {

    public static void main(String[] args) {
        String directory = "data";
        String filename = "groceries.txt";

        // Obtaining the directory
        // Website generation and creating job automation
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        // Letting you know that it needs to be able to handle an exception (try/catch)
        // Get a little specific with the try/catch to know where an exception occurs
        if (Files.notExists(dataDirectory)) {
            try {
                Files.createDirectories(dataDirectory);
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
        if (!Files.exists(dataFile)) {
            try {
                Files.createFile(dataFile);
            } catch(IOException e) {
                e.printStackTrace();
            }
        }

        // The directory and the file definitely exist now
        List <String> groceryList = Arrays.asList("Coffee", "Milk", "Double Stuff Oreos");
        System.out.println(groceryList);
        try {
            Files.write(dataFile, groceryList);
            List<String> moreGroceries = Arrays.asList("Peanut Oil", "Flour", "Eggs");
            Files.write(dataFile,
                    moreGroceries,
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
        // The grocery list is definitely created now
        try {
            List<String> groceryListFromFile = Files.readAllLines(dataFile);
            System.out.println(groceryListFromFile);
            for ( int i= 1; i <= groceryListFromFile.size(); i++ ) {
                System.out.println(i + ": " + groceryListFromFile.get(i-1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
