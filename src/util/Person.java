package util;

public class Person {
    // Exercise 1:
    // private string name
    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Print message to the console w/ person's name
    public void sayHello() {
        System.out.printf("Hello, %s!", name);
    }
    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
    // Exercise 1:
        // Code Block 1
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); // true
//        System.out.println(person1 == person2); // false
//
//        // Code Block 2
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); // true

        // Code Block 3
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); // outputs John
//        System.out.println(person2.getName()); // outputs John
//        person2.setName("Jane");
//        System.out.println(person1.getName()); // outputs Jane
//        System.out.println(person2.getName()); // outputs Jane

    }

}
