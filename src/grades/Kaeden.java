package grades;


public class Kaeden extends Student implements Measurable {

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGrades(int grades) {
        this.grades = new double[]{grades};
    }

    public Kaeden(String name, double[] grades) {
        super(name, grades);
    }

    @Override
    public double addGrade() {
        return 0;
    }

    @Override
    public double getGradeAverage() {
        double sum = 0;
        double average = 0;
        for(int i = 0; i < grades.length; i++){
            sum = sum + this.grades[i];
            average = sum / grades.length;
        }
        return average;
    }
}
