package grades;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static java.util.Map.entry;

// TODO: Create a class named GradesApplication with a main method. Inside the
//  main method, create a HashMap named students. It should have keys that are
//  strings that represent github usernames, and values that are Student objects.
//  Create at least 4 Student objects with at least 3 grades each, and add them
//  to the map.
//
//Be creative! Make up GitHub usernames and grades for your student objects.
public class GradesApplication {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        ArrayList<Integer> kaedenGrades = new ArrayList<>(List.of(95,89,69,70));
        Student kaeden = new Student("Kaeden", kaedenGrades);

        ArrayList<Integer> quintynGrades = new ArrayList<>(List.of(69,100,69,92));
        Student quintyn = new Student("Quintyn", quintynGrades);

        ArrayList<Integer> matthewGrades = new ArrayList<>(List.of(1600,69,69,1600));
        Student matthew = new Student("Matthew", matthewGrades);

        ArrayList<Integer> javierGrades = new ArrayList<>(List.of(89,99,69,79));
        Student javier = new Student("Matthew", javierGrades);

        Map <String, Student> studentMap = Map.ofEntries(
                entry("bologna-sandwich", kaeden),
                entry("quintyncode", quintyn),
                entry("1600_pen_drive", matthew),
                entry("java-fanatic", javier)
        );
// TODO: Print the list of GitHub usernames out to the console, and ask the user
//  which student they would like to see more information about. The user should
//  enter a GitHub username (i.e. one of the keys in your map). If the given input
//  does not match up with a key in your map, tell the user that no users with that
//  username were found. If the given username does exist, display information about
//  that student, including their name and their grades. After the information is
//  displayed, the application should ask the user if they want to continue, and
//  keep running so long as the answer is yes.

        System.out.println("Bienvenido!");
        System.out.println("Here are the GitHub usernames of our students: ");
        for (Map.Entry<String,Student> studentEntry : studentMap.entrySet()){
            System.out.printf(" | %s | ",studentEntry.getKey());
        }
        System.out.printf("%nWhat student would you like to see more information on?");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
    }

}
