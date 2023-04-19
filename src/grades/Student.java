package grades;

abstract public class Student extends Students implements Measurable {

    protected String name;
    protected double[] grades;

// SETTER / GETTER START
    public String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public double[] getGrades() {
        return grades;
    }

    public  void setGrades(int grades) {
        this.grades = new double[0];
    }
// SETTER / GETTER END

// CONSTRUCTOR START
    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }
// CONSTRUCTOR END

}
