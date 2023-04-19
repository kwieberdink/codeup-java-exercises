package grades;

import java.util.ArrayList;

// TODO: Create a class named Student. It should have private properties for the
//  student's name, and grades. The grades property should be an ArrayList of
//  integers. The student class should have a constructor that sets name property
//  and initializes the grades property as an empty ArrayList. The Student class
//  should have the following methods:

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> setGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public double getGradeAverage() {
        double sum = 0;
        double average = 0;
        for(int i = 0; i < grades.size(); i++){
            sum = sum + grades.get(i);
            average = sum / grades.size();
        }
        return average;
    }

    public void addGrade (int grade) {
        this.grades.add(grade);
    }


}
