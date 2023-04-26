package javaAssessmentPractice;

public class Pet {

    protected String name;
    protected String type;

    // GETTER / SETTER START
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    // GETTER / SETTER END


    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
