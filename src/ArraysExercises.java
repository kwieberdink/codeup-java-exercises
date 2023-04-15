// Exercise 1 on Java II: Arrays

import java.util.Arrays;

public class ArraysExercises {

    // Exercise 1 Start
    public static Person[] addPerson(Person[] peopleArray, Person newPerson) {
        Person[] newPersonArray = Arrays.copyOf(peopleArray, peopleArray.length + 1);
        newPersonArray[newPersonArray.length - 1] = newPerson;
        return newPersonArray;
    }

    // Start of Main
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

    // Exercise 1 Start
        // Created a list of new people with the desired parameters
        Person kaeden = new Person("Kaeden");
        Person jason = new Person("Jason");
        Person arusa = new Person("Arusa");
        Person yamba = new Person("Yamba");

        // Put each newly created person into a Person Array
        Person[] people = {kaeden,jason,arusa,yamba};

        // Looping through the Person Array to output each person
        for (Person person : people) {
            System.out.printf("Hello %s!%n", person.getName());
        }

        Person quintyn = new Person("Quintyn");
        Person[] newPersonArray = ArraysExercises.addPerson(people, quintyn);
        for (Person person : newPersonArray) {
            System.out.println(person.getName());
        }
    // Exercise 1 End
    }
    // End of Main


}
