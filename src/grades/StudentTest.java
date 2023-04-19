package grades;

public class StudentTest {

    public static void main(String[] args) {

        Measurable myStudent;
        myStudent = new Kaeden("Kaeden", new double[]{95, 100, 86, 93});
        System.out.println("The average is: " + myStudent.getGradeAverage());
        System.out.println();
//        System.out.println("Adding grade: " + myStudent.addGrade(93));
    }

}
