package grades;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        ArrayList<Integer> kaedenGrades = new ArrayList<>(List.of(95,89,69,70));
        Student kaeden = new Student("Kaeden", kaedenGrades);
        students.add(kaeden);

        ArrayList<Integer> quintynGrades = new ArrayList<>(List.of(69,100,69,92));
        Student quintyn = new Student("Quintyn", quintynGrades);
        students.add(quintyn);

        ArrayList<Integer> matthewGrades = new ArrayList<>(List.of(1600,69,69,1600));
        Student matthew = new Student("Matthew", matthewGrades);
        students.add(matthew);

        for (Student kiddos : students){
            System.out.printf("%s has a grade average of %.0f%n", kiddos.getName(), kiddos.getGradeAverage() );
        }

    }

}
